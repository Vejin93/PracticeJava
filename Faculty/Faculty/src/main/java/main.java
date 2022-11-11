import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        List<Professor> professorList = new ArrayList<Professor>();
        List<Assistent> assistentList = new ArrayList<Assistent>();
        List<Laborant> laborantList = new ArrayList<Laborant>();

        Scanner sc = new Scanner(System.in);

        //Insert data for proffesors
        System.out.println("======================");
        System.out.println("Enter number of professors: ");
        int numberOfProfessors = sc.nextInt();
        for (int i = 0; i < numberOfProfessors; i++) {
            Professor professor = new Professor();
            System.out.println("==========================");
            System.out.println("Enter id for profesor: ");
            int retVal = sc.nextInt();
            professor.setId(retVal);
            System.out.println("Enter year of Birth for profesor: ");
            retVal = sc.nextInt();
            professor.setYearOfBirth(retVal);
            System.out.println("Enter class per week for profesor: ");
            retVal = sc.nextInt();
            professor.setClassPerWeek(retVal);

            professorList.add(professor);
        }

        //Insert data for assistents
        System.out.println("======================");
        System.out.println("Enter number of assistents: ");
        int numberOfAssistents = sc.nextInt();
        for (int i = 0; i < numberOfAssistents; i++) {
            Assistent assistent = new Assistent();
            System.out.println("==========================");
            System.out.println("Enter id for assistent: ");
            int retVal = sc.nextInt();
            assistent.setId(retVal);
            System.out.println("Enter year of Birth for assistent: ");
            retVal = sc.nextInt();
            assistent.setYearOfBirth(retVal);
            System.out.println("Enter class per week for assistent: ");
            retVal = sc.nextInt();
            assistent.setClassPerWeek(retVal);

            assistentList.add(assistent);
        }

        //Insert data for laborants
        System.out.println("======================");
        System.out.println("Enter number of laborants: ");
        int numberOfLaborants = sc.nextInt();
        for (int i = 0; i < numberOfLaborants; i++) {
            Laborant laborant = new Laborant();
            System.out.println("==========================");
            System.out.println("Enter id for laborant: ");
            int retVal = sc.nextInt();
            laborant.setId(retVal);
            System.out.println("Enter year of Birth for laborant: ");
            retVal = sc.nextInt();
            laborant.setYearOfBirth(retVal);
            System.out.println("Enter class per week for laborant: ");
            retVal = sc.nextInt();
            laborant.setClassPerWeek(retVal);

            laborantList.add(laborant);
        }

        // Average age of faculty staff
        int sum = 0;
        for (Professor professor : professorList) {
            sum += 2022 - professor.getYearOfBirth();
        }
        for (Assistent assistent : assistentList) {
            sum += 2022 - assistent.getYearOfBirth();
        }
        for (Laborant laborant : laborantList) {
            sum += 2022 - laborant.getYearOfBirth();
        }

        double retVal = sum / (professorList.size() + assistentList.size() + laborantList.size());
        System.out.println("----------------------");
        System.out.println("Average years on faculty is: " + retVal + " years.");

        // Total time spent at the university
        System.out.println("----------------------");
        int sumTime = 0;
        for (Professor professor : professorList) {
            sumTime += Professor.getDurationClass() * professor.getClassPerWeek();
        }
        for (Assistent assistent : assistentList) {
            sumTime += Assistent.getDurationClass() * assistent.getClassPerWeek();
        }
        for (Laborant laborant : laborantList) {
            sumTime += laborant.getDurationClass() * laborant.getClassPerWeek();
        }
        System.out.println("Total time spent at the university: " + sumTime + " hours.");
        System.out.println("----------------------");
    }
}
