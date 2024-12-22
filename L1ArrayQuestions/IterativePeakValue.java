// Time Complexity: O(log N), Where n is the number of elements in the input array. In each step our search becomes half. So it can be compared to Binary search, So the time complexity is O(log N)

// Auxiliary Space: O(1), No extra space is required, so the space complexity is constant.






// package out.production.ArrayQuestions;

public class IterativePeakValue {
    public static int findPeack(int arr[], int n){
        int l = 0;
        int r = n - 1;
        int mid = 0;
        
        while(l <= r){
            mid = (l + r) >> 1;
            
            // If mid element is greater than its adjacent elements,
            // then mid is a peak element
            if(mid == 0 || arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1]){
                break;
            }
            //move right side the pointer
            // If mid element is not peak and mid element is greater than
            // its left element, then left half is a valid peak element
            
            if(mid > 0 && arr[mid -1] > arr[mid]){
                r = mid - 1;
            } 
            
            
            // If mid element is not peak and mid element is smaller than
            // its right element, then right half is a valid peak element
            else{
                l = mid + 1;
            }
        }
        return mid;
    
    }
    
    public static void main(String[] args){
        int arr[] = {1, 3, 20, 4, 1, 0};
        int n = arr.length;
        int peakIndex = findPeack(arr, n);
        
        if(peakIndex != -1){
            System.out.println("Peak element is at index: " + peakIndex);
        } else{
            System.out.println("No peak element found in the array");
        }
    }
}
