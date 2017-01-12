name := "$name$"
organization := "$organization$"
version := "$version$"
scalaVersion := "2.12.1"

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

libraryDependencies ++= Seq(
  "org.scalacheck" %%% "scalacheck" % "$scalacheck_version$" % "test"
)
npmDependencies in Compile ++= Seq(
  // "snabbdom" -> "0.5.3"
)

updateOptions := updateOptions.value.withCachedResolution(true)
scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-target:jvm-1.8",
  "-encoding", "UTF-8",
  "-Xfuture",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Yno-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-unused",
  "-feature",
  "-Xlint"
)

