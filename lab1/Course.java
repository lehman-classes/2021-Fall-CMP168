
public class Course implements Comparable<Course> {
	
	private boolean isGraduateCourse;
	private int courseNum;
	private String courseDept;
	private int numCredits;
	
	public Course(boolean graduate, int courseNum, String dept, int numCredits) {
		super();
		this.isGraduateCourse=graduate;
		this.courseNum=courseNum;
		this.courseDept=dept;
		this.numCredits=numCredits;
	}
	
	public boolean isGraduateCourse() {
		return isGraduateCourse;
	}

	public int getCourseNum() {
		return courseNum;
	}

	public String getCourseDept() {
		return courseDept;
	}

	public int getNumCredits() {
		return numCredits;
	}
	
	public String getCourseName() {
		if(isGraduateCourse) {
			return "G"+ courseDept + "" + courseNum;
		}
		else {
			return "U" + courseDept + "" + courseNum;
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Course) {
			Course objCourse = (Course) obj;
			return this.isGraduateCourse == objCourse.isGraduateCourse() && this.courseDept.equals(objCourse.courseDept) && this.courseNum == objCourse.getCourseNum() && this.numCredits == objCourse.getNumCredits();
		}
		
		return false;
	}
	@Override
	public String toString() {
		String s = String.format("Course: %3s-%3d | Number of Credits: %02d | %s", getCourseDept(), 
                                 courseNum, numCredits, (isGraduateCourse ? "Graduate" : "Undergraduate"));
				
		return s;
	} 
	
	@Override

	 public int compareTo(Course c) {
		 if(this.courseNum > c.courseNum) {
			 return 1;
		 }
		 if(this.courseNum < c.courseNum) {
			 return -1;
		 }
		 else {
			 return 0;
		 }
	        

	    }
	

}


	
