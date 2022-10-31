public class Course {
    private String nameCourse;
    private int grade;

    public Course(){}

    public Course(String nameCourse, int grade) {
        this.nameCourse = nameCourse;
        this.grade = grade;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Course{" +
                "nameCourse='" + nameCourse + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
