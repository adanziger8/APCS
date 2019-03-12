package Ch8Classes;

public class PointV4 {
    //state fields for the Point class
    //Synonyms: state, state fields, fields, instance variables
    private int x;
    private int y;
    //static fields reside in classes NOT he object
    private static int objectCount;

    //CONSTRUCTOR  for the Point class
    //A CONSTRUCTOR HAS NO RETURN TYPE!
    //constructor's ONLY job is to initialize the state fields
    public PointV4(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //default constructor
    public PointV4() {
        x = 0;
        y = 0;
    }

    //getters (accessors) methods below
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public static int getObjectCount(){
        return objectCount;
    }

    //setters (mutators) methods below
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    //behaviors for the Point class(methods)
    //Synonyms: behaviors, methods, object methods

    //translates a Point to a new location
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }
    //sets the location to a given coordinate
    public void setLocation(int xNew, int yNew) {
        x = xNew;
        y = yNew;
    }

    //distance and distanceFromOrigin are accessor (setters)
    public double distance(PointV4 other) {
        int dx = x-other.x;
        int dy = y-other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(PointV4 first, PointV4 second) {
        int dx = first.x-second.x;
        int dy = first.y-second.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public boolean equals(Object other){
        PointV4 o = (PointV4)other;
        return this.getX()==o.getX() && this.getY()==o.getY();
    }

    public String toString() {
        return("(" + x + "," + y + ")");
    }
}
