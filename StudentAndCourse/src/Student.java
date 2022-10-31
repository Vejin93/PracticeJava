import java.util.Arrays;
import java.util.List;

public class Student {

    private String name;

    private String studentId;

    private int numberOfCourses;

    private List<Course> courses;

    public Student() {
    }

    public Student(String name, String studentId, int numberOfCourses, List<Course> courses) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCourses = numberOfCourses;
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

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", numberOfCourses=" + numberOfCourses +
                ", courses=" + courses +
                '}';
    }
}
