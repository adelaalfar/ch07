// @SOURCE:/Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/conf/routes
// @HASH:67836b155e6451e0f60a9779e7edf8d80fbe4d3e
// @DATE:Wed Aug 01 21:53:45 CEST 2012


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Product_list0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("id", """[^/]+"""),StaticPart("/items"))))
          

// @LINE:7
private[this] lazy val controllers_Product_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
          

// @LINE:8
private[this] lazy val controllers_Product_all2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("products"))))
          

// @LINE:9
private[this] lazy val controllers_Product_edit3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product"))))
          

// @LINE:10
private[this] lazy val controllers_Product_newInstance4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/new"))))
          

// @LINE:12
private[this] lazy val controllers_Product_picture5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("picture/"),DynamicPart("ean", """[^/]+"""))))
          

// @LINE:13
private[this] lazy val controllers_Product_save6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/save"))))
          

// @LINE:14
private[this] lazy val controllers_Product_save7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("product/save"))))
          

// @LINE:17
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
          
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$id<[^/]+>/items""","""controllers.Product.list(id:Long)"""),("""GET""", prefix,"""controllers.Product.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """products""","""controllers.Product.all()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product""","""controllers.Product.edit(id:models.Product)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/new""","""controllers.Product.newInstance()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """picture/$ean<[^/]+>""","""controllers.Product.picture(ean:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/save""","""controllers.Product.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """product/save""","""controllers.Product.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
         
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Product_list0(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Product.list(id), HandlerDef(this, "controllers.Product", "list", Seq(classOf[Long])))
   }
}
          

// @LINE:7
case controllers_Product_index1(params) => {
   call { 
        invokeHandler(_root_.controllers.Product.index(), HandlerDef(this, "controllers.Product", "index", Nil))
   }
}
          

// @LINE:8
case controllers_Product_all2(params) => {
   call { 
        invokeHandler(_root_.controllers.Product.all(), HandlerDef(this, "controllers.Product", "all", Nil))
   }
}
          

// @LINE:9
case controllers_Product_edit3(params) => {
   call(params.fromQuery[models.Product]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Product.edit(id), HandlerDef(this, "controllers.Product", "edit", Seq(classOf[models.Product])))
   }
}
          

// @LINE:10
case controllers_Product_newInstance4(params) => {
   call { 
        invokeHandler(_root_.controllers.Product.newInstance(), HandlerDef(this, "controllers.Product", "newInstance", Nil))
   }
}
          

// @LINE:12
case controllers_Product_picture5(params) => {
   call(params.fromPath[String]("ean", None)) { (ean) =>
        invokeHandler(_root_.controllers.Product.picture(ean), HandlerDef(this, "controllers.Product", "picture", Seq(classOf[String])))
   }
}
          

// @LINE:13
case controllers_Product_save6(params) => {
   call { 
        invokeHandler(_root_.controllers.Product.save(), HandlerDef(this, "controllers.Product", "save", Nil))
   }
}
          

// @LINE:14
case controllers_Product_save7(params) => {
   call { 
        invokeHandler(_root_.controllers.Product.save(), HandlerDef(this, "controllers.Product", "save", Nil))
   }
}
          

// @LINE:17
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
          
}
    
}
          