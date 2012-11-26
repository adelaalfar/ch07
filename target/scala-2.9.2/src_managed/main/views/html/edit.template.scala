
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
object edit extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[models.Product],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(productForm: Form[models.Product]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.37*/("""
<!DOCTYPE html>
<html>
    <head>
        <title>Edit """),_display_(Seq[Any](/*5.22*/productForm("name")/*5.41*/.valueOr("New"))),format.raw/*5.56*/(""" product</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.70*/routes/*6.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*6.119*/(""""/>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.54*/routes/*7.60*/.Assets.at("stylesheets/main.css"))),format.raw/*7.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png"))),format.raw/*8.97*/("""">
        <script src=""""),_display_(Seq[Any](/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*9.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*12.10*/if(flash.containsKey("success"))/*12.42*/ {_display_(Seq[Any](format.raw/*12.44*/("""
            <div class="alert alert-success">
                <strong></strong> """),_display_(Seq[Any](/*14.36*/flash/*14.41*/.get("success"))),format.raw/*14.56*/("""
            </div>
        """)))})),format.raw/*16.10*/(""" 
        <form class="register form-horizontal" action=""""),_display_(Seq[Any](/*17.57*/routes/*17.63*/.Product.save())),format.raw/*17.78*/("""" method="POST" enctype="multipart/form-data">
            <fieldset>
                <input type="hidden" value=""""),_display_(Seq[Any](/*19.46*/productForm("id")/*19.63*/.value)),format.raw/*19.69*/("""" name="id">
                <legend style="margin-left: 20px">Edit """),_display_(Seq[Any](/*20.57*/productForm("name")/*20.76*/.valueOr("New"))),format.raw/*20.91*/(""" product</legend>
               
                <div class="control-group """),_display_(Seq[Any](/*22.44*/if(productForm("name").hasErrors)/*22.77*/{_display_(Seq[Any](format.raw/*22.78*/(""" error """)))})),format.raw/*22.86*/("""">
                    <div class="controls">
                        <input type="text" value=""""),_display_(Seq[Any](/*24.52*/productForm("name")/*24.71*/.value)),format.raw/*24.77*/("""" name="name" placeholder="Product name"  >
                        <p class="help-inline"><small>Required</small></p>
                    </div>
                </div>
                <div class="control-group """),_display_(Seq[Any](/*28.44*/if(productForm("ean").hasErrors)/*28.76*/{_display_(Seq[Any](format.raw/*28.77*/(""" error """)))})),format.raw/*28.85*/("""">
                    <div class="controls">
                        <input type="text" value=""""),_display_(Seq[Any](/*30.52*/productForm("ean")/*30.70*/.value)),format.raw/*30.76*/("""" name="ean" placeholder="Product ean"  >
                        <p class="help-inline"><small>Required</small></p>
                    </div>
                </div>
                <div class="control-group """),_display_(Seq[Any](/*34.44*/if(productForm("description").hasErrors)/*34.84*/{_display_(Seq[Any](format.raw/*34.85*/(""" error """)))})),format.raw/*34.93*/("""">
                        <div class="controls">
                            <textarea type="text" name="description" placeHolder="Enter the product description">"""),_display_(Seq[Any](/*36.115*/productForm("description")/*36.141*/.value)),format.raw/*36.147*/("""</textarea>
                           
                        </div>
                  </div>
                
                  <div class="control-group ">
                        <div class="controls">
                              <input name="tags[0].id" value="1" type="checkbox" """),_display_(Seq[Any](/*43.83*/for(i <- 0 to 2) yield /*43.99*/ {_display_(Seq[Any](format.raw/*43.101*/(""" """),_display_(Seq[Any](/*43.103*/if(productForm("tags[" + i + "]").value!=null && productForm("tags[" + i + "]").value == "1")/*43.196*/ {_display_(Seq[Any](format.raw/*43.198*/(""" checked """)))}))))})),format.raw/*43.209*/("""> Steal
                              <input name="tags[1].id" value="2" type="checkbox" """),_display_(Seq[Any](/*44.83*/for(i <- 0 to 2) yield /*44.99*/ {_display_(Seq[Any](format.raw/*44.101*/(""" """),_display_(Seq[Any](/*44.103*/if(productForm("tags[" + i + "]").value!=null && productForm("tags[" + i + "]").value == "2")/*44.196*/ {_display_(Seq[Any](format.raw/*44.198*/(""" checked """)))}))))})),format.raw/*44.209*/("""> Plastic
                              <input name="tags[2].id" value="3" type="checkbox" """),_display_(Seq[Any](/*45.83*/for(i <- 0 to 2) yield /*45.99*/ {_display_(Seq[Any](format.raw/*45.101*/(""" """),_display_(Seq[Any](/*45.103*/if(productForm("tags[" + i + "]").value!=null && productForm("tags[" + i + "]").value == "3")/*45.196*/ {_display_(Seq[Any](format.raw/*45.198*/(""" checked """)))}))))})),format.raw/*45.209*/("""> Metal
                        </div>
                    </div>
            </fieldset>
            <div class="form-actions">
                <input type="submit" value=""""),_display_(Seq[Any](/*50.46*/if(productForm("name").value!=null)/*50.81*/ {_display_(Seq[Any](format.raw/*50.83*/(""" Save """)))}/*50.91*/else/*50.96*/{_display_(Seq[Any](format.raw/*50.97*/(""" Create """)))})),format.raw/*50.106*/(""" " class="btn btn-primary">
            </div>
        </form>
    </body>
</html>
"""))}
    }
    
    def render(productForm:Form[models.Product]) = apply(productForm)
    
    def f:((Form[models.Product]) => play.api.templates.Html) = (productForm) => apply(productForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Sep 10 21:56:41 CEST 2012
                    SOURCE: /Users/nicolasleroux/Projects/Personal/sample_book/ch07.1 displaying new product form/app/views/edit.scala.html
                    HASH: 4bf120d523dd5c48528b8b861b2fb0c8db1b0be0
                    MATRIX: 768->1|880->36|971->92|998->111|1034->126|1155->212|1169->218|1234->261|1326->318|1340->324|1395->358|1491->419|1505->425|1558->457|1618->482|1632->488|1698->533|1801->600|1842->632|1882->634|2000->716|2014->721|2051->736|2112->765|2206->823|2221->829|2258->844|2409->959|2435->976|2463->982|2568->1051|2596->1070|2633->1085|2746->1162|2788->1195|2827->1196|2867->1204|3000->1301|3028->1320|3056->1326|3304->1538|3345->1570|3384->1571|3424->1579|3557->1676|3584->1694|3612->1700|3858->1910|3907->1950|3946->1951|3986->1959|4187->2123|4223->2149|4252->2155|4577->2444|4609->2460|4650->2462|4689->2464|4792->2557|4833->2559|4881->2570|5007->2660|5039->2676|5080->2678|5119->2680|5222->2773|5263->2775|5311->2786|5439->2878|5471->2894|5512->2896|5551->2898|5654->2991|5695->2993|5743->3004|5953->3178|5997->3213|6037->3215|6063->3223|6076->3228|6115->3229|6157->3238
                    LINES: 27->1|30->1|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|41->12|41->12|41->12|43->14|43->14|43->14|45->16|46->17|46->17|46->17|48->19|48->19|48->19|49->20|49->20|49->20|51->22|51->22|51->22|51->22|53->24|53->24|53->24|57->28|57->28|57->28|57->28|59->30|59->30|59->30|63->34|63->34|63->34|63->34|65->36|65->36|65->36|72->43|72->43|72->43|72->43|72->43|72->43|72->43|73->44|73->44|73->44|73->44|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|74->45|74->45|79->50|79->50|79->50|79->50|79->50|79->50|79->50
                    -- GENERATED --
                */
            