name := "reddit-user-interactions"

version := "0.1"

scalaVersion := "2.12.8"

assemblyJarName := "userInter.jar"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.3" % "provided"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.2" % "provided"
//TODO look into "hadoop3-0.13.16"
libraryDependencies += "com.google.cloud.bigdataoss" % "bigquery-connector" % "hadoop2-0.13.16" % "provided"
libraryDependencies += "com.google.code.gson" % "gson" % "2.8.5" % "provided"