import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "p2_1_hello"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
