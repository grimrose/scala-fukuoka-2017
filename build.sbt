import Dependencies._

lazy val root = (project in file("."))
  .enablePlugins(
    ParadoxPlugin,
    ParadoxSitePlugin,
    SiteScaladocPlugin,
    GhpagesPlugin
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
//      "scaladoc.base_url" -> "/latest/api/", /* preview */
      "scaladoc.base_url" -> "https://grimrose.github.io/scala-fukuoka-2017/latest/api/",
    // #for_api_doc
      "snip.test.base_dir" -> s"${(sourceDirectory in Test).value}/scala/org/grimrose/scala/fukuoka"
    ),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/grimrose/scala-fukuoka-2017"), 
        "git@github.com:grimrose/scala-fukuoka-2017.git"
      )
    ),
    git.remoteRepo := scmInfo.value.get.connection
  )
