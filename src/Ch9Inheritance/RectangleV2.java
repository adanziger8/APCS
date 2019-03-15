package src.Ch9Inheritance;

public class RectangleV2 implements ShapeV1 {
    private double height;
    private double width;

    public RectangleV2(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double area(){
        return width*height;
    }

    public double perimeter(){
        return (2*width)*(2*height);
    }

}
