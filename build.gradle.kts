plugins {
    alias(libs.plugins.jvm)
    alias(libs.plugins.javafx)
    alias(libs.plugins.javamodularity)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.coroutines.javafx)
    implementation(libs.logback)
}

java {
    modularity.inferModulePath.set(false)

    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

javafx {
    version = "22.0.1"
    modules("javafx.controls", "javafx.fxml")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
