# VRClassroom
Hackathon project - Virtual Reality Classroom

## Thought
* This is a classroom for students with physical disabilities who find it hard to go to classes
* They can enter a virtual classroom from their homes, where the teachers and other students are present, just like a normal classroom

## API
Using the samsung gear vr api

## Getting Started
Follow these steps to create projects for GearVR framework
1. Make a copy of this repo
1. Rename your project by changine the folder name
1. Rename your Android App by updating `app_name` field of [app/src/main/res/values/strings.xml](https://github.com/nitosan/GearVRf-template/blob/master/app/src/main/res/values/strings.xml#L2)
1. Update the `applicationID` in [app/build.gradle](https://github.com/nitosan/GearVRf-template/blob/master/app/build.gradle#L19) to avoid conflict between other GearVR Framework apps.

## Build and Run

### Gear VR
The default setup for template project is for Gear VR, so you don't need to change any project file

Just need to copy your [Oculus signature file](https://developer.oculus.com/osig/) to `app/src/main/assets` folder.

### Screenshot
<img width="500" src="app/src/main/java/com/example/org/gvrfapplication/Images/45452598_471112056745507_4269471193309904896_n.jpg" >
<img width="500" alt="Screen Shot 2019-10-20 at 8 13 01 PM" src="https://user-images.githubusercontent.com/31454667/67168927-2f7e2f00-f376-11e9-83ff-2cb851a15123.png">
<img width="500" alt="Screen Shot 2019-10-20 at 8 13 11 PM" src="https://user-images.githubusercontent.com/31454667/67168928-2f7e2f00-f376-11e9-90ea-bb7764d1b424.png">
<img width="500" alt="Screen Shot 2019-10-20 at 8 13 18 PM" src="https://user-images.githubusercontent.com/31454667/67168929-2f7e2f00-f376-11e9-8570-927b37172a63.png">

### DayDream
Perform the following steps to enable DayDream Mode

1. remove following line in `app/build.gradle`

```
compile "org.gearvrf:backend_oculus:$gearvrfVersion"
```

2. comment out following line in `AndroidManifest.xml`

```
<meta-data android:name="com.samsung.android.vr.application.mode" android:value="vr_only"/>
```


## Some updates
* Quickstart for Google Cardboard for Android NDK - https://developers.google.com/cardboard/develop/c/quickstart
* The Daydream View VR headset is no longer available for purchase. However, you can continue to use the existing Google VR SDK to update and distribute your apps to the Google Play Store, and make them available to users in the Daydream app.
* There is a lot more stuff out there for VR in android, unity remains my best bet though

## Helpful links
* https://www.youtube.com/watch?v=1XDpJAK3wjw
* https://www.androidauthority.com/how-to-make-an-android-vr-app-878248/
* https://codelabs.developers.google.com/codelabs/vr_view_app_101/index.html?index=..%2F..index#0
* https://stackoverflow.com/questions/46163869/how-to-install-google-vr-sdk-in-android-studio
* https://arvr.google.com/daydream/smartphonevr/
