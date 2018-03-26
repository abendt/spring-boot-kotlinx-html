buildscript {
    repositories {
        jcenter()
    }
}

plugins {
    application
    kotlin("jvm") version "1.2.31"
    id("org.springframework.boot") version "2.0.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.4.RELEASE"
}

repositories {
    jcenter()
}

application {
    mainClassName = "de.flqw.Application"
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compile("org.springframework.boot:spring-boot-starter-web")
    compile("org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.9")
}



