import java.util.Arrays;
import java.util.Objects;

public class Student extends Person implements Comparable<Person> {


    public Student() {
        super();
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = false;
        this.major = "undeclared";
        numStudents++;
        this.studentID = numStudents;
    }

    public Student(boolean isGraduate) {
        super();

        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = "undeclared";
        numStudents++;
        this.studentID = numStudents;
    }

    Student(String major, boolean isGraduate) {
        super();

        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        numStudents++;
        this.studentID = numStudents;
    }

    Student(String name, int birthYear, String major, boolean isGraduate) {
        super(name, birthYear);
        this.coursesTaken = new Course[50];
        this.numCoursesTaken = 0;
        this.isGraduate = isGraduate;
        this.major = major;
        numStudents++;
        this.studentID = numStudents;
    }

    public boolean isGraduate() {
        return isGraduate;
    }

    public int getNumCoursesTaken() {
        return numCoursesTaken;
    }

    public static int getNumStudents() {
        return numStudents;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void addCourseTaken(Course course) {
        if (numCoursesTaken < 50) {
            if(course != null) {
                coursesTaken[numCoursesTaken] = course;
                numCoursesTaken++;
            }
        }
    }

    public void addCoursesTaken(Course[] course) {
            for (int i = 0; i < course.length; i++){
                if(numCoursesTaken < 50){
                if(course[i] != null) {
                    coursesTaken[numCoursesTaken] = course[i];
                    numCoursesTaken++;
                }
            }
        }
    }

    public Course getCourseTaken(int index) {
        if ((index >= coursesTaken.length) || index < 0) {
            return null;
        } if (coursesTaken[index] == null) {
            return null;
        }
        return coursesTaken[index];
    }

    public String getCourseTakenAsString(int index) {
        if(index < 0 ||(index >= coursesTaken.length)) {
            return "courseDept-courseNum";
        }
        if(coursesTaken[index] == null) {
            return "courseDept-courseNum";
        }
        return getCourseTaken(index).toString();
    }

    public String getAllCoursesTakenAsString() {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < numCoursesTaken; i++) {
            s.append(getCourseTakenAsString(i));
        }
        return s.toString();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return studentID == student.studentID && isGraduate == student.isGraduate &&
                numCoursesTaken == student.numCoursesTaken && Arrays.equals(coursesTaken, student.coursesTaken)
                && Objects.equals(major, student.major);
    }

    public int coursesCreditAdder() {
        int cout = 0;
        for (int i = 0; i < numCoursesTaken; i++) {
            if (coursesTaken[i] != null) {
                cout += coursesTaken[i].getNumCredits();
            }
        }
        return cout;
    }

    @Override
    public String toString() {
        String graduate = "Graduate";
        String isUndergrad = "Undergraduate";
        if (isGraduate) {
            return String.format(super.toString() + " Student: studentID: %04d | " +
                            "Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
                    studentID, major, graduate , numCoursesTaken, getAllCoursesTakenAsString());
        } else return String.format(super.toString() + " Student: studentID: %04d | " +
                        "Major %20s | %14s | Number of Courses Taken: %3d | Courses Taken: %s",
                studentID, major, isUndergrad, numCoursesTaken, getAllCoursesTakenAsString());
    }

    @Override
    public int compareTo(Person person) {

        if (this.coursesCreditAdder() == ((Student) person).coursesCreditAdder()) {
            return 0;
        }
        else if (this.coursesCreditAdder() < ((Student) person).coursesCreditAdder()) {
            return -1;
        }
        else
            return 1;
    }


    private static int numStudents = 0;
    private int studentID;
    private Course coursesTaken[];
    private boolean isGraduate;
    private String major;
    private int numCoursesTaken;
    
}
