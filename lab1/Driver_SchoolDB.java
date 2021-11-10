
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver_SchoolDB {
	

	public static void construct_object(String fName, Course[] courses, Student[] students, Faculty[] faculty,
			GeneralStaff[] generalstaffs) throws IOException {

		String fileName = fName;
		BufferedReader filereader = null;

		String line = "";
		boolean first_count = true;
		int course_c = 0, student_c = 0, faculty_c = 0, general_c = 0;
		try {
			filereader = new BufferedReader(new FileReader(fileName));

			while ((line = filereader.readLine()) != null) {
				String[] l1 = line.split(":");
				// System.out.println(l1.length);
				if (l1.length == 1) {
					if (l1[0].equals("Faculty")) {
						Faculty f1 = new Faculty();
						faculty[faculty_c++] = f1;
						// System.out.println(f1.toString());
					}
					if (l1[0].equals("GeneralStaff")) {
						GeneralStaff gs1 = new GeneralStaff();
						generalstaffs[general_c++] = gs1;
						// System.out.println(gs1.toString());
					}
					if (l1[0].equals("Student")) {
						Student s1 = new Student();
						students[student_c++] = s1;
						// System.out.println(s1);
					}
				}
				if (l1.length == 2) {

					String[] l2 = l1[1].split(",");
					// System.out.println(l2.length);
					if (l1[0].equals("Course") && l2.length == 4 && first_count) // using count differ the first
					{
						first_count = false;
						l2[0] = l2[0].trim(); // 1st one with space
						Boolean val11 = Boolean.parseBoolean(l2[0]);
						l2[1] = l2[1].trim();
						int val22 = Integer.parseInt(l2[1]);
						l2[2] = l2[2].trim();
						String val33 = l2[2];
						l2[3] = l2[3].trim();
						int val44 = Integer.parseInt(l2[3]);

						Course c1 = new Course(val11, val22, val33, val44);
						courses[course_c++] = c1;
						// System.out.println(c1.toString());

					}

					else if (l1[0].equals("Course") && l2.length == 4 && !first_count) {
						l2[0] = l2[0].trim(); // 1st one with space
						Boolean val1 = Boolean.parseBoolean(l2[0]);
						int val2 = Integer.parseInt(l2[1]);
						String val3 = l2[2];
						int val4 = Integer.parseInt(l2[3]);

						Course c2 = new Course(val1, val2, val3, val4);
						courses[course_c++] = c2;
						// System.out.println(c2.toString());

					}

					if (l1[0].equals("Faculty") && l2.length == 1) {
						String f2val = l2[0].trim();
						Boolean b = Boolean.parseBoolean(f2val);
						Faculty f2 = new Faculty(b);
						// System.out.println(f2.toString());
						faculty[faculty_c++] = f2;
					}
					if (l1[0].equals("Faculty") && l2.length == 2) {
						l2[0] = l2[0].trim();
						String deptN = l2[0];
						Boolean bt = Boolean.parseBoolean(l2[1]);
						Faculty f3 = new Faculty(deptN, bt);
						// System.out.println(f3.toString());
						faculty[faculty_c++] = f3;
					}
					if (l1[0].equals("Faculty") && l2.length == 4) {
						String fvv5 = l2[0].trim();
						int yr = Integer.parseInt(l2[1]);
						String dpt = l2[2];
						Boolean v = Boolean.parseBoolean(l2[3]);
						Faculty f4 = new Faculty(fvv5, yr, dpt, v);
						// System.out.println(f4.toString());
						faculty[faculty_c++] = f4;

					}

					if (l1[0].equals("GeneralStaff") && l2.length == 1) {
						String gst2 = l2[0].trim(); // duty
						GeneralStaff gs2 = new GeneralStaff(gst2);
						// System.out.println(gs2.toString());
						generalstaffs[general_c++] = gs2;

					}

					if (l1[0].equals("GeneralStaff") && l2.length == 2) {
						String gen_deptn = l2[0].trim();
						String gen_duty = l2[1];
						GeneralStaff gs3 = new GeneralStaff(gen_deptn, gen_duty);
						// System.out.println(gs3.toString());
						generalstaffs[general_c++] = gs3;
					}
					if (l1[0].equals("GeneralStaff") && l2.length == 4) {
						String gen_name = l2[0].trim();
						int gen_byr = Integer.parseInt(l2[1]);
						String gen4_deptn = l2[2];
						String gen4_duty = l2[3];
						GeneralStaff gs4 = new GeneralStaff(gen_name, gen_byr, gen4_deptn, gen4_duty);
						// System.out.println(gs4.toString());
						generalstaffs[general_c++] = gs4;
					}
					if (l1[0].equals("Student") && l2.length == 1) {
						l2[0] = l2[0].trim();
						Boolean isG = Boolean.parseBoolean(l2[0]);
						Student s2 = new Student(isG);
						// System.out.println(s2.toString());
						students[student_c++] = s2;
					}
					if (l1[0].equals("Student") && l2.length == 2) {
						String dept_s = l2[0].trim();
						Boolean isg2 = Boolean.parseBoolean(l2[1]);
						Student s3 = new Student(dept_s, isg2);
						// System.out.println(s3.toString());
						students[student_c++] = s3;
					}
					if (l1[0].equals("Student") && l2.length == 4) {
						String name_s2 = l2[0].trim();
						int yr_s = Integer.parseInt(l2[1]);
						String dept_s2 = l2[2];
						Boolean isg3 = Boolean.parseBoolean(l2[3]);

						Student s4 = new Student(name_s2, yr_s, dept_s2, isg3);
						// System.out.println(s4.toString());
						students[student_c++] = s4;
					}

				}

			}

		} catch (Exception excp) {
			excp.printStackTrace();
		}

		System.out.println("COURSES:");
		for (int i = 0; i < course_c; i++) {
			System.out.println(courses[i].toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("PERSONS:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("EMPLOYEES:");
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("GENERAL STAFF:");
		for (int k = 0; k < general_c; k++) {
			System.out.println(generalstaffs[k].toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("FACULTY:");
		for (int j = 0; j < faculty_c; j++) {
			System.out.println(faculty[j].toString());
		}
		System.out.println("************************************************");
		System.out.println("************************************************");
		System.out.println("STUDENTS:");
		for (int k = 0; k < student_c; k++) {
			System.out.println(students[k].toString());
		}
		System.out.println("************************************************");
		System.out.println("**************************************************************\n");

	}

	public static void main(String[] args) {
		String fileName = "SchoolDB_Initial.txt";
		Scanner inStream = null;
		Course[] courses = new Course[9];
		Student[] students = new Student[7];
		Faculty[] faculty = new Faculty[7];
		GeneralStaff[] generalstaffs = new GeneralStaff[7];

		try {
			File file = new File(fileName);
			if (file.exists() && file.canRead()) {
				inStream = new Scanner(file);

				while (inStream.hasNextLine()) {
					String theLine = inStream.nextLine();
					System.out.println(theLine);

				}
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("Cannot read from file " + fileName);
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				inStream.close();
				System.out.println("**************************************************************");
			}
		}

		System.out.println("SCHOOL DATABASE INFO:\n");
		System.out.println("************************************************");
		try {
			construct_object(fileName, courses, students, faculty, generalstaffs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("An exception " + e.getMessage());
		}
	}
}



