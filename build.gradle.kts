plugins {
    id("net.labymod.labygradle")
    id("net.labymod.labygradle.addon")
}

val versions = providers.gradleProperty("net.labymod.minecraft-versions").get().split(";")

group = "org.example"
version = providers.environmentVariable("VERSION").getOrElse("1.0.1")

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

labyMod {
    defaultPackageName = "dev.oljver.autotpaaccept" //change this to your main package name (used by all modules)

    minecraft {
        registerVersion(versions.toTypedArray()) {
            runs {
                getByName("client") {
                    // When the property is set to true, you can log in with a Minecraft account
                    // devLogin = true
                }
            }
        }
    }

    addonInfo {
        namespace = "autotpaaccept"
        displayName = "Auto TPA Accept"
        author = "Oljver"
        description = "Streamline Minecraft TPA requests with auto-accept, a one-click confirmation button, and customizable sound notifications."
        minecraftVersion = "*"
        version = rootProject.version.toString()
    }
}

subprojects {
    plugins.apply("net.labymod.labygradle")
    plugins.apply("net.labymod.labygradle.addon")

    group = rootProject.group
    version = rootProject.version
}