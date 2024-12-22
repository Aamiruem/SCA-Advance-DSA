package out.OPPS.L8PassByValueAndReference;

import java.util.*;

public class argPass {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(2);

        myList.add(4);

        // myList.add(30);

        System.out.println("Before changing myList: " + myList);

        change(myList);
        
        System.out.println("After changing myList: " + myList);

    }

    // Method to change the ArrayList's content without changing the original
    // ArrayList reference.
    public static void change(ArrayList<Integer> myList) {
        // myList = new ArrayList<>(); // new object
        myList.add(3);
        myList.add(5);

    }
}
