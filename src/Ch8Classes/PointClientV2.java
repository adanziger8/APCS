package Ch8Classes;

public final class PointClientV2 {
    public static void main(String[] args) {
        //instantiate a point at (0,0)
        //I'm instantiating an object p1 of the type PointV2
        PointV2 p1 = new PointV2();
        //System.out.println("p1: (" + p1.x + ", " + p1.y + ")"); WITHOUT toString() method
        System.out.println("P1:" + p1);
        p1.x = 5;
        p1.y = 7;
        System.out.println("Updated p1:" + p1);


    }
}