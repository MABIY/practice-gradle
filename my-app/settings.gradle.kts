apply(from ="../gradle/dependencyResolutionManagement.gradle.kts")


rootProject.name = "my-app"

include("app")
includeBuild("../my-utils")
includeBuild("../build-logic")
