// tag::app_dependencies[]
plugins {
    id("application")
}

application {
    mainClass = "org.sample.myapp.Main"
}

dependencies {
    implementation(libs.number.utils)
    implementation(libs.string.utils)
}
// end::app_dependencies[]

group = "org.sample"
version = "1.0"

repositories {
    maven {
        url = uri("https://maven.aliyun.com/repository/public")
    }

    mavenCentral()
}