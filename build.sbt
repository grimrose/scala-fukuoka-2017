import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(
    ParadoxPlugin,
    ParadoxSitePlugin,
    SiteScaladocPlugin
  )
  .settings(
    inThisBuild(List(
      organization := "org.grimrose.scala",
      scalaVersion := "2.12.2",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-fukuoka-2017",
    libraryDependencies += scalaTest % Test,
    // theme
    paradoxTheme := Some(builtinParadoxTheme("generic")),
    // #for_sbt_site
    sourceDirectory in Paradox := sourceDirectory.value / "main" / "paradox",
    // #for_sbt_site
    // #for_api_doc
    paradoxProperties ++= Map(
      "scaladoc.base_url" -> "/latest/api/",
    // #for_api_doc
      "snip.test.base_dir" -> s"${(sourceDirectory in Test).value}/scala/org/grimrose/scala/fukuoka"
    )
  )
