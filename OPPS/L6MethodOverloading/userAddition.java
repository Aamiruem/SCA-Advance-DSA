package out.OPPS.L6MethodOverloading;
// Addition different version is called overloading
public class userAddition {
    // driver class
    public static void main(String[] args) {
        Addition obj = new Addition();


        // int c = obj.add(3, 4);
        // System.out.println("sum of 3 and 4 is = " + c);

        // double d = obj.add(10.0, 20.0);
        // System.out.println("sum of 10.0 and 20.0 is = " + d);

        // String s1 = "Good ";
        // String s2 = "Morning";
        // String s3 = obj.add(s1, s2);
        // System.out.println("concatenation of Good and Morning is = " + s3);

        // System.out.println("sum of 10 20 and 30 is = " + obj.add(10, 20, 30));

        // System.out.println("sum of 10 20  30 and 40 is = " + obj.add(10, 20, 30, 40));


        obj.show(22, "kamran");

        obj.show("Afroz", 21);
    }
}
