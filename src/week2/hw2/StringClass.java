package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class StringClass {
    char[] elements;

    public StringClass(String word) {
        this.elements = new char[word.length()];

        elements = word.toCharArray();
    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
        }
        System.out.println();
    }

    public String concatenation(String secondWord) {
        char[] newElements = new char[elements.length + secondWord.length()];

        char[]secondPart = secondWord.toCharArray();

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }

        for (int i = elements.length; i < newElements.length; i++) {
            newElements[i] = secondPart[i - elements.length];
        }

        elements = newElements;

        return getStringFromCharArray();
    }

    private String getStringFromCharArray() {
        String resultOfOperationString = "";

        for (int i = 0; i < elements.length; i++) {
            resultOfOperationString += elements[i];
        }
        return resultOfOperationString;
    }

    public String lowerCase() {
        for (int i = 0; i < elements.length; i++) {

        }
        return getStringFromCharArray();
    }

    public String upperCase() {
        return getStringFromCharArray();
    }
}
