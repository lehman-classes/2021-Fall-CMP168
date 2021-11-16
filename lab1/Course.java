import java.util.Objects;
public class Course implements Comparable<Course> {

    public Course(boolean isGraduateCourse, int courseNum, String courseDept, int numCredits) {
    this.isGraduateCourse = isGraduateCourse;
    this.courseNum = courseNum;
    this.courseDept = courseDept;
    this.numCredits = numCredits;
    }

    public boolean  isGraduateCourse(){
        return isGraduateCourse;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public String getCourseDept() {

        return courseDept;
    }
    public String getCourseName() {
        if(isGraduateCourse){
            return "G" + courseDept + courseNum;
        }
        else
            return "U" + courseDept + courseNum;

    }
    @Override
    public String toString(){
        String ternary = isGraduateCourse ? "Graduate" : "Undergraduate";
        return String.format("Course: %3s-%3d | Number of Credits: %02d | " + ternary,
                courseDept, courseNum, numCredits, isGraduateCourse);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return isGraduateCourse == course.isGraduateCourse && courseNum == course.courseNum &&
                numCredits == course.numCredits && Objects.equals(courseDept, course.courseDept)
                && Objects.equals(getCourseName(), course.getCourseName());
    }

    private boolean isGraduateCourse;
    private int courseNum;
    private String courseDept;
    private int numCredits;

    @Override
    public int compareTo(Course o) {
        if(this.courseNum == o.courseNum)
             return 0;
        else if(this.courseNum < o.courseNum)
            return -1;
        else
            return 1;
    }
}
