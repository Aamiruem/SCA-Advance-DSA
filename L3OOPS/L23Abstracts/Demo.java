// static
//abstract
// final
// private






// package OPPS.L23Abstract;

// class A {
//    public abstract void show(){
//     System.out.println("in show of A");
//    }
// }
// class B extends A{
//     public void show(){
//         System.out.println("in show of B");
//     }
// }
// public class Demo {
//     public static void main(String[] args) {
//         A ref = new B();
//         ref.show();
//     }
// }











package OPPS.L23Abstracts;

// Define an abstract class A with an abstract method show
abstract class A {
    // Abstract method without a body
    // Note: Abstract methods cannot be static, final, or private
    public abstract void show(); 

    // Static method
    public static void display() {
        System.out.println("in display of A");
    }

    // Final method - cannot be overridden by subclasses
    public final void finalMethod() {
        System.out.println("in finalMethod of A");
    }

    // Private method - cannot be accessed outside this class
    private void privateMethod() {
        System.out.println("in privateMethod of A");
    }

    // Public method to access the private method within the class
    public void callPrivateMethod() {
        privateMethod();
    }
}

// Class B extends abstract class A and provides implementation for the abstract method show
class B extends A {
    // Provide implementation for the abstract method
    public void show() {
        System.out.println("in show of B");
    }

    // Attempting to override a final method will result in a compile-time error
    // public void finalMethod() {
    //     System.out.println("in finalMethod of B");
    // }

    // Static methods are not inherited and cannot be overridden, but can be redefined
    public static void display() {
        System.out.println("in display of B");
    }
}

// Demo class to demonstrate the use of abstract class and method
public class Demo {
    public static void main(String[] args) {
        A ref = new B(); // Create an object of class B and refer it using class A
        ref.show();      // Calls the show method of class B

        // Calling static method using class name
        A.display();     // Calls display method of class A
        B.display();     // Calls display method of class B

        // Calling final method
        ref.finalMethod(); // Calls finalMethod of class A

        // Calling a public method which in turn calls a private method
        ref.callPrivateMethod(); // Calls privateMethod of class A
    }
}
