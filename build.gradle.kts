plugins {
    id("java")
    id("application")
}

apply {
    plugin("java")
}

group = "be.cardoeng"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

val javaMainClass = "be.cardoeng.Main"

application {
    mainClass.set(javaMainClass)
}