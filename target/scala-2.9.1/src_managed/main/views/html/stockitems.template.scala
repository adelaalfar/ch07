
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
object stockitems extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[java.util.List[models.StockItem],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(stockItems: java.util.List[models.StockItem]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Product overview</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
       <ul>
	    """),_display_(Seq[Any](/*14.7*/for(stockItem <- stockItems) yield /*14.35*/ {_display_(Seq[Any](format.raw/*14.37*/(""" 
	   	   <li>"""),_display_(Seq[Any](/*15.14*/stockItem/*15.23*/.product.name)),format.raw/*15.36*/(""" ("""),_display_(Seq[Any](/*15.39*/stockItem/*15.48*/.quantity)),format.raw/*15.57*/(""")</li>
	    """)))})),format.raw/*16.7*/("""
	  </ul>
    </body>
</html>

"""))}
    }
    
    def render(stockItems:java.util.List[models.StockItem]) = apply(stockItems)
    
    def f:((java.util.List[models.StockItem]) => play.api.templates.Html) = (stockItems) => apply(stockItems)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 01 15:47:00 CEST 2012
                    SOURCE: /Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/app/views/stockitems.scala.html
                    HASH: 8c531da6249b6b2033fede54cc1dc0e98bc612a4
                    MATRIX: 786->1|909->47|1074->177|1088->183|1143->217|1239->278|1253->284|1306->316|1367->341|1382->347|1449->392|1560->468|1604->496|1644->498|1695->513|1713->522|1748->535|1787->538|1805->547|1836->556|1880->569
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|43->14|43->14|43->14|44->15|44->15|44->15|44->15|44->15|44->15|45->16
                    -- GENERATED --
                */
            