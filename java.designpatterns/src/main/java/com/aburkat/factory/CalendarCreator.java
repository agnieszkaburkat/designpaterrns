package com.aburkat.factory;

public class CalendarCreator{
  public static void main(String[] args) {
    final Zone pacific = CalendarFactory.createZone("pacific");
    assert pacific.getName().equals("US/pacific");
  }
}
