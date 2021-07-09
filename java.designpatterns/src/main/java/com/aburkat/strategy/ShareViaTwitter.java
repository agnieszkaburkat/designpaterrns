package com.aburkat.strategy;

public class ShareViaTwitter implements SharingOption {
  @Override
  public void sharePhoto(Photo photo) {
    System.out.println("the photo " + photo.getFileName() + " was tweeted.");
  }
}
