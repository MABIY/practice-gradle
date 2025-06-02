plugins {
    `java-library`
}

repositories {

    maven {
        url = uri("https://maven.aliyun.com/repository/public")
    }

    mavenCentral()
}

val libs = extensions.getByType(VersionCatalogsExtension::class.java).named("libs")


dependencies {
    implementation(libs.findLibrary("slf4j-api").get())
    testImplementation(platform(libs.findLibrary("junit-bom").get()))
    testImplementation(libs.findLibrary("junit-jupiter").get())
    testRuntimeOnly(libs.findLibrary("junit-platform").get())
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
