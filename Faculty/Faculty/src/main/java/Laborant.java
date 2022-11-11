public class Laborant {
    private int id;
    private int yearOfBirth;
    private int classPerWeek;
    private static int durationClass = 30;
    private int idAssistent;

    public Laborant() {
    }

    public Laborant(int id, int yearOfBirth, int classPerWeek, int idAssistent) {
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.classPerWeek = classPerWeek;
        this.idAssistent = idAssistent;
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

    public int getIdAssistent() {
        return idAssistent;
    }

    public void setIdAssistent(int idAssistent) {
        this.idAssistent = idAssistent;
    }

    @Override
    public String toString() {
        return "Laborant{" +
                "id=" + id +
                ", yearOfBirth=" + yearOfBirth +
                ", classPerWeek=" + classPerWeek +
                ", idAssistent=" + idAssistent +
                '}';
    }
}
