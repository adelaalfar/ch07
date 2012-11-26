package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import play.libs.F.*;
/**
 * 
 */
@Entity 
public class Product extends Model implements play.mvc.QueryStringBindable<Product> {

  public Product() {}
 
  @Override
  public Option<Product> bind(String key, Map<String, String[]> data) {
   return Option.Some(find.byId(Long.valueOf(data.get(key)[0]))); 
  }

 @Override
 public String unbind(String key) {
   return this.ean;
 }

 @Override
 public String javascriptUnbind() {
   return this.ean;
 }

    @Id @GeneratedValue
    public Long id;
    
    public String ean;
    
    @Constraints.Required
    public String name;
   
    public String description;
    
    @play.data.format.Formats.DateTime(pattern = "yyyy-MM-dd")
    public Date date;
    
    @ManyToMany(cascade = CascadeType.ALL)
    public List<Tag> tags;
    
    @Lob
    public byte[] picture;
    
    public static Model.Finder<Long,Product> find = new Model.Finder(Long.class, Product.class);
 
    public void saveOrUpdate() {
       
       if (id == null) { 
           save();
       } else {
           update();
       }
       saveManyToManyAssociations("tags");
    } 
    
    
    public String toString() {
        return "id: " + id + ", ean: " + ean + ", name: " + name + ", description: " + description + ", date: " + date + ", tags " + tags;
    }
}