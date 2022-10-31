import java.util.Scanner;

public class main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Course[] course = new Course[];

        // Program for enter data for students
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("Enter data for student 1:\n Name:");
        student1.setName(scanner.nextLine());
        System.out.println("StudentId: ");
        student1.setStudentId(scanner.nextLine());
        System.out.println("Number of courses: ");
        int N = scanner.nextInt();
        for( int i=0; i<N;i++){
            Course courseTemp = new Course();
            System.out.println("Name course:");
            courseTemp.setNameCourse(scanner.nextLine());
            System.out.println("Grade course:");
            courseTemp.setGrade(scanner.nextInt());

        }

    }
}
