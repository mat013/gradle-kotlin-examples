import org.gradle.script.lang.kotlin.extra
import org.gradle.script.lang.kotlin.repositories

buildscript {

    build.loadExtraPropertiesOf(project)

    val kotlinRepo: String by extra
    val somevalue: String by extra

    println(somevalue)

    repositories {
        maven { url = uri(kotlinRepo) }
    }

    val kotlinVersion: String by extra
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

