plugins {
    id("java")
}

group = "ru.mirea"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation ("org.testng:testng:7.1.0")
}

tasks.test {
    useTestNG()
}