package shapes;
//indicates square inherits from rectangle
public class Square extends Rectangle {
    //Constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
    public Square(int side) {
        super(side, side);
    }

    @Override
    public int getArea() {
//        System.out.println("yes");
        return length * length;

    }


    @Override
    public int getPerimeter() {
//        System.out.println("no");
        return 4 * length;
    }
}
