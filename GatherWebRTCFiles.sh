#!/bin/sh

# This file collects required java and jni files for android WebRTC after compilation.
# Note: Run this script in root WebRTC project

## Delete OUT
rm -rf OUT

## Create OUT

mkdir -p OUT/Java

## Copy Java files
cp -r src/sdk/android/api/org OUT/Java
cp -r src/sdk/android/src/java/org OUT/Java
cp -r src/rtc_base/java/src/org OUT/Java
cp -r src/modules/audio_device/android/java/src/org OUT/Java
cp -r src/out_arm64/Release/gen/sdk/android/peerconnection_java/generated_java/input_srcjars/org OUT/Java
cp -r src/out_arm64/Release/gen/sdk/android/video_api_java/generated_java/input_srcjars/org OUT/Java


## Copy lib files
cp -r libs OUT/Libs