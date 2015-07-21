package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class TestStringClass {
    public static void main(String[] args) {
        StringClass stringClass = new StringClass("Word");

        stringClass.print();

        String resultOfConcatenation = stringClass.concatenation("secondWord");

        System.out.println(resultOfConcatenation);

        String resultOfLowerCase = stringClass.lowerCase();

        System.out.println(resultOfLowerCase);

        String resultOfUpperCase = stringClass.upperCase();

        System.out.println(resultOfUpperCase);

    }
}
