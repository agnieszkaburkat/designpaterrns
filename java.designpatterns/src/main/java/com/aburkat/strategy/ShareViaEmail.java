package com.aburkat.strategy;

public class ShareViaEmail implements SharingOption {

  @Override
  public void sharePhoto(Photo photo) {
    System.out.println("the photo " + photo.getFileName() + " was shared to an email.");
  }
}
