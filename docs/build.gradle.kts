
plugins {
    java
    `kotlin-dsl`
}

dependencies {

    implementation(platform("kx.platform:plugin:0.0.2"))

    implementation("org.jetbrains.dokka:dokka-gradle-plugin")
    implementation("org.jetbrains.dokka:dokka-core")
}