package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class TestStringClass {
    public static void main(String[] args) {
        StringClass stringClass = new StringClass("Word");

        stringClass.print();

        System.out.println(stringClass.concatenation(" secondWord 1"));

        StringClass stringClass2 = new StringClass("dWo");

        System.out.println(stringClass.contains(stringClass2));

        System.out.println(stringClass.substring(3, 7));

        //System.out.println(stringClass.lowerCase());

        //System.out.println(stringClass.upperCase());

        System.out.println(stringClass.spaceDeleting());

        System.out.println(stringClass.equalsToString("Word_secondWord"));
    }
}
