// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("org.jetbrains.kotlin.kapt") version "2.0.0-RC2"
    id ("androidx.navigation.safeargs.kotlin") version "2.7.7" apply false
}