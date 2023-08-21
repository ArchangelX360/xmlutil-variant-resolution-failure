import org.jetbrains.kotlin.gradle.plugin.KotlinPlatformType

plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    // Does not work with this either:
    //   id("org.jetbrains.kotlin.jvm") version "1.8.20"
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

kotlin {
    target {
        sourceSets {
            main {
                // this does not work either:
                //
                //   attributes.attribute(KotlinPlatformType.attribute, KotlinPlatformType.jvm)
                dependencies {
                    val xmlutilVersion = "0.86.1"
                    implementation("io.github.pdvrieze.xmlutil:core-jvm:$xmlutilVersion")
                    implementation("io.github.pdvrieze.xmlutil:serialization-jvm:$xmlutilVersion")
                }
            }
        }
    }
}
