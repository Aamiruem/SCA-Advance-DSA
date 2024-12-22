package OPPS.L12ThisKeyword;

public class Box {
    private int length, breath, height;

    public Box(int length, int breath, int height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }
    public Box(int side){
        this(side, side, side);
        // length = side;
        // breath = side;
        // height = side;
    }
    public Box(){
        this(0, 0, 0);
        // length = 0;
        // breath = 0;
        // height = 0;
    }
    public void show(){
        System.out.println("Length is = " + length);
        System.out.println("Breath is = " + breath);
        System.out.println("Height is = " + height);
    }
}
