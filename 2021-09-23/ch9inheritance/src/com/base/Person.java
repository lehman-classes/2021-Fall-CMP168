package com.base;

public class Person {
  protected String name;
  protected int age;

  public Person() {
  }

  public Person(String newName, int newAge) {
    name = newName;
    age = newAge;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "name: " + name + " age: " + age;
  }
}
