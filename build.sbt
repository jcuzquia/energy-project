name := """energy-project"""

version := "1.0-SNAPSHOT"


scalaVersion := "2.11.6"

val appDependencies ++= Seq(
	"be.objectify"  %% "deadbolt-java"     % "2.4.0",
	// Comment the next line for local development of the Play Authentication core:
	"com.feth"      %% "play-authenticate" % "0.7.0-SNAPSHOT",
	"org.postgresql"    %  "postgresql"        % "9.4-1201-jdbc41",
	cache,
	javaWs,
	javaJdbc,
	"org.webjars" % "bootstrap" % "3.2.0",
	"org.easytesting" % "fest-assert" % "1.4" % "test"

)

resolvers ++= Resolver.sonatypeRepo("snapshots")

//display deprecated or poorly formed Java
javacOptions ++= Seq("-Xlint:unchecked")
javacOptions ++= Seq("-Xlint:deprecation")
javacOptions ++= Seq("-Xdiags:verbose")

libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean).settings(
	    libraryDependencies ++= appDependencies
		  )

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= Seq(
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.5-P24-SNAPSHOT"
)



// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

resolvers ++= Seq(
	"Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
	"Typesafe Maven Repository" at "http://repo.typesafe.com/typesafe/maven-releases/"
)

resolvers += Resolver.url("Objectify Play Repository", url("http://deadbolt.ws/releases/"))(Resolver.ivyStylePatterns)




