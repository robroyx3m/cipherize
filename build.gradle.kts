// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        // Add the Gradle Plugin Repository
        maven { url 'https://plugins.gradle.org/m2/' }
        mavenCentral() // Optional: You can also use Maven Central repository
    }
    dependencies {
        // Add the Kotlin Gradle plugin dependency
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.0"
    }
}

plugins {
    // Apply the Kotlin plugin
    id 'org.jetbrains.kotlin.jvm' version '1.9.0'
}

repositories {
    // Add the Maven Central repository
    mavenCentral()
}

dependencies {
    // Add your Kotlin dependencies here
    implementation "org.jetbrains.kotlin:kotlin-stdlib:1.9.0"
    // Add other dependencies as needed
}
