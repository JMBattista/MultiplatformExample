plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "io.balexda"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(project(":producer"))
                implementation("io.mockk:mockk:1.13.5")
            }
        }

        val jvmTest by getting {
            dependencies {
                // this should automatically pick up dependencies from commonTest
            }
        }
    }
}
