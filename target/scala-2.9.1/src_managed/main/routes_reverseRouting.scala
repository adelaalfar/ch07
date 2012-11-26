// @SOURCE:/Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/conf/routes
// @HASH:67836b155e6451e0f60a9779e7edf8d80fbe4d3e
// @DATE:Wed Aug 01 21:53:45 CEST 2012


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseProduct {
    


 
// @LINE:12
def picture(ean:String): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + "picture/" + implicitly[PathBindable[String]].unbind("ean", ean))
}
                                                        
 
// @LINE:14
// @LINE:13
def save(): Call = {
   () match {
// @LINE:13
case () if true => Call("POST", Routes.prefix + { Routes.defaultPrefix} + "product/save")
                                                                
// @LINE:14
case () if true => Call("GET", Routes.prefix + { Routes.defaultPrefix} + "product/save")
                                                                    
   }
}
                                                        
 
// @LINE:9
def edit(id:models.Product): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + "product" + queryString(List(Some(implicitly[QueryStringBindable[models.Product]].unbind("id", id)))))
}
                                                        
 
// @LINE:7
def index(): Call = {
   Call("GET", Routes.prefix)
}
                                                        
 
// @LINE:6
def list(id:Long): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + implicitly[PathBindable[Long]].unbind("id", id) + "/items")
}
                                                        
 
// @LINE:10
def newInstance(): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + "product/new")
}
                                                        
 
// @LINE:8
def all(): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + "products")
}
                                                        

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(file:String): Call = {
   Call("GET", Routes.prefix + { Routes.defaultPrefix} + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseProduct {
    


 
// @LINE:12
def picture : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.picture",
   """
      function(ean) {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "picture/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("ean", ean)})
      }
   """
)
                                
 
// @LINE:14
// @LINE:13
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.save",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "product/save"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "product/save"})
      }
      }
   """
)
                                
 
// @LINE:9
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "product" + _qS([(""" + implicitly[QueryStringBindable[models.Product]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                                
 
// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + Routes.prefix + """"})
      }
   """
)
                                
 
// @LINE:6
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.list",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/items"})
      }
   """
)
                                
 
// @LINE:10
def newInstance : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.newInstance",
   """
      function() {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "product/new"})
      }
   """
)
                                
 
// @LINE:8
def all : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Product.all",
   """
      function() {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "products"})
      }
   """
)
                                

                      
    
}
                

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + Routes.prefix + { Routes.defaultPrefix} + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                

                      
    
}
                
}
          


// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseProduct {
    


 
// @LINE:12
def picture(ean:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.picture(ean), HandlerDef(this, "controllers.Product", "picture", Seq(classOf[String]))
)
                              
 
// @LINE:13
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.save(), HandlerDef(this, "controllers.Product", "save", Seq())
)
                              
 
// @LINE:9
def edit(id:models.Product): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.edit(id), HandlerDef(this, "controllers.Product", "edit", Seq(classOf[models.Product]))
)
                              
 
// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.index(), HandlerDef(this, "controllers.Product", "index", Seq())
)
                              
 
// @LINE:6
def list(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.list(id), HandlerDef(this, "controllers.Product", "list", Seq(classOf[Long]))
)
                              
 
// @LINE:10
def newInstance(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.newInstance(), HandlerDef(this, "controllers.Product", "newInstance", Seq())
)
                              
 
// @LINE:8
def all(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Product.all(), HandlerDef(this, "controllers.Product", "all", Seq())
)
                              

                      
    
}
                            

// @LINE:17
class ReverseAssets {
    


 
// @LINE:17
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
        