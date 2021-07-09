package com.aburkat.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Resolution {
  SMALL(new int[]{800, 600}),
  BIG(new int[]{1024, 768}),
  HD(new int[]{1920, 1080});
  private int[] resolution;


}
