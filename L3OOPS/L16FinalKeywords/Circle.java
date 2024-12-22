package OPPS.L16FinalKeywords;

public class Circle {
    private int rad;
    private final double pi;

    public Circle(int r) {
        pi = 3.14;
        rad = r;
    }

    public void show(){
        // ++pi; or final
        System.out.println("Radius is = :" + rad);
        System.out.println("Pi is =: " + pi);
        System.out.println("Area of Circle is = " + area());
    }
    public double area() {
        return pi * rad * rad;
    }

}
