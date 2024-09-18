pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SearchJobApp"
include(":app")
include(":shared")
include(":core")
include(":buildConf")
include(":favourite")
include(":responces")
include(":messages")
include(":profile")
include(":home")
include(":home:main")
include(":home:search")
