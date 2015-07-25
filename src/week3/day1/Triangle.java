package week3.day1;

/**
 * Created by Tordlin on 25/07/2015.
 */
public class Triangle extends Figure {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double square() {
        return 0.5 * height * base;
    }

    @Override
    public double perimeter() {
        return base + height + Math.sqrt(Math.pow(0.5 * base, 2) + Math.pow(height, 2));
    }
}
