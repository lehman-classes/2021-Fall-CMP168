
public class Faculty extends Employee {

	private Course[] coursesTaught;
	private int numCoursesTaught;
	private boolean isTenured;

	public Faculty() {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		isTenured = false;
	}

	public Faculty(boolean tenure) {
		super();
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
		this.isTenured = tenure;
	}

	public Faculty(String dept, boolean tenure) {
		super(dept);
		this.isTenured = tenure;
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
	}

	public Faculty(String name, int birth, String dept, boolean tenure) {
		super(name, birth, dept);
		this.isTenured = tenure;
		coursesTaught = new Course[100];
		numCoursesTaught = 0;
	}

	public boolean isTenured() {
		return this.isTenured;
	}

	public int getNumCoursesTaught() {
		return this.numCoursesTaught;
	}

	public void setIsTenured(boolean tenure) {
		this.isTenured = tenure;
	}

	public void addCourseTaught(Course course) {
		if (this.getNumCoursesTaught() < this.coursesTaught.length) {
			coursesTaught[numCoursesTaught] = course;
			numCoursesTaught++;
		}
	}

	public void addCoursesTaught(Course[] course) {
		for (int i = 0; numCoursesTaught < course.length; i++) {
			coursesTaught[numCoursesTaught] = course[i];
			numCoursesTaught++;
		}
	}

	public Course getCourseTaught(int index) {
		if ((index < 0) || (index > numCoursesTaught - 1)) {
			return null;
		}
		return coursesTaught[index];
	}

	public String getCourseTaughtAsString(int index) {
		if ((index < 0) || (index > numCoursesTaught - 1)) {
			return "";
		}
		return coursesTaught[index].getCourseDept() + "-" + coursesTaught[index].getCourseNum();
	}

	public String getAllCoursesTaughtAsString() {
		String output = "";
		for (int i = 0; i < numCoursesTaught; i++) {
			output += getCourseTaughtAsString(i);
		}
		return output;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Faculty) {
			Faculty objFac = (Faculty) obj;
			return this.getDeptName().contentEquals(objFac.getDeptName())
					&& (this.getEmployeeID() == objFac.getEmployeeID())
					&& (this.getAllCoursesTaughtAsString().contentEquals(objFac.getAllCoursesTaughtAsString()))
					&& (this.getNumCoursesTaught() == objFac.getNumCoursesTaught())
					&& (this.isTenured() == objFac.isTenured);
		}
		return false;
	}

	@Override
	public String toString() {
		String tenure = "";
		if (isTenured) {
			tenure += "Is Tenured";
		} else {
			tenure += "Not Tenured";
		}
		return String.format("%s Faculty: %11s | Number of Courses Taught: %3d | Courses Taught: %s", super.toString(),
				tenure, numCoursesTaught, getAllCoursesTaughtAsString());
	}

	@Override
	public int compareTo(Person p) {
		if (p instanceof Faculty) {
			Faculty objFac = (Faculty) p;
			if (this.getNumCoursesTaught() > objFac.getNumCoursesTaught()) {
				return 1;
			}
			if (this.getNumCoursesTaught() < objFac.getNumCoursesTaught()) {
				return -1;
			}
		} else {
			return super.compareTo(p);
		}
		return 0;
	}
}
