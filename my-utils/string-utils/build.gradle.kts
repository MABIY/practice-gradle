plugins {
    id("java-library-conventions")
}

group = "org.sample"
version = libs.versions.string.utils.get()


dependencies {
    implementation(libs.commons.lang3)
}