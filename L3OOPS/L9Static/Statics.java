package out.OPPS.L9Static;
class Demo{
    int a;
    static int b;

}
public class Statics {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.a = 10;
        d2.a = 20;
        d3.a = 30;

        System.out.println(d1.a + " " + d2.a + " " + d3.a);

        d1.b = 40;
        d2.b = 50;
        d3.b = 60;
        System.out.println(d1.b + " " + d2.b + " " + d3.b); //b is same of all value to ans is last print

        Demo.b = 40;
        Demo.b = 50;
        Demo.b = 60;

        System.out.println(Demo.b);
    }
}



//these both are instance variable int a; and int b;

// int a; 
// int b;

//1. They are closely Associated with the object of the class

//2. They arrive in memory only when an objects arrives.

//3. They have as many copies created as we have created objects of the class.
