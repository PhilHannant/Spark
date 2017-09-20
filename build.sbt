name := "Spark"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies ++= {
  val sparkVer = "2.2.0"
  Seq(
    "org.apache.spark" %% "spark-core" % sparkVer % "provided" withSources()
  )
}

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.8"
libraryDependencies += "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.8.8"


