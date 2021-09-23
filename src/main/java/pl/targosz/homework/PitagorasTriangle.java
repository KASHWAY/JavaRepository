package pl.targosz.homework;

public class PitagorasTriangle {
    static boolean Triangle(int x, int y, int z) { //x y z because these letters we can find in the math usually. (especially in triangles)
        if ((x * x) + (y * y) == (z * z))
            return true;
        else if ((y * y + z * z) == x * x) return true;

        else return false;
    }

    public static void main(String[] args) {
        System.out.println(Triangle(3, 5, 6));
        System.out.println(Triangle(3, 4, 5));
        System.out.println(Triangle(5, 3, 4));
    }
}
