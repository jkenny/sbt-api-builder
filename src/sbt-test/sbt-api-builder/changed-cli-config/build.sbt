version := "0.1"
scalaVersion := "2.12.6"

libraryDependencies += "io.circe" %% "circe-core" % "0.9.1"

Compile / apiBuilderCLIConfigDirectory := baseDirectory.value / "src" / "apibuilder"
Compile / apiBuilderCLIConfigFilename  := "my_config.yaml"
