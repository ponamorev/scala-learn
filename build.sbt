lazy val root = (project in file(".")).settings(
  name := "scala-learn",
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.2"
  )
)