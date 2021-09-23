public class Person {
  private String name;
  private int age;

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
