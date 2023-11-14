package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println("area = " + box1.getArea());
        System.out.println("perimeter = " + box1.getPerimeter());

        Measurable measureThing = new Square(5);
        System.out.println("area = " + measureThing.getArea());
        System.out.println("perimeter = " + measureThing.getPerimeter());

        measureThing = box1;
        System.out.println("area = " + measureThing.getArea());
        System.out.println("perimeter = " + measureThing.getPerimeter());


//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());
    }

}
