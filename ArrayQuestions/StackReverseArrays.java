package out.production.ArrayQuestions;
import java.util.Stack;

public class StackReverseArrays {
    // Method to reverse an array using a stack
    public static void reversedArray(int arr[]){
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for(int element : arr){
            stack.push(element);
        }
        
        // Pop elements from the stack to reverse the array
        for(int i = 0; i < arr.length; i++){
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        // Reverse the array
        reversedArray(arr);
        
        // Print the reversed array
        System.out.println("Reversed Array: ");
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
