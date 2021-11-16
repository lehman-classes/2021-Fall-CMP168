import java.util.Objects;
public class Person implements Comparable<Person>{

    public Person() {
        this.name = "";
        this.birthYear = 0;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBirthYear(int birthYear) {
        if(birthYear >= 0)
        this.birthYear = birthYear;
        else birthYear = 0;
    }

    public int getBirthYear() {
        return birthYear;
    }



    @Override
    public String toString() {
        return String.format("Person: Name: %30s | Birth Year: %4d",getName(),getBirthYear());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if(!(object instanceof Person)) return false;
        Person person = (Person) object;
        return birthYear == person.birthYear && Objects.equals(name, person.name);
    }
    @Override
    public int compareTo(Person p) {
        if (this.birthYear == p.birthYear) {
            return 0;
        }
        else if (this.birthYear < p.birthYear) {
            return -1;
        }
         else
             return 1;
    }



    private String name;
    private int birthYear;



}
