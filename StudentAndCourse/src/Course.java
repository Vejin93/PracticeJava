public class Course {
    private int grade;

    public Course(){}

    public Course(int grade) {
        this.grade = grade;
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
                "grade=" + grade +
                '}';
    }
}
