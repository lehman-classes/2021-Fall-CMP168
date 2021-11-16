import java.util.Objects;
public class Employee extends Person implements Comparable<Person> {
    private String deptName;
    private static int numEmployees = 0;
    private int employeeID;

    public Employee() {
        super();
        this.deptName = "";
        numEmployees++;
        this.employeeID = numEmployees;
    }

    public Employee(String deptName) {
        super();
        this.deptName = deptName;
        numEmployees++;
        this.employeeID = numEmployees;
    }

    public Employee(String name, int birthYear, String deptName) {
        super(name, birthYear);
        this.deptName = deptName;
        numEmployees++;
        this.employeeID = numEmployees;
    }



    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public String getDeptName(){
        return this.deptName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Employee: Department: %20s | " +
                "Employee Number: %3d", deptName, employeeID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID && Objects.equals(deptName, employee.deptName);
    }

    @Override
    public int compareTo(Person person) {
        Employee employee = (Employee) person;
        if (this.employeeID == ((Employee) person).getEmployeeID()) {
            return 0;
        }
        else if (this.employeeID < ((Employee) person).getEmployeeID()) {
            return -1;
        }
        else
            return 1;
    }
}
