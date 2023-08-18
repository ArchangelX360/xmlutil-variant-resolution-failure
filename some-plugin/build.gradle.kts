plugins {
  `kotlin-dsl`
  `java-gradle-plugin`
  kotlin("plugin.serialization") version "1.8.20"
}

gradlePlugin {
  plugins {
    register("somePlugin") {
      id = "some-plugin"
      implementationClass = "somepackage.SomePlugin"
    }
  }
}

repositories {
    mavenCentral()
}

dependencies {
  val xmlutilVersion = "0.86.1"
  implementation("io.github.pdvrieze.xmlutil:core-jvm:$xmlutilVersion")
  implementation("io.github.pdvrieze.xmlutil:serialization-jvm:$xmlutilVersion")
}
