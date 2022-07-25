# WebRTC Public Release
Release framework of WebRTC Android Project


# WebRTC

<p>
    <img alt="Gradle platforms" src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white">
    <img alt="Gradle" src="https://img.shields.io/jitpack/v/github/OrionInnovationTRTech/OIWebRTC-Android?color=green&label=Gradle&logo=gradle&style=for-the-badge">
    <img alt="License" src="https://img.shields.io/github/license/OrionInnovationTRTech/OIWebRTC-Android?style=for-the-badge">
</p>

## Install

### Gradle

### Step1

To add OIWebRTC to your project first add the jitpack URL to your root level settings.gradle

```
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}

```
**Note:** If you are using an older gradle or Android studio version you might need to add the jitpack URL to your application root-level build.gradle file


### Step2

Add the OIWebRTC Dependency to your app level build.gradle.

```
dependencies {
	 implementation 'com.github.OrionInnovationTRTech:OIWebRTC-Android:Tag'
}
```

#### That's it!

### Manual

Alternatively *OIWebRTC* can be manually integrated to your project.

## Compatibility

Compatible Android versions :

* Android 5.x+

