plugins {
    kotlin("plugin.spring") version "2.0.21"
    id("org.springframework.boot") version "2.7.18"
}

val jacksonVersion = "2.9.10"
val jacksonMoneyVersion = "1.2.0"
val moneyVersion = "1.1"
val monetaVersion = "1.4.2"
val springTestJunit5 = "1.5.0"

repositories {
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:2.7.18"))

    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    implementation(project(":valiktor-javamoney"))
    implementation(project(":valiktor-javatime"))
    implementation(project(":valiktor-spring:valiktor-spring-boot-starter"))
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:$jacksonVersion")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:$jacksonVersion")
    implementation("org.zalando:jackson-datatype-money:$jacksonMoneyVersion")
    implementation("javax.money:money-api:$moneyVersion")
    runtimeOnly("org.javamoney:moneta:$monetaVersion")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // for Spring Boot 1.x + JUnit 5 support
    testImplementation("com.github.sbrannen:spring-test-junit5:$springTestJunit5")
}
