package com.aburkat.factory;

public interface CalendarFactory {
  static Zone createZone(String zoneName) {
    return switch (zoneName) {
      case "mountain" -> new ZoneMountain();
      case "pacific" -> new ZonePacific();
      case "central" -> new ZoneCentral();
      default -> new Zone() {
      };
    };
  }
}
