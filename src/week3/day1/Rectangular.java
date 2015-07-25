package week3.day1;

/**
 * Created by Tordlin on 25/07/2015.
 */
public class Rectangular extends Figure{
    private int width;
    private int height;

    public Rectangular(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double square(){
        return width * height;
    }

    @Override
    public double perimeter() {
        return width * 2 + height * 2;
    }
}
