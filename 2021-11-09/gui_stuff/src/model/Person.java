package model;

public class Person {
  String name;
  int luckyNumber;

  public Person(String name, int luckyNumber) {
    this.name = name;
    this.luckyNumber = luckyNumber;
  }

  public String getName() {
    return name;
  }

  public int getLuckyNumber() {
    return luckyNumber;
  }

}
