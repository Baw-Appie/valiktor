val coroutinesVersion = "1.3.5"

dependencies {
    implementation(kotlin("reflect"))
    implementation(kotlin("test"))
    implementation(project(":valiktor-core"))

    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-debug:$coroutinesVersion")
}
