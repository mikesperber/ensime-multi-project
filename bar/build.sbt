lazy val foo = file("../foo")

lazy val root = (project in file(".")).
  settings(
    name         := "Name matching",
    version      := "1.0",
    scalaVersion := "2.11.8").dependsOn(foo)
