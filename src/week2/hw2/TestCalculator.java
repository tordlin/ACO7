package week2.hw2;

import java.util.Scanner;

/**
 * Created by Tordlin on 20/07/2015.
 */
public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        do {
            TestCalculator.callMenu();
            System.out.println("Choose actions");
            double choose = sc.nextDouble();

            if (choose > 0 && choose < 5) {
                if (choose == 1) {
                    //1. Add
                    System.out.println("Enter first value");
                    double firstValue = sc.nextDouble();
                    System.out.println("Enter second value");
                    double secondValue = sc.nextDouble();
                    calculator.add(firstValue, secondValue);
                    exit = isExit(sc, exit);
                } else if (choose == 2) {
                    //2. Minus
                    System.out.println("Enter first value");
                    double firstValue = sc.nextDouble();
                    System.out.println("Enter second value");
                    double secondValue = sc.nextDouble();
                    calculator.minus(firstValue, secondValue);
                    exit = isExit(sc, exit);
                } else if (choose == 3) {
                    //3. Multiple
                    System.out.println("Enter first value");
                    double firstValue = sc.nextDouble();
                    System.out.println("Enter second value");
                    double secondValue = sc.nextDouble();
                    calculator.multiple(firstValue, secondValue);
                    exit = isExit(sc, exit);
                } else if (choose == 4) {
                    //4. Divide
                    System.out.println("Enter first value");
                    double firstValue = sc.nextDouble();
                    System.out.println("Enter second value");
                    double secondValue = sc.nextDouble();
                    calculator.devide(firstValue, secondValue);
                    exit = isExit(sc, exit);
                }
            } else {
                System.out.println();
                System.out.println("Please enter correct number of action");
                System.out.println();
                TestCalculator.callMenu();
            }
        } while (exit);

    }

    private static boolean isExit(Scanner sc, boolean exit) {
        System.out.println("Do you want to continue? Choose number");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int questionAboutExit = sc.nextInt();
        if (questionAboutExit == 1) {
            exit = true;
        } else {
            exit = false;
        }
        return exit;
    }

    private static void callMenu() {
        System.out.println("1. Add");
        System.out.println("2. Minus");
        System.out.println("3. Multiple");
        System.out.println("4. Devide");
    }
}
