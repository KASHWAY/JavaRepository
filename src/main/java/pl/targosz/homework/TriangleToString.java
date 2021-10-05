package pl.targosz.homework;

public class TriangleToString {
    private int width,height;

    public TriangleToString(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle parimeters{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        TriangleToString triangle1 = new TriangleToString(150,230);
        TriangleToString triangle2= new TriangleToString(180,300);
        System.out.println(triangle1);
        System.out.println(triangle2);

    }
}
