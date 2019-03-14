package src.Ch9Inheritance;


public class ShapeClientV1 {
    public static void main(String[] args) {
        ShapeV1 shapes[] = {new CircleV1(3), new RectangleV1(4, 5), new TriangleV1(3, 4, 5)};
        //array of shapes, 3 objects one of each type
    for(int i = 0; i <shapes.length; i++){
        System.out.println("Area: " + shapes[i].area());
        System.out.println("Perimeter: " + shapes[i].perimeter());
        System.out.println();
    }
        //print area and perimeter efficiently
    }
}
