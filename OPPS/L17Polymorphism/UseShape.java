//compile time polymorphism or static polymorphism

package OPPS.L17Polymorphism;

public class UseShape {
    public static void main(String[] args) {

        Shape s = new Shape();

        s.area(5);
        s.area(5.5);
        s.area(5.5, 6.5);
        s.area(5, 6);
    }
}
