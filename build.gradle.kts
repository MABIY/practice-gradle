defaultTasks("run")

// tag::run[]
tasks.register("run") {
    dependsOn(gradle.includedBuild("my-app").task(":app:run"))
}
tasks.register("build") {
    // 对每个 included build 注册依赖
    gradle.includedBuilds.map { included ->
        dependsOn(included.task(":build"))
    }
}

// end::run[]

tasks.register("checkAll") {
    dependsOn(gradle.includedBuild("my-app").task(":app:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":number-utils:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":string-utils:check"))
}
