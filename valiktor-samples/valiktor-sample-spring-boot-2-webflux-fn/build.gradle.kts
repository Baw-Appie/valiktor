plugins {
    kotlin("plugin.spring") version "2.0.21"
    id("org.springframework.boot") version "2.7.18"
}

val jacksonMoneyVersion = "1.2.0"
val moneyVersion = "1.1"
val monetaVersion = "1.4.2"

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.18"))

    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation(project(":valiktor-javamoney"))
    implementation(project(":valiktor-javatime"))
    implementation(project(":valiktor-spring:valiktor-spring-boot-starter"))
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")
    implementation("org.zalando:jackson-datatype-money:$jacksonMoneyVersion")
    implementation("javax.money:money-api:$moneyVersion")
    runtimeOnly("org.javamoney:moneta:$monetaVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-debug")
}
