public class Assistent {
    private int id;
    private int yearOfBirth;
    private int classPerWeek;
    private static int durationClass = 30;
    private int idProfessor;

    public Assistent() {
    }

    public Assistent(int id, int yearOfBirth, int classPerWeek, int idProfessor) {
        this.id = id;
        this.yearOfBirth = yearOfBirth;
        this.classPerWeek = classPerWeek;
        this.idProfessor = idProfessor;
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


    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return "Assistent{" +
                "id=" + id +
                ", yearOfBirth=" + yearOfBirth +
                ", classPerWeek=" + classPerWeek +
                ", idProfessor=" + idProfessor +
                '}';
    }
}
