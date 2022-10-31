import java.util.Arrays;

public class Student {

    private String name;

    private String studentId;

    private Course[] courses;

    public Student() {
    }

    public Student(String name, String studentId, Course[] courses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
