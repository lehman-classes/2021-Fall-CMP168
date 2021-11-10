
public class Student extends Person {
	private static int numStudents;
	private int studentID;
	private Course[] coursesTaken;
	private int numCoursesTaken = 0;
	private boolean isGraduate;
	private String major;

	public Student() {
		super();
		numStudents++;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.isGraduate = false;
		this.numCoursesTaken = 0;
		this.major = "undeclared";
	}

	public Student(boolean isGraduate) {
		super();
		this.isGraduate = isGraduate;
		numStudents++;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.major = "undeclared";
		this.numCoursesTaken = 0;
	}

	public Student(String major, boolean isGraduate) {
		this.major = major;
		this.isGraduate = isGraduate;
		numStudents++;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}

	public Student(String name, int birthYear, String major, boolean isGraduate) {
		super(name, birthYear);
		this.major = major;
		this.isGraduate = isGraduate;
		numStudents++;
		this.studentID = numStudents;
		this.coursesTaken = new Course[50];
		this.numCoursesTaken = 0;
	}

	public boolean isGraduate() {
		return isGraduate;
	}

	public void setGraduate(boolean isGraduate) {
		this.isGraduate = isGraduate;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public static int getNumStudents() {
		return numStudents;
	}

	public int getStudentID() {
		return studentID;
	}

	public int getNumCoursesTaken() {
		return this.numCoursesTaken;
	}
public static int getStudentCredits(Student s) {
		
		int credits = 0;
		for (int i = 0; i < s.getNumCoursesTaken(); i++) {
			credits += s.coursesTaken[i].getNumCredits();
		}

		return credits;
	}



	public void addCourseTaken(Course course) {
		if(numCoursesTaken < 50)
		coursesTaken[numCoursesTaken] = course;
		numCoursesTaken++;
	}

	public void addCoursesTaken(Course[] courses) {
		if(numCoursesTaken + courses.length <= 50)
		for (int i = 0; i < courses.length; i++) {
			addCourseTaken(courses[i]);
		}
	}

	public Course getCourseTaken(int index) {
		return coursesTaken[index];
	}

	public String getCourseTakenAsString(int index) {
		if ((index >= numCoursesTaken) || (index < 0)) {
			return "";
		} else {

			return coursesTaken[index].getCourseDept() + "-" + coursesTaken[index].getCourseNum();
		}
	}

	public String getAllCoursesTakenAsString() {
		String s = "";
		for (int i = 0; i < numCoursesTaken; i++) {
			s += getCourseTakenAsString(i);
		}
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student objS = (Student) obj;
			return super.equals(objS) && this.isGraduate == objS.isGraduate && this.studentID == objS.studentID
					&& this.major.equals(objS.major) && this.numCoursesTaken == objS.numCoursesTaken;
		}
		return false;
	}

	@Override
	public String toString() {
		String grad = "";
		if (isGraduate) {
			grad += "Graduate";
		} else {
			grad += "Undergraduate";
		}
		return super.toString() + String.format(
				" Student: studentID: %04d | Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
				studentID, major, grad, this.numCoursesTaken, getAllCoursesTakenAsString());
	}

	@Override
	public int compareTo(Person p) {
		if(p instanceof Student) {
			Student other = (Student)p;
			if(getStudentCredits(this) > getStudentCredits(other)) {
				return 1;
			}
			else if(getStudentCredits(this) < getStudentCredits(other)) {
				return -1;
			}
		}
		return 0;
	}

	

}
