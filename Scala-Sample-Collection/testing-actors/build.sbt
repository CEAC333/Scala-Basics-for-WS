name := "Testing"

version := "1.0"

scalaVersion := "2.11.7"

sbtVersion := "0.13.5"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.0",
  "org.scalatest" %% "scalatest" % "2.2.1" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.0" % "test")