plugins {
    kotlin("plugin.spring") version "2.0.21"
}

val springVersion = "5.2.9.RELEASE"
val jacksonVersion = "2.11.2"
val servletVersion = "4.0.1"
val jsonAssertVersion = "1.5.0"
val xmlUnitVersion = "2.7.0"

dependencies {
    implementation(project(":valiktor-core"))
    compileOnly("org.springframework:spring-webmvc:$springVersion")
    compileOnly("org.springframework:spring-webflux:$springVersion")
    compileOnly("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    compileOnly("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:$jacksonVersion")

    testImplementation("org.springframework:spring-webmvc:$springVersion")
    testImplementation("org.springframework:spring-webflux:$springVersion")
    testImplementation("org.springframework:spring-test:$springVersion")
    testImplementation("javax.servlet:javax.servlet-api:$servletVersion")
    testImplementation("com.fasterxml.jackson.core:jackson-databind:$jacksonVersion")
    testImplementation("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")
    testImplementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:$jacksonVersion")
    testRuntimeOnly("org.skyscreamer:jsonassert:$jsonAssertVersion")
    testRuntimeOnly("org.xmlunit:xmlunit-core:$xmlUnitVersion")
}
