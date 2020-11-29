# Material-Design

Material Components for Android
Material Components for Android by building a simple app with core components in Java

![Home Capture](https://user-images.githubusercontent.com/3745464/100535808-1f57a500-3242-11eb-8dab-226b08ba47df.PNG)

Learn how to use Material for structure and layout on Android in Java
Discover how Material Components for Android make it easy to differentiate your product and express your brand through design in Java

# Implementation
    implementation 'com.google.android.material:material:1.0.0'
    implementation 'androidx.cardview:cardview:1.0.0'

![Card Capture](https://user-images.githubusercontent.com/3745464/100535823-3b5b4680-3242-11eb-8980-baafab9556f4.PNG)
![Payment Capture](https://user-images.githubusercontent.com/3745464/100535825-3eeecd80-3242-11eb-8ea6-e1c4a5860782.PNG)
![Payment Card Capture](https://user-images.githubusercontent.com/3745464/100535826-41512780-3242-11eb-9bf3-38cf915c3369.PNG)
![SMS Capture](https://user-images.githubusercontent.com/3745464/100535827-46ae7200-3242-11eb-8d39-36653bd7ab31.PNG)

Depend on our library Material Components for Android is available through Google's Maven Repository. To use it:

Open the build.gradle file for your application.

Make sure that the repositories section includes Google's Maven Repository google(). For example:

```
  allprojects {
    repositories {
      google()
      jcenter()
    }
  }
```
Add the library to the dependencies section:

```
  dependencies {
    // ...
    implementation 'com.google.android.material:material:<version>'
    // ...
  }
```
Visit Google's Maven Repository or MVN Repository to find the latest version of the library.
