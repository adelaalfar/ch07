
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
object products extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[java.util.List[models.Product],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(products: java.util.List[models.Product]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>All product</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.119*/(""""/>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/main.css"))),format.raw/*9.94*/("""">
  		<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.55*/routes/*10.61*/.Assets.at("images/favicon.png"))),format.raw/*10.93*/("""">
        <script src=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*11.74*/("""" type="text/javascript"></script>
    </head>
    <body>
       	"""),_display_(Seq[Any](/*14.10*/if(flash.containsKey("success"))/*14.42*/ {_display_(Seq[Any](format.raw/*14.44*/("""
	        <div class="alert alert-success">
	            <strong></strong> """),_display_(Seq[Any](/*16.33*/flash/*16.38*/.get("success"))),format.raw/*16.53*/("""
	        </div>
	    """)))})),format.raw/*18.7*/(""" 
	    
		<h1>All products</h1>
		
		<table class="table table-striped">
			<thead>
	    			<tr>
	    				<th>#</th>
	      			<th>Name</th>
	      			<th>Ean</th>
	      			<th>Description</th>
	      		
	    			</tr>
	  		</thead>
	  		<tbody>
	  			"""),_display_(Seq[Any](/*33.8*/for(i <- 0 until products.size) yield /*33.39*/ {_display_(Seq[Any](format.raw/*33.41*/("""
			    		<tr>
			    		<td>"""),_display_(Seq[Any](/*35.15*/(i + 1))),format.raw/*35.22*/("""</td>
			      		<td><a href=""""),_display_(Seq[Any](/*36.26*/routes/*36.32*/.Product.edit(products(i)))),format.raw/*36.58*/("""">"""),_display_(Seq[Any](/*36.61*/products(i)/*36.72*/.name)),format.raw/*36.77*/("""</a></td>
			      		<td>"""),_display_(Seq[Any](/*37.17*/products(i)/*37.28*/.ean)),format.raw/*37.32*/("""</td>
			      		<td>"""),_display_(Seq[Any](/*38.17*/products(i)/*38.28*/.description)),format.raw/*38.40*/("""</td>
			      	
			    		</tr>
		    		""")))})),format.raw/*41.10*/("""
	  		</tbody>
		</table>
		  
    </body>
</html>
"""))}
    }
    
    def render(products:java.util.List[models.Product]) = apply(products)
    
    def f:((java.util.List[models.Product]) => play.api.templates.Html) = (products) => apply(products)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 10 21:56:41 CEST 2012
                    SOURCE: /Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/app/views/products.scala.html
                    HASH: 03084df5199672979422e9175b107aa7dd0366ce
                    MATRIX: 782->1|901->43|1077->184|1091->190|1156->233|1248->290|1262->296|1317->330|1410->387|1425->393|1479->425|1540->450|1555->456|1622->501|1725->568|1766->600|1806->602|1918->678|1932->683|1969->698|2023->721|2311->974|2358->1005|2398->1007|2463->1036|2492->1043|2559->1074|2574->1080|2622->1106|2661->1109|2681->1120|2708->1125|2770->1151|2790->1162|2816->1166|2874->1188|2894->1199|2928->1211|3001->1252
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|43->14|43->14|43->14|45->16|45->16|45->16|47->18|62->33|62->33|62->33|64->35|64->35|65->36|65->36|65->36|65->36|65->36|65->36|66->37|66->37|66->37|67->38|67->38|67->38|70->41
                    -- GENERATED --
                */
            