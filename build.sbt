name := "ScalaExamples"

organization  := "com.meetfp"

version       := "0.0.1"

scalaVersion  := "2.11.1"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  Seq(
  "org.scalatest" %% "scalatest" % "2.2.0" ,
  "org.specs2" %% "specs2" % "2.3.12"
  )
}