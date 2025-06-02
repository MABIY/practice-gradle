plugins {
    `java-library`
}

group = "org.sample"
version = libs.versions.string.utils.get()

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.commons.lang3)
}