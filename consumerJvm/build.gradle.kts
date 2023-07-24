plugins {
    id("java")
}

group = "io.balexda"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(projects.multiplatformTest.producer)
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}