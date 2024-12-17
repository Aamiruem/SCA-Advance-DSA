package OPPS.L9Static;
class myMath{
    public static int add(int a, int b){
        return a + b;
    }
}
public class AddStatic {
    public static void main(String[] args) {
        System.out.println("sum of 10 and 20 is = " + myMath.add(10, 20));
    }
}
