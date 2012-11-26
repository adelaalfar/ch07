import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "book"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
       "commons-io" % "commons-io" % "2.3",
       "commons-lang" % "commons-lang" % "2.6"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    )

}
