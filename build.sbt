name := """scala_compile_di_example"""
organization := "com.example"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.8"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

ThisBuild / javacOptions ++= List(
  "-Xlint:unchecked",
  "-Xlint:deprecation",
)

ThisBuild / scalacOptions ++= List(
  "-encoding", "utf8",
  "-deprecation",
  "-feature",
  "-unchecked",
)

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test
