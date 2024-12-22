package out.OPPS.L8PassByValueAndReference;

public class ArgumentsPass {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // System.out.println("Before swapping: x = " + x + ", y = " + y);

        System.out.println("Before incrementing, x = " +x + ",y = " + y);
        increment(x, y); //actual argument
        System.out.println("After incrementing, x = " +x + ",y = " + y);
        
    }
    public static void increment(int a, int b){
//this is a call by value because a = a + 5 is not add above 10 or 20 java does not allowed call by value due to security purpose and normal print the above value only
        a = a + 5;
        b = b + 5;
    }
}
