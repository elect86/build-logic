plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    maven("https://jitpack.io")
}

dependencies {

    implementation(platform("com.github.elect86.platforms:plugin:fe09de54"))
}