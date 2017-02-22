resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.10")

// Test Coverage
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.5.0")

// Style Guide
// addSbtPlugin("org.scalariform" % "sbt-scalariform" % "1.6.0")

// Scala Style
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.8.0")

// Build Info
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.6.1")

// Server Monitoring
addSbtPlugin("com.gilt.sbt" % "sbt-newrelic" % "0.1.10")

// UTC timezone
addSbtPlugin("com.timgroup" % "sbt-utc" % "0.0.14")

// Dependency graph
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.8.2")
