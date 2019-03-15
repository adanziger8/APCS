package src.Ch9Inheritance;

public class TriangleV2 implements ShapeV1 {
    private double a;
    private double b;
    private double c;

    public TriangleV2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double s = .5*(a+b+c);
        return Math.sqrt((s*(s-a)*(s-b)*(s-c)));
    }

    public double perimeter(){
        return a+b+c;
    }

}
