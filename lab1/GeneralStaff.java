
public class GeneralStaff extends Employee {
	private String duty;

	public GeneralStaff() {
		super();
		this.duty = "";
	}

	public GeneralStaff(String duty) {
		super();
		this.duty=duty;
	}
	public GeneralStaff(String name, String deptName) {
		super(name);
		this.duty=deptName;
	}

	public GeneralStaff(String name, int birthYear, String deptName, String d) {
		super(name, birthYear, deptName);
		this.duty=d;
	}

	public String getDuty() {
		return this.duty;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof GeneralStaff) {
			GeneralStaff objGS = (GeneralStaff)obj;
			return super.equals(objGS) && this.duty==objGS.duty;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(" GeneralStaff: Duty: %10s", duty);
	}

	public int compareTo(Employee p) {
		return super.compareTo(p);
	}
}
