// Comment to get more information during initialization
logLevel := Level.Debug

// The Typesafe repository
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % System.getProperty("play.version"))

// play2war
// addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "1.2-beta1")



// For running project, comment at the time of making war.
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.1")


///////////////////////////
// WARNING: only for making the war
////////////////////////////
//addSbtPlugin("play" % "sbt-plugin" % "2.1.3")

// build infomation
//addSbtPlugin("play" % "sbt-plugin" % "2.2.1")


addSbtPlugin("com.github.play2war" % "play2-war-plugin" % "1.2-beta1")
////////////////////////////
