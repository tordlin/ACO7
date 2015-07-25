package week3.day1;

/**
 * Created by Tordlin on 25/07/2015.
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public  String toString(){
        return "Circle {radius = " + radius + "}";
    }

    public double square(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }
}
