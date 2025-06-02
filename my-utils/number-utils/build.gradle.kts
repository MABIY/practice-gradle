plugins {
    `java-library`
}

group = "org.sample"
version = libs.versions.number.utils.get()

repositories {
    mavenCentral()
}

dependencies {
//    implementation("com.google.guava:guava:33.4.8-jre")
    implementation(libs.guava)
}