name := "macro-tests"

version := "0.1"

scalaVersion := "2.12.4"
val scalaStringVersion = scalaVersion.toString

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaStringVersion
libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.0" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")

import scalariform.formatter.preferences._

scalariformPreferences := scalariformPreferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(DoubleIndentConstructorArguments, true)
    .setPreference(DanglingCloseParenthesis, Preserve)