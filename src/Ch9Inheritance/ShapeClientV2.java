package src.Ch9Inheritance;


public class ShapeClientV2 {
    public static void main(String[] args) {
        ShapeV1 shapes[] = {new CircleV2(3), new RectangleV2(4, 5), new TriangleV2(3, 4, 5)};
        printShapeInfo(shapes);
        //array of shapes, 3 objects one of each type
        //print area and perimeter efficiently

        int compareArea = shapes[1].compareTo(shapes[2]);
        if(compareArea > 0)
            System.out.println("Rectangle has a larger area than Triangle");
        else if(compareArea<0)
            System.out.println("Triangle has a larger area than Rectangle");
        else{
            System.out.println("Rectangle and Triangle have the same area");
        }
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
