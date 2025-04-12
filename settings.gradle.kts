pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        ivy {
            url = uri("https://nodejs.org/dist/")
            patternLayout {
                artifact("[artifact]/v[revision]/[artifact]-v[revision]-[classifier].[ext]")
            }
            metadataSources {
                artifact()
            }
        }
    }
}
rootProject.name = "sightline"
include(":shared")
