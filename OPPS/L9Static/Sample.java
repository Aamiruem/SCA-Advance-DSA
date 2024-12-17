// package OPPS.L9Static;

// public class Sample {
//      int i = 10; // Static variable initialized at class loading time
//     public static void main(String[] args) {
//         Sample s = new Sample(); //object to call access
//         System.out.println(s.i); // Output: 10
//     }
// }




package out.OPPS.L9Static;

public class Sample {
    static int i = 10; // direct access to static call
    public static void main(String[] args) {
        // Sample s = new Sample(); //object to call access
        System.out.println(i); // Output: 10
    }
}
