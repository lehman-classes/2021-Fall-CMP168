import java.util.Arrays;
public class Faculty extends Employee implements Comparable<Person> {

    public Faculty() {
        super();
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
        this.isTenured = false;
    }

    public Faculty(boolean isTenured) {
        super();
        this.isTenured = isTenured;
        this.coursesTaught = new Course[100];
        this.numCoursesTaught = 0;
    }

    Faculty(String deptName, boolean isTenured) {
        super(deptName);
        this.isTenured = isTenured;
        this.coursesTaught = new Course[100];
    }

    Faculty(String name, int birthYear, String deptName, boolean isTenured) {
        super(name, birthYear, deptName);
        this.isTenured = isTenured;
        this.coursesTaught = new Course[100];
    }

    public void setTenured(boolean isTenured) {
        this.isTenured = isTenured;
    }

    public boolean isTenured() {
        return isTenured;
    }

    public void addCourseTaught(Course course) {
        if (numCoursesTaught < 100) {
            if(course != null) {
                coursesTaught[numCoursesTaught] = course;
                numCoursesTaught++;
            }
        }
    }

    public void addCoursesTaught(Course[] course) {
        for(int i = 0; i < course.length; i++){
            if (numCoursesTaught < 100) {
                if (course[i] != null) {
                    coursesTaught[numCoursesTaught] = course[i];
                    numCoursesTaught++;
                }
            }
        }
    }

    public int getNumCoursesTaught() {
        return this.numCoursesTaught;
    }

    public Course getCourseTaught(int index) {
        if ((index >= coursesTaught.length) || index < 0 ) {
            return null;
        } else if(coursesTaught[index] == null){
            return null;
        }
        return coursesTaught[index];
    }

    public String getCourseTaughtAsString(int index) {

            return getCourseTaught(index).toString();
    }


    public String getAllCoursesTaughtAsString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < numCoursesTaught; i++) {
            s.append(getCourseTaughtAsString(i));
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faculty)) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return numCoursesTaught == faculty.numCoursesTaught && isTenured == faculty.isTenured &&
                Arrays.equals(coursesTaught, faculty.coursesTaught);
    }

    @Override
    public String toString(){
        String IsTenured = "Is Tenured";
        String NotTenured = "Not Tenured";
        if(isTenured)
        return String.format(super.toString() + " Faculty: %11s | Number of Courses Taught: %3d | " +
                "Courses Taught: %s",IsTenured, numCoursesTaught, getAllCoursesTaughtAsString());
        else return String.format(super.toString() + " Faculty: %11s | Number of Courses Taught: %3d | " +
                "Courses Taught: %s",NotTenured, numCoursesTaught, getAllCoursesTaughtAsString());

    }


    @Override
    public int compareTo(Person person) {
        Faculty faculty = (Faculty) person;
        if (this.getNumCoursesTaught() == ((Faculty) person).getNumCoursesTaught()) {
            return 0;
        }
        else if (this.getNumCoursesTaught() < ((Faculty) person).getNumCoursesTaught()) {
            return -1;
        }
        else
            return 1;
    }






    private Course [] coursesTaught;
    private int numCoursesTaught;
    private boolean isTenured;

}
