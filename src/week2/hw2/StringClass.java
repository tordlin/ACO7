package week2.hw2;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class StringClass {
    char[] elements;

    public StringClass(String word) {
        this.elements = word.toCharArray();
    }

    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i]);
        }
        System.out.println();
    }

    public String concatenation(String secondWord) {
        char[] newElements = new char[elements.length + secondWord.length()];

        char[] secondPart = secondWord.toCharArray();

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

    public String spaceDeleting() {
        int countOfNonSpace = 0;

        for (int i = 0; i < elements.length; i++) {
            if (' ' != (int) elements[i]) {
                countOfNonSpace++;
            }
        }

        System.out.println(countOfNonSpace);

        char[] newElements = new char[countOfNonSpace];

        int counterNewEements = 0;

        for (int i = 0; i < elements.length; i++) {
            if (' ' != (int) elements[i]) {
                newElements[counterNewEements] = elements[i];
                counterNewEements++;
            }
        }

        elements = newElements;

        return getStringFromCharArray();
    }

    public boolean equalsToString(String newWord) {
        if (newWord == null) {
            return false;
        }
        char[] newElements = newWord.toCharArray();

        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] != newElements[i]) {
                return false;
            }
        }

        return this.elements.length == newElements.length;
    }

    public boolean contains(StringClass newString) {
        if (elements.length < newString.elements.length) {
            return false;
        }

        boolean result = false;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == newString.elements[0]) {
                int counter = 1;
                for (int j = 1; j < newString.elements.length && j + i < elements.length; j++) {
                    if (newString.elements[j] != elements[i + j]) {
                        break;
                    }
                    counter++;
                }

                if (counter == newString.elements.length) {
                    result = true;
                }
            }
        }

        return result;
    }

    public String substring(int indexStart, int indexEnd) {

        char[] newElements = new char[indexEnd - indexStart];

        int counterForNewElements = 0;

        for (int i = indexStart; i < indexEnd; i++) {
            newElements[counterForNewElements] = elements[i];
            counterForNewElements++;
        }

        elements = newElements;

        return getStringFromCharArray();
    }
}
