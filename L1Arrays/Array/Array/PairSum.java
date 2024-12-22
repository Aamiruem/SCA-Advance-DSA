// //Brute force technique



// package Array;

// public class PairSum {
//     public static int pairSum(int[] arr, int target){
//         int count  =0;
//         int sum;
//         for(int i = 0; i < arr.length-1; i++){
//             for(int j = i+1; j < arr.length; j++){
//                 sum = arr[i] + arr[j];
//                 if(sum == target){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
    
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int target = 10;
//         System.out.println("Number of pairs with sum " + target + " is: " + pairSum(arr, target));
//     }
// }


//without nested loop
//Brute force technique



package Array;

public class PairSum {

    public static int betterPairSum(int arr[], int target){
        int count = 0;
        int sum;
        int start = 0;
        int end = arr.length-1;
        
        while(start < end){
            sum = arr[start] + arr[end];
            if(sum == target){
                count++;
                start++;
                end--;
            }
            else if(sum > target){
                end--;
            }
            else{
                start++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 70;
        System.out.println("Number of pairs with sum " + target + " is: " + betterPairSum(arr, target));
    }
}
