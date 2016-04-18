import sbt._

object Dependencies {

  val commonDependencies = {
    val json4sVersion = "3.3.0"
    val scalaTestVersion = "2.2.5"
    Seq(
      "org.json4s" %% "json4s-core" % json4sVersion,
      "org.json4s" %% "json4s-jackson" % json4sVersion,

      "com.google.inject" % "guice" % "4.0",
      "net.codingwell" %% "scala-guice" % "4.0.1",

      "org.scalatest" %% "scalatest" % scalaTestVersion % "test"
    )
  }

  val kamonDependencies = Seq(
    // [For monitoring]
    "io.kamon" %% "kamon-core" % "0.5.2",
    "io.kamon" %% "kamon-system-metrics" % "0.5.2",
    "io.kamon" %% "kamon-scala" % "0.5.2" % Runtime,
    "io.kamon" %% "kamon-akka" % "0.5.2" % Runtime,

    // [For reporting monitored data]
    "io.kamon" %% "kamon-statsd" % "0.5.2" //Read http://kamon.io/backends/statsd/
  )

  val akkaDependencies = {
    val akkaVersion = "2.4.1"
    Seq(
      "com.typesafe.akka" %% "akka-actor"   % akkaVersion,
      "com.typesafe.akka" %% "akka-slf4j"   % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
    )
  }

  val akkaStreamDependencies = {
    val akkaStreamVersion = "2.0-M2"
    Seq(
      "com.typesafe.akka" %% "akka-http-core-experimental"       % akkaStreamVersion,
      "com.typesafe.akka" %% "akka-http-experimental"            % akkaStreamVersion,
      "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamVersion,
      "com.typesafe.akka" %% "akka-http-testkit-experimental"    % akkaStreamVersion % "test",

      "de.heikoseeberger" %% "akka-http-json4s" % "1.4.1"
    )
  }

  val loggingDependencies = Seq(
    "org.slf4j" % "slf4j-api" % "1.7.7",
    "org.clapper" %% "grizzled-slf4j" % "1.0.2",
    "ch.qos.logback" % "logback-classic" % "1.0.0"
  )

  val playDependencies = Seq(
    "io.kamon" %% "kamon-play-24" % "0.5.2",
    "org.scalatestplus" %% "play" % "1.4.0" % "test"
  )

  val gatlingDependencies = Seq(
    "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.1.7" % "test",
    "io.gatling"            % "gatling-test-framework"    % "2.1.7" % "test"
  )
}

