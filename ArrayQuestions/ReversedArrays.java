// package out.production.ArrayQuestions;
public class ReversedArrays {

    public static void ReversedArr(int arr[]){
        int n = arr.length;
        int reversedArr[];
        reversedArr = new int[n];
        for(int i = 0; i < n; i++){
            reversedArr[i] = arr[n - i - 1];
        }
        System.out.print("Reversed Array is ");
        for(int i : reversedArr){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int reversedArr[] = {1, 2, 3, 4, 5, 6, 7};

        ReversedArr(reversedArr);

    }
}
