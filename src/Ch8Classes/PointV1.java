package Ch8Classes;

public class PointV1 {
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

    public double distance(PointV1 other) {
        return Math.sqrt((Math.pow((x-other.x),2)) + (Math.pow((y-other.y), 2)));
    }

    public double distance2(PointV1 other) {
        int dx = x-other.x;
        int dy = y-other.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static double distance2(PointV1 first, PointV1 second) {
        int dx = first.x-second.x;
        int dy = first.y-second.y;
        return Math.sqrt(dx*dx + dy*dy);
    }






}

