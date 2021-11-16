/*https://www.youtube.com/watch?v=uXLnBdzWEPg*/
import java.io.*;
import java.util.*;
public class Driver_SchoolDB {
    public static ArrayList<Course> allCourses = new ArrayList<>();
    public static ArrayList<GeneralStaff> allGeneralStaff = new ArrayList<>();
    public static ArrayList<Student> allStudents = new ArrayList<>();
    public static ArrayList<Faculty> allFaculties = new ArrayList<>();

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        do {
            System.out.println(
                    "Press 1 to create 3 new Course's\n"+
                    "Press 2 to create 3 new Faculty member's\n" +
                    "Press 3 to create 3 new GeneralStaff member's\n" +
                    "Press 4 to create 3 new Student member's\n" +
                            "Press 0 to Enter Submenu");

            userInput = scanner.nextInt();

                switch (userInput) {

                    case 1:
                        System.out.println("Going to Course Menu");
                        courseCreation();
                        break;

                    case 2:
                        System.out.println("Going to Faculty Menu");
                        facultyCreation();
                        break;
                    case 3:
                        System.out.println("Going to GeneralStaff Menu");
                        generalStaffCreation();
                        break;

                    case 4:
                        System.out.println("Going to Student Menu");
                        studentCreation();
                        break;
                    default:
                }
        } while (userInput != 0);
    }

    public static void courseCreation()  {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create new course.");
        while (true) {
            System.out.println("Please enter: \"True\" or  \"False\"");
            try {
                boolean isGraduateCourse = scanner.nextBoolean();
                System.out.println("Please enter the Course Number");
                int courseNumber = scanner.nextInt();
                System.out.println("Please enter Course Department");
                String courseDepartment = scanner.next();
                System.out.println("Please enter number of Credits");
                int numberOfCredits = scanner.nextInt();


                Course course = new Course(isGraduateCourse, courseNumber, courseDepartment, numberOfCredits);


                allCourses.add(course);


            } catch (Exception e) {
                System.out.println("Something went wrong.");
                scanner.next();
            }

            System.out.println("Would you like to continue? " +
                    "Press 1 for yes or any other number to return to the Main Menu");
            String choice = scanner.next();
            if(!choice.equals( "1")){
                break;
            }
        }
    }
    public static Course courseCreation(Faculty faculty) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Create new course.");

        System.out.println("Please enter: \"True\" or  \"False\"");
        try {
            boolean isGraduateCourse = scanner.nextBoolean();
            System.out.println("Please enter the Course Number");
            int courseNumber = scanner.nextInt();
            System.out.println("Please enter Course Department");
            String courseDepartment = scanner.next();
            System.out.println("Please enter number of Credits");
            int numberOfCredits = scanner.nextInt();


            Course course = new Course(isGraduateCourse, courseNumber, courseDepartment, numberOfCredits);


            allCourses.add(course);
            return course;


        } catch (Exception e) {
            System.out.println("Something went wrong.");
            scanner.next();
            return null;
        }
    }
    public static Course courseCreation(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create new course.");

        System.out.println("Please enter: \"True\" or  \"False\"");
        try {
            boolean isGraduateCourse = scanner.nextBoolean();
            System.out.println("Please enter the Course Number");
            int courseNumber = scanner.nextInt();
            System.out.println("Please enter Course Department");
            String courseDepartment = scanner.next();
            System.out.println("Please enter number of Credits");
            int numberOfCredits = scanner.nextInt();


            Course course = new Course(isGraduateCourse, courseNumber, courseDepartment, numberOfCredits);


            allCourses.add(course);
            return course;


        } catch (Exception e) {
            System.out.println("Something went wrong.");
            scanner.next();
            return null;
        }
    }

    public static void facultyCreation() {
        Scanner scanner = new Scanner(System.in);
        String facultyName = "";
        int yearBirth = 0;
        while(allFaculties.size()< 3){
            try {
                System.out.printf("Must format Faculty one of these three ways: " +
                        "Example:\nFaculty: true\nFaculty: MAT,false\nFaculty: Superman,1938,PHY,true%n");

                String s = scanner.nextLine();
                String[] arr = s.split("\\W+");
                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < arr.length; i++) {
                    for (char c : arr[i].toCharArray()) {
                        if (Character.isDigit(c)) {
                            stringBuilder.append(c);
                            yearBirth = Integer.parseInt(stringBuilder.toString());
                        }
                    }
                    if (isBoolean(arr[i])) {
                        String temp = arr[arr.length - 1];
                        arr[arr.length - 1] = arr[i];
                        arr[i] = temp;
                    }
                }
                if (arr.length == 4) {
                    try {
                        Faculty faculty= new Faculty(arr[0], yearBirth,
                                facultyName, Boolean.parseBoolean(arr[arr.length - 1]));
                        allFaculties.add(faculty);
                        System.out.println(faculty);
                    } catch (InputMismatchException e) {
                       facultyCreation();
                    }

                } else if (arr.length == 2) {
                    Faculty faculty = new Faculty(facultyName, Boolean.parseBoolean(arr[arr.length - 1]));
                    allFaculties.add(faculty);
                    System.out.println(faculty);
                } else if (arr.length == 1) {
                    if (isBoolean(arr[0])) {
                        try {
                            Faculty faculty = new Faculty(Boolean.parseBoolean(arr[0]));
                            allFaculties.add(faculty);
                            System.out.println(faculty);
                        } catch (InputMismatchException e) {
                            facultyCreation();
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("Something went wrong");
            }
        }
        if(allFaculties.size()>=3) {
            System.out.println("Maximum number of courses you can add has been reached. Returning to Main Menu");
        }
    }public static void generalStaffCreation() {
        Scanner scanner = new Scanner(System.in);
        String Duty;
        String Department;

        System.out.println("Please enter Department");
        Department = scanner.nextLine();
        System.out.println("Please enter Duty");
        Duty = scanner.nextLine();
        GeneralStaff generalStaff = new GeneralStaff(Department,Duty);
        allGeneralStaff.add(generalStaff);

    }

    public static void studentCreation(){Scanner scanner = new Scanner(System.in);
        String course = "";
        int yearBirth = 0;
        while(allStudents.size()< 3){
            try {
                System.out.printf("Must format Student one of these three ways: " +
                        "Example:\nStudent: true\nStudent: MAT,false\nStudent: Superman,1938,PHY,true%n");

                String s = scanner.nextLine();
                String[] arr = s.split("\\W+");
                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < arr.length; i++) {
                    for (char c : arr[i].toCharArray()) {
                        if (Character.isDigit(c)) {
                            stringBuilder.append(c);
                            yearBirth = Integer.parseInt(stringBuilder.toString());
                        }
                    }
                    if (isBoolean(arr[i])) {
                        String temp = arr[arr.length - 1];
                        arr[arr.length - 1] = arr[i];
                        arr[i] = temp;
                    }
                    if (arr[i].length() == 3) {
                        course = arr[i];
                    }
                }
                if (arr.length == 4) {
                    try {
                        Student student = new Student(arr[0], yearBirth, course,
                                Boolean.parseBoolean(arr[arr.length - 1]));
                        allStudents.add(student);
                        System.out.println(student);
                    } catch (InputMismatchException e) {
                        studentCreation();
                    }

                } else if (arr.length == 2) {
                    Student student = new Student(course, Boolean.parseBoolean(arr[arr.length - 1]));
                    allStudents.add(student);
                    System.out.println(student);
                } else if (arr.length == 1) {
                    if (isBoolean(arr[0])) {
                        try {
                            Student student = new Student(Boolean.parseBoolean(arr[0]));
                            allStudents.add(student);
                            System.out.println(student);
                        } catch (InputMismatchException e) {
                            studentCreation();
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("Something went wrong");
            }
        }
        if(allStudents.size()>=3) {
            System.out.println("Maximum number of courses you can add has been reached. Returning to Main Menu");
        }
    }


    public static void subMenu() {
        Scanner scanner = new Scanner(System.in);
        int userInput;

      try {
          do {
              System.out.println("Welcome to the sub- Menu\n" +
                      "Press 0 To exit\n" +
                      "Press 1 To Access And Edit Faculty(s)\n" +
                      "Press 2 To Access And Edit Student(s)\n" +
                      "Press 3 To determine which course has the least course number " +
                      "and which course is the largest. ");
              userInput = scanner.nextInt();
              switch (userInput) {
                  case 1:
                      System.out.println("Faculty member");
                      setAllFaculties();
                      break;
                  case 2:
                      System.out.println("Edit Student ");
                      setAllStudents();
                      break;
                  case 3:
                      Collections.sort(allCourses);
                      System.out.println(allCourses.get(0).getCourseName() + " is the smallest course in the catalog.");
                      System.out.println(allCourses.get(allCourses.size()-1).getCourseName() +
                              " is the largest course in the catalog.");

              }
          } while (userInput != 0);
      }catch (InputMismatchException e){
          System.out.println("Error returning to Sub-Menu");
          subMenu();

      } catch (ArrayIndexOutOfBoundsException e){
          System.out.println("Something went wrong. Returning to Sub-Menu");
          subMenu();
      }catch (IndexOutOfBoundsException e){
          System.out.println("That's not right. Returning to Sub-Menu");
          subMenu();
      } catch (NullPointerException nullPointerException){
          System.out.println("That was unexpected. Returning to Sub-Menu");
          subMenu();
      }

    }
    public static void setAllFaculties() {
        Scanner scanner = new Scanner(System.in);
        String isq = "l";
        int userInput2;

        do{
            System.out.println("Type 0 to return to sub menu.\n" +
                    "Press 1 to add 2 existing courses to a Faculty member\n" +
                    "Press 2 to add 2 to add two new courses to a Faculty member\n" +
                    "Press 3 to retrieve course taught by Faculty member\n" +
                    "Press 4 to determine if a course is taught by a specific Faculty member\n" +
                    "Press 5 to determine which Faculty member teaches the most and least amount of courses");

            switch (scanner.nextInt()) {


                case 0: {
                    System.out.println("Returning to sub menu");
                    subMenu();
                }
                case 1: {
                    System.out.println("Type index of Faculty member to add two existing courses");
                    userInput2 = scanner.nextInt();
                    if (allFaculties.get(userInput2).getName().isEmpty()) {
                        System.out.println("Please create a name for this Faculty member");
                        allFaculties.get(userInput2).setName(scanner.next());
                    }
                    if (allFaculties.get(userInput2).getBirthYear() == 0) {
                        System.out.println("Add Birth year");
                        allFaculties.get(userInput2).setBirthYear(scanner.nextInt());
                    }
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Type index of the course to add");
                        allFaculties.get(userInput2).addCourseTaught(allCourses.get(scanner.nextInt()));
                    }
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 2:{
                    System.out.println("Type index of Faculty member to add two new courses");
                    userInput2 = scanner.nextInt();
                    if (allFaculties.get(userInput2).getName().isEmpty()) {
                        System.out.println("Please create a name for this Faculty member");
                        allFaculties.get(userInput2).setName(scanner.next());
                    }
                    if (allFaculties.get(userInput2).getBirthYear() == 0) {
                        System.out.println("Add Birth year");
                        allFaculties.get(userInput2).setBirthYear(scanner.nextInt());
                    }
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Type index of the course to add");
                        allFaculties.get(userInput2).addCourseTaught(courseCreation(allFaculties.get(userInput2)));
                    }
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 3: {
                    System.out.println("Type index of Faculty and type index of course");
                    System.out.println(
                            allFaculties.get(scanner.nextInt()).getCourseTaught(scanner.nextInt()).toString());
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 4: {
                    System.out.println("Choose a Faculty member index");
                    int facultyMember = scanner.nextInt();
                    System.out.println("Choose course to determine if it is taught by the Faculty Member you choose");
                    int course = scanner.nextInt();
                    for(int i = 0; i < allFaculties.get(facultyMember).getNumCoursesTaught(); i++){
                       if(allFaculties.get(facultyMember).getCourseTaught(i).equals(allCourses.get(course))){
                            System.out.println(allCourses.get(course) +
                                    " is taught by " +allFaculties.get(facultyMember));
                        }
                    }
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 5:{
                    System.out.println("Calculating order....");
                    Collections.sort(allFaculties);
                    System.out.println(allFaculties.get(0) + ": Teaches the least");
                    System.out.println(allFaculties.get(allFaculties.size()-1).toString() +
                            ": Teaches the most amount of classes");
                    System.out.println("Press anything to exit.\nPress q to do another select another action.");
                    isq = scanner.next();
                    break;
                }

            }
        }while (isq.equals("q"));
    }

    public static void setAllStudents(){Scanner scanner = new Scanner(System.in);
        String isq = "l";
        int userInput2;

        do{
            System.out.println("Type 0 to return to the Sub-Menu.\n" +
                    "Press 1 to add 2 existing courses to a Student\n" +
                    "Press 2 to add 2 new courses to a Student\n" +
                    "Press 3 to get course taken by Student\n" +
                    "Press 4 to calculate which Student has the most credits and " +
                    "which student has the least amount of credits");

            switch (scanner.nextInt()) {


                case 0: {
                    System.out.println("Returning to sub menu");
                    subMenu();
                }
                case 1: {
                    System.out.println("Type index of the Student to add two new courses");
                    userInput2 = scanner.nextInt();
                    if (allFaculties.get(userInput2).getName().isEmpty()) {
                        System.out.println("Please create a name for this Student member");
                        allFaculties.get(userInput2).setName(scanner.next());
                    }
                    if (allFaculties.get(userInput2).getBirthYear() == 0) {
                        System.out.println("Add Birth year");
                        allFaculties.get(userInput2).setBirthYear(scanner.nextInt());
                    }
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Type index of the course to add");
                        allStudents.get(userInput2).addCourseTaken(allCourses.get(scanner.nextInt()));
                        System.out.println(allFaculties.get(userInput2).toString());


                    }
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 2:{
                    System.out.println("Type index of Student to add two new courses");
                    userInput2 = scanner.nextInt();
                    if (allStudents.get(userInput2).getName().isEmpty()) {
                        System.out.println("Please create a name for this Student");
                        allStudents.get(userInput2).setName(scanner.next());
                    }
                    if (allStudents.get(userInput2).getBirthYear() == 0) {
                        System.out.println("Add Birth year");
                        allStudents.get(userInput2).setBirthYear(scanner.nextInt());
                    }
                    for (int i = 0; i < 2; i++) {
                        System.out.println("Type index of the course to add");
                        allFaculties.get(userInput2).addCourseTaught(courseCreation(allStudents.get(userInput2)));
                    }
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;

                }
                case 3: {
                    System.out.println("Type index of Student and type index of course");
                    System.out.println(allStudents.get(scanner.nextInt()).getCourseTaken(scanner.nextInt()).toString());
                    System.out.println("Press q to do another select another action.\nPress anything to exit");
                    isq = scanner.next();
                    break;
                }
                case 4:{
                    System.out.println("Calculating order....");
                    Collections.sort(allStudents);
                    System.out.println(allStudents.get(0) + ": Has the least amount of credits");
                    System.out.println(allStudents.get(allStudents.size()-1).toString() +
                            ": Has the most amount of credits");
                    System.out.println("Press anything to exit.\nPress q to do another select another action.");
                    isq = scanner.next();
                    break;
                }
            }
        }while (isq.equals("q"));
    }


    public static boolean isBoolean(String s){
        return Boolean.parseBoolean(s);
    }
    public static void writeFile(PrintWriter printer, Course[] courses, Faculty[] faculties,
                                 GeneralStaff[] generalStaffs, Student[] students) {
        printer.println("\n**************************************************************\n" +
                "SCHOOL DATABASE INFO:\n" +
                "\n" +
                "************************************************\n" +
                "COURSES:");
        for (Course cours : courses) {
            printer.println(cours.toString());
        }
        printer.println("************************************************\n" +
                "************************************************\n" +
                "PERSONS:\n" +
                "************************************************\n" +
                "************************************************\n" +
                "EMPLOYEES:\n" +
                "************************************************\n" +
                "************************************************\n" +
                "GENERAL STAFF:");
        for (GeneralStaff generalStaff : generalStaffs) {
            printer.println(generalStaff.toString());
        }
        printer.println("************************************************\n" +
                "************************************************\n" +
                "FACULTY:");

        for (Faculty faculty : faculties) {
            printer.println(faculty.toString());
        }
        printer.println("************************************************\n" +
                "************************************************\n" +
                "STUDENTS:");
        for (Student student : students) {
            printer.println(student.toString());
        }
        printer.println("************************************************\n" +
                "**************************************************************\n");
        printer.flush();

    }

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("SchoolDB_Initial.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);
        }


        Course course = new Course(true, 771, "MAT", 4);
        Course course1 = new Course(true, 777, "CMP", 4);
        Course course2 = new Course(true, 711, "CMP", 4);
        Course course3 = new Course(true, 723, "MAT", 4);
        Course course4 = new Course(false, 168, "CMP", 4);
        Course course5 = new Course(false, 338, "CMP", 4);
        Course[] courses = {course, course1, course2, course3, course4, course5};

        Faculty faculty = new Faculty();
        Faculty faculty1 = new Faculty(true);
        Faculty faculty2 = new Faculty("MAT", false);
        Faculty faculty3 = new Faculty("Superman", 1938, "PHY", true);
        Faculty[] faculties = {faculty, faculty1, faculty2, faculty3};


        Student student = new Student();
        Student student1 = new Student(false);
        Student student2 = new Student("Math", false);
        Student student3 = new Student("Wonderwoman", 1941, "JST", true);
        Student[] students = {student, student1, student2, student3};

        GeneralStaff generalStaff = new GeneralStaff();
        GeneralStaff generalStaff1 = new GeneralStaff("advise students");
        GeneralStaff generalStaff2 = new GeneralStaff("Sanitation", "clean");
        GeneralStaff generalStaff3 = new GeneralStaff("Flash Gordon", 1934, "Security",
                "safety");

        GeneralStaff[] generalStaffs = {generalStaff, generalStaff1, generalStaff2, generalStaff3};

        FileOutputStream fileStream = new FileOutputStream("SchoolDB_Updated.txt");
        PrintWriter outFs = new PrintWriter(fileStream);
        writeFile(outFs, courses, faculties, generalStaffs, students);
        outFs.close();

        PrintWriter printSystem = new PrintWriter(System.out);
        writeFile(printSystem, courses, faculties, generalStaffs, students);
        /*
        menu();
        allCourses.addAll(Arrays.asList(courses));
        allFaculties.addAll(Arrays.asList(faculties));
        allGeneralStaff.addAll(Arrays.asList(generalStaffs));
        allStudents.addAll(Arrays.asList(students));
        subMenu();
        new FileOutputStream("SchoolDB_Updated.txt").close();
        fileStream = new FileOutputStream("SchoolDB_Updated.txt");
        outFs = new PrintWriter(fileStream);


        writeFile(outFs,allCourses.toArray(new Course[0]), allFaculties.toArray(new Faculty[0]),
                allGeneralStaff.toArray(new GeneralStaff[0]), allStudents.toArray(new Student[0]));
        outFs.close();

        writeFile(printSystem,allCourses.toArray(new Course[0]), allFaculties.toArray(new Faculty[0]),
                allGeneralStaff.toArray(new GeneralStaff[0]), allStudents.toArray(new Student[0]));
        printSystem.close();*/

    }
}

