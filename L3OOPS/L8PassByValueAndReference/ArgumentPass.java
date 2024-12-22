package out.OPPS.L8PassByValueAndReference;

class MyMath {
    public void add(int a, int b) { //this is called formal argument or parameter
        int c = a + b;
        // System.out.println("Sum is " + (a + b));
        System.out.println("Sum is " + c);
    }
}

public class ArgumentPass {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        int x = 20, y = 30;

        obj.add(x, y);

        obj.add(10, 20);
        obj.add(30, 40); // this is called actual argument or argument
    }
}
