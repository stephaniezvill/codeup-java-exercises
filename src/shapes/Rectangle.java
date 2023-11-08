package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    //this is a constructor that accepts two numbers for length and width, and sets those properties.
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    //gets area calculation
    public int getArea() {
        return length * width;
    }

    //gets perimeter calculation
    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }
}



