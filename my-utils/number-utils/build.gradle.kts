plugins {
    id("java-library-conventions")
}

group = "org.sample"
version = libs.versions.number.utils.get()

dependencies {
//    implementation("com.google.guava:guava:33.4.8-jre")
    implementation(libs.guava)
}