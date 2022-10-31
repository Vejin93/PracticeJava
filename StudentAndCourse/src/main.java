import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Program for enter data for students
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < numberOfStudents; i++) {
            Student tempStudent = new Student();
            System.out.println("===================");
            System.out.println("Enter data for student " + (i + 1) + ":\nName:");
            String tempName = scanner.next();
            tempStudent.setName(tempName);

            System.out.println("StudentId: ");
            tempStudent.setStudentId(scanner.next());

            System.out.println("Number of courses: ");
            tempStudent.setNumberOfCourses(scanner.nextInt());

            List<Course> coursesTemp = new ArrayList<>();
            int j = 0;
            while (j < tempStudent.getNumberOfCourses()) {
                Course courseTemp = new Course();
                System.out.println("Grade of course " + (j + 1) + ":");
                int retVal = scanner.nextInt();
                if (retVal >= 5 && retVal <= 10) {
                    courseTemp.setGrade(retVal);
                    coursesTemp.add(courseTemp);
                    j++;
                } else {
                    System.out.println("Out of range! (Grade is from 5 to 10)! Enter again: ");
                }
                tempStudent.setCourses(coursesTemp);
            }
            students.add(tempStudent);
        }
        for (Student student : students) {
            int max = 0;
            int counter = 0;
            List<Course> tempCourses = student.getCourses();
            for (int i = 0; i < tempCourses.size(); i++) {
                if (tempCourses.get(i).getGrade() > 5 && tempCourses.get(i).getGrade() <= 10) {
                    counter++;
                }
                if (tempCourses.get(i).getGrade() > max) {
                    max = tempCourses.get(i).getGrade();
                }
            }
            System.out.println("\nStudent " + student.getStudentId() + " passed " + counter + " courses,\n" +
                    " and the highest grade is " + max);
            System.out.println("========================");
        }
    }
}