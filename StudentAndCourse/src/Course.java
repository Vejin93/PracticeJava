public class Course {
    private String nameCourse;
    private String grade;

    public Course(){}

    public Course(String nameCourse, String grade) {
        this.nameCourse = nameCourse;
        this.grade = grade;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
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
