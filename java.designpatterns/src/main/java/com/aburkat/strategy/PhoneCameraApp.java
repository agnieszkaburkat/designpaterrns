package com.aburkat.strategy;

import java.time.Instant;

public abstract class PhoneCameraApp {
  SharingOption sharingOption;
  CameraType cameraType;

  abstract void edit();

  Photo take(CameraType cameraType, Resolution resolution, String name) {
    return new Photo(cameraType, resolution, name, Instant.now());
  }

  void share(Photo photo) {
    sharingOption.sharePhoto(photo);
  }
  CameraType getCameraType(){
    return cameraType;
  }
}
