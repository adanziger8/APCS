package src.Ch9Inheritance;


public class ShapeClientV1 {
    public static void main(String[] args) {
        ShapeV1 shapes[] = {new CircleV1(3), new RectangleV1(4, 5), new TriangleV1(3, 4, 5)};
        printShapeInfo(shapes);
        //array of shapes, 3 objects one of each type

        //print area and perimeter efficiently
    }

    public static void printShapeInfo(ShapeV1[] shapes){
        for(int i = 0; i <shapes.length; i++){
            System.out.println("Area: " + shapes[i].area());
            System.out.println("Perimeter: " + shapes[i].perimeter());
            System.out.println();
        }

        for(ShapeV1 shapearr: shapes){
            System.out.println("Area: " + shapearr.area());
            System.out.println("Perimeter: " + shapearr.perimeter());
            System.out.println();
        }
    }

}
