package week6.hw6;

import java.io.*;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Tordlin on 24/08/2015.
 */

/*6) написать блокнот:
        а)юзер вводит путь к файлу, если есть показываете его содержимое в консоль.
        б)есть возможность создать новый файл и что-то записать в него.*/

public class Notebook {
    public static void main(String[] args) throws IOException {
        boolean exitFromLoop = true;
        BufferedReader reader = null;
        BufferedWriter writer = null;

        System.out.println("Please enter path to file");

        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        File file = new File(filePath);
        if (file.exists()) {
            try {
                reader = new BufferedReader(new FileReader(filePath));
                while (exitFromLoop) {
                    int i = reader.read();
                    if (i != -1) {
                        System.out.print((char) i);
                    } else {
                        exitFromLoop = false;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    reader.close();
                }
            }
        } else {
            try {
                file.createNewFile();
                writer = new BufferedWriter(new FileWriter(filePath));
                writer.write("File was created by Tordlin at " + new Date());
                System.out.println("File created!");
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (writer != null) {
                    writer.close();
                }
            }

        }
    }
}

