package week6.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Tordlin on 23/08/2015.
 */
public class Ex1 {
    public static void main(String[] args) {
        boolean exit = true;
        String filePath = "d:\\Courses\\ArtCode\\ACO7\\Test.txt";
        try {
            InputStream inputStream = new FileInputStream(filePath);
            while (exit) {
                int i = inputStream.read();
                if (i != -1) {
                    System.out.print((char) i);
                } else { exit = false; }
            }
        } catch (FileNotFoundException e) {
            System.err.println("No such file: " + e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
