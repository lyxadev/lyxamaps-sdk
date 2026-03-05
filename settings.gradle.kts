pluginManagement { 
    repositories { 
        gradlePluginPortal() 
        maven { url = uri("https://repo.maven.apache.org/maven2") }
    } 
}

dependencyResolutionManagement { 
    repositories { 
        mavenCentral() 
        maven { url = uri("https://repo.maven.apache.org/maven2") }
    } 
}

rootProject.name = "lyxamaps-sdk"