
import java.util.ArrayList;
import java.util.Collections;


public class ArrayListExamples {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> month = new ArrayList<>();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");

        // Print the ArrayList
        System.out.println("ArrayList: " + month);
        
        // Print the size of the ArrayList
        System.out.println("Size of ArrayList: " + month.size());
        
        // Print the elements of the ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month.get(i));

        }

        // Remove an element from the ArrayList
        month.remove("June");
        
        // Print the updated ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month.get(i));
        }
        
        // Add an element at a specific index
        month.add(3, "April");
        
        // Print the updated ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month.get(i));
        }
        
        // Clear the ArrayList
        month.clear();
        
        // Print the updated ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month.get(i));
        }
        
        // Check if the ArrayList is empty
        if (month.isEmpty()) {
            System.out.println("ArrayList is empty");
        }
        
        // Convert the ArrayList to an array
        @SuppressWarnings("CollectionsToArray")
        String[] monthArray = month.toArray(new String[0]);
        
        // Print the elements of the array
        for (int i = 0; i < monthArray.length; i++) {
            System.out.println("Element at index " + i + ": " + monthArray[i]);
        }
        
        // Sort the ArrayList in alphabetical order
        month.sort(String.CASE_INSENSITIVE_ORDER);
        
        // Print the sorted ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month.get(i));
        }
        
        // Reverse the order of the ArrayList
        Collections.reverse(month);
        
        // Print the reversed ArrayList
        for (int i = 0; i < month.size(); i++) {
            System.out.println("Element at index " + i + ": " + month);
        }

        // Create a new ArrayList with a specific range of elements
        ArrayList<String> subMonth = new ArrayList<>(month.subList(2, 5));
        
        // Print the sub-ArrayList
        System.out.println("Sub-ArrayList: " + subMonth);

        
    }
}
