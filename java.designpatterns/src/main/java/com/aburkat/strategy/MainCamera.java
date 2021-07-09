package com.aburkat.strategy;

public class MainCamera {
  /**
   * The strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangeable.
   * Strategy lets the algorithm vary independently from clients that use it. Now this definition doesn't tell us
   * how to implement the pattern, but it does give us a good idea of the intent of a pattern. You've seen how we
   * implemented the pattern in the duck simulator and how that design allowed
   * our objects to be more flexible and made the overall system more resilient to change.
   *
   * This idea, of using composition rather than inheritance, is another important design principle.
   * This principle says, if you have a choice, use composition rather than inheritance because typically,
   * composition leads to a more flexible design. Let's look at another benefit in our new design, based on composition.
   * With inheritance, in the old design, we were locked into compile time decisions about behavior.
   */
  public static void main(String[] args) {
    // pro photo shared via email
    PhoneCameraApp proCameraApp = new ProCameraApp(new ShareViaEmail());
    Photo proPhotoOfADog = proCameraApp
        .take(proCameraApp.getCameraType(), Resolution.BIG, "pro photo of a dog");
    proCameraApp.share(proPhotoOfADog);

    // basic photo shared via twitter
    PhoneCameraApp basicCameraApp = new BasicCameraApp(new ShareViaTwitter());
    Photo basicCatPhoto = basicCameraApp
        .take(basicCameraApp.getCameraType(), Resolution.SMALL, "basic photo of a cat");
    basicCameraApp.share(basicCatPhoto);
  }
}
