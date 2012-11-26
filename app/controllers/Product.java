package controllers;

import java.util.ArrayList;
import java.util.List;

import models.StockItem;

import org.apache.commons.lang.StringUtils;
import play.mvc.*;

import play.data.*;
import play.*;
import views.html.*;
import java.lang.annotation.*;
import java.text.*;
import java.util.*;
import play.data.format.*;
import java.io.*;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import org.apache.commons.io.IOUtils;

public class Product extends Controller {
    
    
  public static Result index() {
      return redirect(routes.Product.list(1));
  }

  public static Result list(Long warehouseId) {
    List<StockItem> stockItems = StockItem.find.fetch("product").where().eq("warehouse.id", warehouseId).findList();
    return ok(stockitems.render(stockItems));
  }
  
  public static Result newInstance() {
    Form<models.Product> productForm = form(models.Product.class);
    return ok(edit.render(productForm));
  }
  
  public static Result edit(models.Product productBinder) {
      Form<models.Product> productForm = form(models.Product.class);
      //models.Product product = models.Product.find.where().eq("ean", ean).findUnique();
      productForm = productForm.fill(productBinder);
      return ok(edit.render(productForm));
    }
  

  public static Result all() {
    List<models.Product> allProducts = models.Product.find.all();
    return ok(products.render(allProducts));
  }

  public static Result show(String ean) {
    return ok();
  }

  public static Result save() {
    MultipartFormData body = request().body().asMultipartFormData();
    FilePart picture = body.getFile("picture");
    Form<models.Product> productForm = form(models.Product.class).bindFromRequest();
    models.Product newProduct = productForm.get();
    if (picture != null) {
       String fileName = picture.getFilename();
       String contentType = picture.getContentType(); 
       File file = picture.getFile();
       try {
       newProduct.picture = IOUtils.toByteArray(new FileInputStream(file));
       } catch(Exception e) {
           e.printStackTrace();
       }
    } 
    List<models.Tag> tags = new ArrayList<models.Tag>();
    for (models.Tag tag : newProduct.tags) {
        // Load our tag
        if (tag.id != null && tag.id != -1) {
            tags.add(models.Tag.find.byId(tag.id));
        }
        Logger.info("tag " + tag.id + " " + tag);
    }
    newProduct.tags = tags;
    newProduct.saveOrUpdate();
    return redirect(routes.Product.all());
  }
  
 
  public static Result picture(String ean) {
     models.Product product = models.Product.find.where().eq("ean", ean).findUnique();
     return ok(product.picture);
      
  }
} 