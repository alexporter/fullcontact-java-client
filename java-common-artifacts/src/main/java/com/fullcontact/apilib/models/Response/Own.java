package com.fullcontact.apilib.models.Response;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Own {
  private boolean ownCat,
      ownDog,
      ownDigitalCamera,
      ownHorse,
      ownMotorcycle,
      ownSwimmingPool,
      ownAtv,
      ownRv;
}
