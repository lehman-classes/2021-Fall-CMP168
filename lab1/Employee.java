
public class Employee extends Person {
	
	private String deptName;
	private static int numEmployees=0;
	private int employeeID;
	
	public Employee() {
		super();
		this.deptName="";
		numEmployees++;
		this.employeeID=numEmployees;
	}
	
	public Employee(String deptName) {
		super();
		this.deptName=deptName;
		numEmployees++;
		this.employeeID=numEmployees;
	}
	
	public Employee(String name, int birthYear, String deptName) {
		super(name, birthYear);
		this.deptName=deptName;
		numEmployees++;
		this.employeeID=numEmployees;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public static int getNumEmployees() {
		return numEmployees;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public void setDeptName(String name) {
		this.deptName=name;
	}
	

	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee other=(Employee)obj;
		
		return super.equals(obj) && this.employeeID==other.getEmployeeID() && this.deptName.equals(other.deptName);
		}
		return false;
	}
	
	public String toString() {
		return String.format( 
							"%s Employee: Department: %20s | Employee Number: %3d",super.toString(), deptName, employeeID);
	}
	
	public int compareTo(Person p) {
		int Num = -2;
		if(p instanceof Employee) {
			Employee newP = (Employee)p;
		
		if(this.employeeID > newP.getEmployeeID()) 
			Num = 1;
		
		else if(this.employeeID < newP.getEmployeeID()) 
			Num = -1;
		else Num = 0;
		
		
	}
		return Num;
	}
}
