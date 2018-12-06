package Ch8Classes;

public class PointV2 {
    //state fields for the Point class
    //Synonyms: state, state fields, fields, instance variables
    public int x;
    public int y;

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
    public double distance(PointV2 other) {
        int dx = x-other.x;
        int dy = y-other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance(PointV2 first, PointV2 second) {
        int dx = first.x-second.x;
        int dy = first.y-second.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public String toString() {
        return("(" + x + "," + y + ")");
    }

}