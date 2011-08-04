name := "Skoans"

version := "1.0"

organization := "org.examples.skoans"

scalaVersion := "2.9.0"

resolvers += ScalaToolsSnapshots

libraryDependencies ++= Seq(
	"org.mockito" % "mockito-all" % "1.8.4",
	"org.scalatest" % "scalatest_2.9.0" % "1.6.1",
	"junit" % "junit" % "4.8.1" % "test"
)

