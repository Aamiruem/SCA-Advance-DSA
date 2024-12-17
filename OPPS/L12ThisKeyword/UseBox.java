package OPPS.L12ThisKeyword;


public class UseBox {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        b1.show();

        Box b2 = new Box(10);
        b2.show();

        Box b3 = new Box();
        b3.show();
    }
}
