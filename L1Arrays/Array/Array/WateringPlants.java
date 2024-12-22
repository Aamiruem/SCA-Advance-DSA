// package Array;

// public class WateringPlants {
//     public int wateringPlantS(int plant[], int capacity){
//         int noOfSteps = 0;
//         int i = 0;
//         int can = capacity;
//         while(i < plant.length){
//             if(can >= plant[i]){
//                 can -= plant[i];
//                 i++;
//                 noOfSteps++;
//             }else{
//                 can = capacity;
//                 noOfSteps++;
//             }
//         }

//         return noOfSteps;
//     }

//     public static void main(String[] args) {
//         int[] plant = {2, 2, 3, 3};
//         int capacity = 5;
//         WateringPlants obj = new WateringPlants();
//         System.out.println(obj.wateringPlantS(plant, capacity));
//     }
// }










// class Solution {
//     public int wateringPlants(int[] plants, int capacity) {
//         int originalCapacity = capacity;
//         String abc = "";
//         int steps = 0;
//         for(int j=0;j<plants.length;j++){
            
//              for(int i=0;i<plants.length;i++)
//                 {
//                     if(plants[i]==0){

//                         steps++;
//                         continue;
//                     }
//                     if(plants[i]>0){
                        
//                         int needed = plants[i];
//                         if(capacity>=needed)
//                         {
//                             steps++;
//                             capacity-=needed;
//                             plants[i] = 0;
//                             abc+=plants[i];
//                         }
//                         else{
//                             capacity = originalCapacity;
//                             steps = steps + (i);
//                             break;

//                         }
//                     }
                   
//                 }
//             if(abc.length() == plants.length)
//                return steps;   
//             } 
//       return steps; 
//     }
// }





// class Solution {
//     public int wateringPlants(int[] plants, int capacity) {
//         int max=capacity;
//         int steps=0;
//         for(int i=0;i<plants.length;i++){
//             if(max-plants[i]<0){
//                 max=capacity;
//                 steps+=i+1;
//                 steps+=i;
//                 max-=plants[i];

//             }else{
//                 steps++;
//                 max-=plants[i];
//             }
//         }
//         return steps;
//     }
// }





// class Solution {
//     public int wateringPlants(final int[] plants, final int capacity) {
//         int count = 0, current = capacity;

//         for(int i = 0; i < plants.length; ++i) {
//             final int plant = plants[i];

//             if(current < plant) {
//                 count += i * 2;
//                 current = capacity;
//             }

//             current -= plant;
//             count++;
//         }

//         return count;
//     }
// }
















package Array;

public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int count =0;
        int a = capacity;
        for(int i=0;i<plants.length;i++){
            if(a>=plants[i]){
                a= a-plants[i];
                count++;
            }
            else{
                a= capacity-plants[i];
                count = count +i;
                count= count+i+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] plant = {2, 2, 3, 3};
        int capacity = 5;
        WateringPlants obj = new WateringPlants();
        System.out.println(obj.wateringPlants(plant, capacity));
    }
}
