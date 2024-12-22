// package Array;
// public class ContainerFilledMostWater {
//     public int amxArea(int[] height){
//         int area = 0;
//         for(int i = 0; i < height.length; i++){
//             for(int j = i+1; j < height.length; j++){
//                 int minHeight = Math.min(height[i], height[j]);
//                 int width = j - i;
//                 int currArea = minHeight * width;
//                 area = Math.max(area, currArea);
//             }
//         }
//         return area;
//     }
//     public static void main(String[] args) {
//         int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7}; 
//         ContainerFilledMostWater obj = new ContainerFilledMostWater();
//         System.out.println(obj.amxArea(height));
//     }
// }









package Array;

public class ContainerFilledMostWater {

    // Optimized method to find the maximum area using two pointers
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the width
            int width = right - left;
            // Calculate the height as the minimum of the two heights
            int h = Math.min(height[left], height[right]);
            // Calculate the area
            int currentArea = width * h;
            // Update the maximum area if the current area is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointers inward to potentially find a larger area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        ContainerFilledMostWater obj = new ContainerFilledMostWater();

        System.out.println("The maximum area that can contain water = " + obj.maxArea(height));

        // 2nd test case
        int[] height1 = {1, 2};

        System.out.println("The maximum area that can contain water = " + obj.maxArea(height1));
    }
}
