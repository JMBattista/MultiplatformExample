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
            }
        }

        val jvmTest by getting {
            dependencies {
                // platform part of will be added automatically
                implementation(project(":producer"))
            }
        }
    }
}
