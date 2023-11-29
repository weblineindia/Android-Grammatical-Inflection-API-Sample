# Grammatical Inflection API 

Sample project of Android 14 feature Grammatical Inflection API, which
lets you add support for grammatical gender without refactoring your
app.
 
 
## Table of contents
- [Android Support](#android-support)
- [Demo](#demo)
- [Features](#features)
- [Getting started](#getting-started)
- [Usage](#usage)
- [Methods](#methods)
- [Want to Contribute?](#want-to-contribute)
- [Collection of Components](#collection-of-components)
- [Changelog](#changelog)
- [License](#license)
- [Keywords](#keywords)


## Android Support

Android Version - Android 14

Android Studio Giraffe | 2022.3.1 Patch 4

We have tested our program in Android 14 version. You can not use it in below versions.


## Demo
![](./grammatical_inflection_api.gif)


## Features

* Android 14 Feature Grammatical Inflection API which allows you to more easily add support for users who speak languages which have grammatical gender.


## Getting started

* Download this sample project and import module in your Android App. 
* Update UI based on your requirements. 


## Usage

Setup process is described below to integrate in sample project.

### Methods
    
Annotations
    
    @RequiresApi(Build.VERSION_CODES.UPSIDE_DOWN_CAKE)

Service initialize 

    val gim = getSystemService(GrammaticalInflectionManager::class.java) as GrammaticalInflectionManager

Here is example of how to declare configuration changes in your app's manifest file if you want to handle them yourself:

    <activity 
            android:name=".MainActivity"
            android:configChanges="grammaticalGender"
            android:exported="true">
    </activity>

Set grammatical gender

        // Set app's grammatical gender to masculine
        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_MASCULINE)

        // Set app's grammatical gender to feminine
        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_FEMININE)

        // Set app's grammatical gender to neutral
        gim.setRequestedApplicationGrammaticalGender(Configuration.GRAMMATICAL_GENDER_NEUTRAL)
    
Add translations for languages with grammatical gender

* To provide localized text for languages with grammatical gender, create an alternative resources file and append the grammatical gender qualifier immediately after the locale name for those languages. The following table outlines the possible values:

        res/values-feminine/strings.xml

        res/values-masculine/strings.xml

        res/values-neuter/strings.xml

* Add strings in all files with same name

        // Strings in res/values/strings.xml
         <resources>
            <string name="app_name">Grammatical Inflection API Demo</string>
            <string name="string_one">you can create beautiful melodies</string>
            <string name="string_two">you are great in your job</string>
        </resources>

        // Strings in res/values-feminine/strings.xml
        <resources>
            <string name="app_name">Grammatical Inflection API Demo</string>
            <string name="string_one">She is a talented artist</string>
            <string name="string_two">Anita is a talented writer</string>
        </resources>

        // Strgins in res/values-masculine/strings.xml
        <resources>
            <string name="app_name">Grammatical Inflection API Demo</string>
            <string name="string_one">He is a skilled musician</string>
            <string name="string_two">Ankit is a brilliant mathematician</string>
        </resources>

        // Strings in res/values-neuter/strings.xml
        <resources>
            <string name="app_name">Grammatical Inflection API Demo</string>
            <string name="string_one">They create beautiful melodies</string>
            <string name="string_two">They are great in their job</string>
        </resources>

## Want to Contribute?

* Created something awesome, made this code better, added some functionality, or whatever (this is the hardest part).
* [Fork it](http://help.github.com/forking/).
* Create new branch to contribute your changes.
* Commit all your changes to your branch.
* Submit a [pull request](http://help.github.com/pull-requests/).

 
## Collection of Components
 We have built many other components and free resources for software development in various programming languages. Kindly click here to view our [Free Resources for Software Development.](https://www.weblineindia.com/software-development-resources.html)
 

## Changelog
Detailed changes for each release are documented in [CHANGELOG](./CHANGELOG).


## License
[MIT](LICENSE)

[mit]: ./LICENSE


## Keywords
Grammatical Inflection API, Gender API, Grammatical Gender API