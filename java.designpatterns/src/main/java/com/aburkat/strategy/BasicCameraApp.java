package com.aburkat.strategy;

public class BasicCameraApp extends PhoneCameraApp{

  public BasicCameraApp(SharingOption sharingOption) {
    this.sharingOption = sharingOption;
    this.cameraType = CameraType.BASIC_CAM;
  }

  @Override
  void edit() {

  }
}
