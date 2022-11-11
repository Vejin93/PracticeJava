public class Professor {

    private int id;
    private int yearOfBirth;
    private int classPerWeek;
    private static int durationClass = 45;

    public Professor() {
    }

    public Professor(int id, int yearOfBirth, int classPerWeek) {
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.classPerWeek = classPerWeek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getClassPerWeek() {
        return classPerWeek;
    }

    public void setClassPerWeek(int classPerWeek) {
        this.classPerWeek = classPerWeek;
    }

    public static int getDurationClass() {
        return durationClass;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", yearOfBirth=" + yearOfBirth +
                ", classPerWeek=" + classPerWeek +
                '}';
    }
}
