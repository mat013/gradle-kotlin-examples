import org.gradle.script.lang.kotlin.getValue

println("Hello world")

val myval by project
println(myval)

buildscript {


}

/*
plugins {
    application
}

application {
    mainClassName = "samples.HelloWorld"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    testCompile("junit:junit:4.12")
}

repositories {
    jcenter()
}
*/