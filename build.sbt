val finchVersion = "0.32.1"
val circeVersion = "0.13.0"
val scalatestVersion = "3.2.0"

lazy val root = (project in file("."))
  .settings(
    organization := "br.com.yumi",
    name := "yumi_api",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.3",
    libraryDependencies ++= Seq(
      "com.github.finagle" %% "finchx-core"  % finchVersion,
      "com.github.finagle" %% "finchx-circe"  % finchVersion,
      "io.circe" %% "circe-generic" % circeVersion,
      "org.scalatest"      %% "scalatest"    % scalatestVersion % "test"
    )
  )
