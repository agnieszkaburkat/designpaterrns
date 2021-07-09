package com.aburkat.strategy;

public class ProCameraApp extends PhoneCameraApp{

  public ProCameraApp(SharingOption sharingOption) {
    this.sharingOption = sharingOption;
    this.cameraType = CameraType.PRO_CAM;
  }

  @Override
  void edit() {

  }
}
