package week3.day1;

import java.util.Scanner;

/**
 * Created by Tordlin on 25/07/2015.
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printFigureList();
        int figureType = sc.nextInt();
        Figure figure = createFigure(figureType);
        FigureHelper.printSquare(figure);
        FigureHelper.printPerimeter(figure);
    }

    public static Figure createFigure(int type) {
        Figure figure = null;
        switch (type) {
            case 1:
                figure = new Circle(2);
                break;
            case 2:
                figure = new Kvadrat(3);
                break;
            case 3:
                figure = new Rectangular(2, 3);
                break;
            case 4:
                figure = new Triangle(2, 3);
                break;
        }
        return figure;
    }

    public static void printFigureList() {
        System.out.println("Choose figure");
        int index = 0;
        System.out.println(++index + ". Circle");
        System.out.println(++index + ". Kvadrat");
        System.out.println(++index + ". Rectangular");
        System.out.println(++index + ". Triangle");
    }
}

