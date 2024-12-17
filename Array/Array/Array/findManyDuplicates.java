// wrong code 

// package Array;

// public class findManyDuplicates {
//     public static void findDuplicate(int arr[]){
//         int n = arr.length;
//         for(int i = 0; i<n-1; i++){
//             int x = Math.abs(arr[i]);
//             if(x<0){
//                 x =-x;
//                 if([x]>0){
//                     arr[x] = -arr[x];
//                 }
//             }else{
//                 System.out.println(x);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 4, 5};
//         findDuplicate(arr);
//         System.out.println("Duplicate numbers are: ");
//         for(int i = 1; i<=arr.length; i++){
//             if(arr[i]<0){
//                 System.out.print(-i + " ");
//             }
//         }
//     }
    //Time complexity = O(n)
    //Space complexity = O(1)
// }



















package Array;

public class findManyDuplicates {
    public static void findDuplicates(int arr[]) {
        int n = arr.length;
        System.out.println("Duplicate numbers are: ");
        
        for (int i = 0; i < n; i++) {
            int x = Math.abs(arr[i]);
            if (arr[x - 1] >= 0) {
                arr[x - 1] = -arr[x - 1];
            } else {
                System.out.print(x + " ");
                System.out.println("Duplicate found: " + arr[i] + " at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 3, 5, 6, 7, 8, 9, 4, 5};
        findDuplicates(arr);

    }
}
