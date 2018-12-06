package Ch8Classes;

public final class PointClientV4 {
    public static void main(String[] args) {

        //instantiate a point at (5,7)
        //I'm instantiating an object p1 of the type PointV3
        PointV4 p1 = new PointV4(5,7);
        System.out.println("P1:" + p1); //after toString() method

        //Instantiate an object of p2 of type PointV3 with 0 arguments
        PointV4 p2 = new PointV4();
        System.out.println("P2:" + p2); //after toString() method

    }
}