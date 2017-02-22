name := """play-api"""

version := "0.1.0"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .enablePlugins(NewRelic)

scalaVersion := "2.11.8"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.4.1209",
  "com.typesafe.play" %% "play-slick" % "2.0.2",
  "io.strongtyped" %% "active-slick" % "2.3.2",
  "com.github.tototoshi" %% "slick-joda-mapper" % "2.2.0"
  "org.joda" % "joda-convert" % "1.0.1",
  "com.ticketfly" %% "play-liquibase" % "1.2",
  ws,
  filters,
  
  "com.typesafe.akka" %% "akka-testkit" % "2.4.14" % Test,
  "de.leanovate.play-mockws" %% "play-mockws" % "2.5.1" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

// Test coverage configuration
// coverageMinimum := 100
// coverageFailOnMinimum := true
coverageExcludedPackages := ".*Reverse.*;.*Routes.*;"

newrelicVersion := "3.35.2"
