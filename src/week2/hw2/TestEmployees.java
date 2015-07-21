package week2.hw2;

/**
 * Created by Tordlin on 21/07/2015.
 */
public class TestEmployees {
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner("Vova", 500);
        QAEngineer tester = new QAEngineer("Jenya", 1000);
        SoftwareIngineer programmer = new SoftwareIngineer("Roma", 1500);

        System.out.println(cleaner.toString());
        System.out.println(tester.toString());
        System.out.println(programmer.toString());

        cleaner.working();
        tester.working();
        programmer.working();
    }
}
