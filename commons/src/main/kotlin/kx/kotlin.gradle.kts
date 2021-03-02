package kx

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    //    id("com.example.jacoco")
    id("com.github.johnrengelman.shadow")
}

////group = "com.example.myproduct"
//
////java {
////    sourceCompatibility = JavaVersion.VERSION_1_8
////    targetCompatibility = JavaVersion.VERSION_1_8
////}

repositories {
    mavenCentral()
    jcenter()
    //    maven("https://dl.bintray.com/kotlin/dokka")
    //    maven("https://dl.bintray.com/kotlin/kotlinx/")
    maven("https://jitpack.io")
}

dependencies {

    implementation(platform("com.github.elect86.platforms:source:fe09de54"))

    testImplementation(platform("com.github.elect86.platforms:test:fe09de54"))

//    implementation(kotlin("stdlib-jdk8")) already on classpath?

    //    testImplementation("org.junit.jupiter:junit-jupiter-api")
    //    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    testImplementation("io.kotest:kotest-runner-junit5")
    testImplementation("io.kotest:kotest-assertions-core")
}

tasks {

    withType<KotlinCompile>().all {
        kotlinOptions.freeCompilerArgs += listOf("-Xinline-classes", "-Xopt-in=kotlin.RequiresOptIn")
    }

    withType<Test> { useJUnitPlatform() }
}

java {
    withSourcesJar()
}