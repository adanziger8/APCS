package src.Ch9Inheritance;
//Interface with only area and perimeter. ANy class that implements Shape is responsible to implement its
//inhereted area and perimeter methods
public abstract class ShapeV2 implements Comparable {
    public abstract double area();

    public abstract double perimeter();

    public int compareTo(Object other) {
        if (this.area() > ((ShapeV2)other).area()) {
            return 1;
        } else if (this.area() < ((ShapeV2)other).area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
