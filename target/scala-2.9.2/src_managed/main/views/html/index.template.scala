
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.0 RC1")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
    
    """),_display_(Seq[Any](/*5.6*/play20/*5.12*/.welcome(message))),format.raw/*5.29*/("""
    
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 10 21:56:41 CEST 2012
                    SOURCE: /Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/app/views/index.scala.html
                    HASH: 5a6c7eabb15a5844d0876bcdc0ab294054470a05
                    MATRIX: 755->1|849->18|886->21|925->52|964->54|1009->65|1023->71|1061->88
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|34->5
                    -- GENERATED --
                */
            