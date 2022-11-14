enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "scala-js-example",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.3.0"
  )

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()