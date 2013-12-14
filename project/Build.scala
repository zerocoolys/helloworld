// import sbt._
// import Keys._
// import play.Project._
// import com.github.play2war.plugin._

// object ApplicationBuild extends Build {

//   val appName         = "Test_App"
//   val appVersion      = "1.0-SNAPSHOT"

//   val appDependencies = Seq(
//     // Add your project dependencies here,

//     jdbc,
//     anorm
//   )


//   val main = play.Project(appName, appVersion, appDependencies, mainLang = JAVA)
//   .settings(Play2WarPlugin.play2WarSettings: _*)

//   .settings(
//     Play2WarKeys.servletVersion := "3.0"
//     )
   

// }


import sbt._
import Keys._
import play.Project._
import com.github.play2war.plugin._
//import com.typesafe.sbt.SbtAtmosPlay.atmosPlaySettings

object ApplicationBuild extends Build {

  val appName         = "test"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(    
    "com.typesafe.akka" %% "akka-remote" % "2.2.0",
    "com.typesafe.akka" %% "akka-cluster" % "2.2.0",
    "com.typesafe.akka" %% "akka-contrib" % "2.2.0",
    "com.typesafe" %% "play-plugins-mailer" % "2.1-RC2"   
  )


  val main = play.Project(appName, appVersion, appDependencies)//.settings(atmosPlaySettings: _*)
  .settings(Play2WarPlugin.play2WarSettings: _*).settings(
    Keys.fork in (Test) := false,
    scalaVersion := "2.10.2",
    Play2WarKeys.servletVersion := "3.0",
    resolvers := Seq(
      "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
      "Sonatype Groups" at "https://oss.sonatype.org/content/groups/public/",
      "Twitter4J" at "http://twitter4j.org/maven2",
      "Maven central" at "http://repo1.maven.org/maven2/",
      "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository",
      Resolver.url("local-ivy", new URL("file://" + Path.userHome.absolutePath + "/.ivy2/local"))(Resolver.ivyStylePatterns),
      Resolver.url("local-ivy-cache", new URL("file://" + Path.userHome.absolutePath + "/.ivy2/cache"))(Resolver.ivyStylePatterns)
    )
  )

}
