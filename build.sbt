name := "c-online"

version := "1.0"

scalaVersion := "2.9.1"

Seq(
  scalaSource in Compile <<= baseDirectory / "scala",
  javaSource in Compile <<= baseDirectory / "java",
  resourceDirectory in Compile <<= baseDirectory / "resources"
)

exportJars := true
