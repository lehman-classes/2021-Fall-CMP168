


public class Person implements Comparable<Person> {
	private String name;
	private int birthYear;
	
	public Person() {
		this.name="";
		this.birthYear=0;
	}
	
	public Person(String n, int b) {
		this.name=n;
		this.birthYear=b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person oPers = (Person) o;
			return this.name==oPers.getName() && this.birthYear==oPers.getBirthYear();
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s = String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
		return s;
	}
	
	public int compareTo(Person p) {
		//TODO might be the other way around
		if(this.birthYear > p.getBirthYear()) {
			return 1;
		}
		else if(this.birthYear < p.getBirthYear()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}

