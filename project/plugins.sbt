val scalajsBundler: String = "0.21.1"

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.12.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % scalajsBundler)

libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0"
