package OPPS.L11StaticBlock;

class Data {
    static int a = 10;
    static {
        System.out.println("first static block called......." + a);
    }

    static {
        System.out.println("second static block called.......");
    }

    public Data() {
        System.out.println("constructor called....");
    }

    public static void show() {
        System.out.println("show called....");
    }
}

public class useData {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Data.show();
        Data d1 = new Data();

        Data d2 = new Data();

        Data d3 = new Data();

        Data d4 = new Data();

        // static block called.......
        // constructor called....
    }
}
