package Ch8Classes;

public final class PointClientV1 {
    public static void main(String[] args) {
        //instantiate a point at (0,0)
        PointV1 p1 = new PointV1();
        System.out.println("p1: (" + p1.x + ", " + p1.y + ")");
        p1.x = 5;
        p1.y = 6;
        System.out.println("Updated p1: (" + p1.x + ", " + p1.y + ")");

        //instantiate an object p2 of the type PointV1
        //instantiate means create an instance of
        PointV1 p2 = new PointV1();
        p2.x = 6;
        p2.y = 9;
        System.out.println("p2: (" + p2.x + ", " + p2.y + ")");
        //
        System.out.println(p1.distance(p2));
        //System.out.println(PointV1.distance(p1,p2));

        p2.translate(5, 4); //now at (5,4)
        p2.translate(1, 1); //now at (6,5)
        //
        PointV1 p3 = new PointV1(); //now at (0,0)
        p3.setLocation(-1, 4); //now at (-1,4)
        p3.setLocation(-5, 3); //now at (-5,3)

    }
}