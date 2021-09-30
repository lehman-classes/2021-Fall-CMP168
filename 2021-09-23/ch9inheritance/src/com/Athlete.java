package com;

import com.base.Person;

public class Athlete extends Person {
  private double weight;
  private int speed;

  public Athlete() {
  }

  public Athlete(double newWeight, int newSpeed) {
    weight = newWeight;
    speed = newSpeed;
  }

  public double getWeight() {
    return weight;
  }

  public int getSpeed() {
    return speed;
  }
}
