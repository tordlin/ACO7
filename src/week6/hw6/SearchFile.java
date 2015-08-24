package week6.hw6;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Tordlin on 24/08/2015.
 */

//2) Написать программу поиска файла на вашем копмьютере.

public class SearchFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resultOfSearch = 0;

        System.out.println("Please enter directory of search");
        String stringDirectoryOfSearch = sc.nextLine();


        System.out.println("Please enter file name");
        String filter = sc.nextLine();

        List<String> searchResult = new ArrayList<String>();


        checking(resultOfSearch, stringDirectoryOfSearch, filter, searchResult);


        showResult(resultOfSearch, searchResult);

    }

    private static void showResult(int resultOfSearch, List<String> searchResult) {
        if (resultOfSearch > 0) {
            for (String s : searchResult) {
                System.out.println(s);
            }
        } else {
            System.out.println("File not found");
        }
    }

    private static void checking(int resultOfSearch, String stringDirectoryOfSearch, String filter, List<String> searchResult) {
        File directoryOfSearch = new File(stringDirectoryOfSearch);

        File[] list = directoryOfSearch.listFiles();

        for (File file : list) {
            if (file != null) {
                if (file.getName().equals(filter) && file.isFile() && !(file.isHidden())) {
                    searchResult.add(file.getPath());
                    resultOfSearch++;
                } else if (file.isDirectory() && !(file.isHidden())) {
                    for (File file1 : list) {
                        checking(resultOfSearch, file1.getPath(), filter, searchResult);
                    }
                }
            }
        }
    }
}
