package week3.day1;

/**
 * Created by Tordlin on 25/07/2015.
 */
public class Kvadrat extends Figure {
    private int side;

    public Kvadrat(int side) {
        this.side = side;
    }

    public double square() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }
}
