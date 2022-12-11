enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)
scalaJSUseMainModuleInitializer := true

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root: Project = (project in file("."))
  .settings(
    name := "scala-js-example",
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.3.0",
      "org.scala-js" %% "scalajs-library" % "1.12.0",
      "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1"
    )
  )

Compile / npmDependencies ++= Seq(
  "react" -> "17.0.2",
  "react-dom" -> "17.0.2",
  "snabbdom" -> "3.5.1"
)

jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()