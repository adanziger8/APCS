package Ch8Classes;

public final class PointClientV3 {
    public static void main(String[] args) {
        //instantiate a point at (5,7)
        //I'm instantiating an object p1 of the type PointV3
        PointV3 p1 = new PointV3(5,7);
        System.out.println("P1:" + p1); //after toString() method

        //Instantiate an object of p2 of type PointV3 with 0 arguments
        PointV3 p2 = new PointV3();
        System.out.println("P2:" + p2); //after toString() method

    }
}