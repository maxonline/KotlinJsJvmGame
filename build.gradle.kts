import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpack

plugins {
    kotlin("multiplatform") version "1.4.0"
    kotlin("plugin.serialization") version "1.4.0"
    application
}
group = "maxonline"

val ktor_version = "1.4.1"
val kotlinx_version = "0.7.2"
val logback_version = "1.2.3"
val serialization_version = "1.0.0-RC"

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://dl.bintray.com/kotlin/ktor") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-js-wrappers") }
}
kotlin {
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
        withJava()
    }
    js() {
        browser {
            binaries.executable()
            webpackTask {
                cssSupport.enabled = true
                mode = org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.Mode.DEVELOPMENT
            }
            runTask {
                cssSupport.enabled = true
            }
            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
            dceTask {
                dceOptions.devMode = true
            }
            useCommonJs()
        }
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
                implementation("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinx_version")

                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core-js:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf-js:$serialization_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-cbor-js:$serialization_version")
                //implementation(npm("phaser", "3.24"))
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
tasks.getByName<KotlinWebpack>("jsBrowserProductionWebpack") {
    outputFileName = "KotlinJsJvmGame.js"
}
tasks.getByName<Jar>("jvmJar") {
    dependsOn(tasks.getByName("jsBrowserProductionWebpack"))
    val jsBrowserProductionWebpack = tasks.getByName<KotlinWebpack>("jsBrowserProductionWebpack")
    from(File(jsBrowserProductionWebpack.destinationDirectory, jsBrowserProductionWebpack.outputFileName))
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