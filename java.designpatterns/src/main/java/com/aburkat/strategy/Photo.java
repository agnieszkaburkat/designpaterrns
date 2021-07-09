package com.aburkat.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@AllArgsConstructor
@Getter
public class Photo {
  private CameraType camType;
  private Resolution resolution;
  private String fileName;
  private Instant creationDate;
}
