import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack

plugins {
    kotlin("multiplatform") version "1.5.31"
    kotlin("plugin.serialization") version "1.5.31"
    application
}
group = "maxonline"

val ktor_version = "2.0.0-eap-132"
val logback_version = "1.2.3"
val serialization_version = "1.3.0"

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-js-wrappers") }
    maven { url = uri("https://dl.bintray.com/korlibs/korlibs/") }
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/ktor/eap") }
}
kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
    }
    js(IR) {
        browser {

        }
        binaries.library()
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("serialization"))
                implementation("io.ktor:ktor-utils:$ktor_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor:$serialization_version")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation(files("$rootDir/src/jsMain/js/"))
                implementation("io.ktor:ktor-server-netty:$ktor_version")
                implementation("io.ktor:ktor-html-builder:$ktor_version")
                implementation("io.ktor:ktor-websockets:$ktor_version")
                implementation("io.ktor:ktor-utils-jvm:$ktor_version")
                implementation("ch.qos.logback:logback-classic:$logback_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-jvm:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-jvm:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor-jvm:$serialization_version")

            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
        val jsMain by getting {
            dependencies {
                implementation("io.ktor:ktor-utils-js:$ktor_version")
                implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.2")

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-js:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor-js:$serialization_version")
                implementation("com.soywiz.korlibs.korge2:korge-js:2.4.1")
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }
    }
}
application {
    mainClassName = "maxonline.server.MainKt"
}

tasks.getByName<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile>("compileKotlinJs") {
    kotlinOptions.moduleKind = "plain"
}

tasks.register<Copy>("copyStaticJsFiles") {
    from("$rootDir/src/jsMain/js/")
    into("$buildDir/processedResources/jvm/main/web")
}


tasks.getByName<Jar>("jvmJar") {
    dependsOn(tasks.getByName("copyStaticJsFiles"))
}
tasks.getByName<JavaExec>("run") {
    dependsOn(tasks.getByName<Jar>("jvmJar"))
    classpath(tasks.getByName<Jar>("jvmJar"))
}

tasks.withType<org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile> {
    kotlinOptions {
        sourceMap = true
    }
}