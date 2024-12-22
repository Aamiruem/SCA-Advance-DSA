// package Array;

// public class WateringPlants2105 {
//     public int minimumRefill(int[] plants, int capacityA, int capacityB) {

//         //number of refills
//         int re = 0;
        
//         int a = capacityA, b = capacityB;
//         int n = plants.length;
        
//         if(n==1) return 0;
        
//         int j=n-1;
//         for (int i = 0; i < n; ++i) {
            
//             //if they are at the same plant
//             if(i==j){
                
//                 //if both have equal water or alice has more water
//                 if(a>=b){
//                     if (a < plants[i]) {
//                         a = capacityA;
//                         re++;
//                         break;
//                     }
//                 }
                
//                 //if bob has more water
//                 else if(b>a){
//                     if(b < plants[j]){
//                         b = capacityB;
//                         re++;
//                         break;
//                     }
//                 }
                
//                 //we have watered all plants
//                 break;
//             }
            
//             //if less water in alice's can than required refill it
//             if (a < plants[i]) {
//                 a = capacityA;
//                 re++;
//             }
            
//             //if less water in bob's can than required refill it
//             if(b < plants[j]){
//                 b = capacityB;
//                 re++;
//             }
            
//             //reduce water in can which is poured
//             a -= plants[i];
//             b -= plants[j];
                
//             j--;
            
//             //in even number of plants, all are watered here
//             if(i==j)
//                 break;
//         }
//         return re;
//     }
//     public static void main(String[] args) {
//         int[] plant = {2, 2, 3, 3};
//         int capacityA = 5;
//         int capacityB = 5;
//         WateringPlants2105 obj = new WateringPlants2105();
//         System.out.println(obj.minimumRefill(plant, capacityA, capacityB));
//     }
// }









package Array;

public class WateringPlants2105 {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int canA = capacityA, canB = capacityB;
        int refillA = 0, refillB = 0;
        int i = 0, j = plants.length - 1;

        while (i < j) {
            if (canA < plants[i]) {
                refillA++;
                canA = capacityA;
            }
            if (canB < plants[j]) {
                refillB++;
                canB = capacityB;
            }
            canA -= plants[i];
            canB -= plants[j];
            i++;
            j--;
        }

        // If there's a middle plant left after the two pointers meet
        if (i == j) {
            if (canA < plants[i] && canB < plants[i]) {
                refillA++;
            } else if (canA < plants[i]) {
                refillA++;
            } else if (canB < plants[i]) {
                refillB++;
            }
        }

        return refillA + refillB;
    }

    public static void main(String[] args) {
        WateringPlants2105 sol = new WateringPlants2105();
        int[] plants = {2, 2, 3, 3};
        int capacityA = 5;
        int capacityB = 5;

        System.out.println("Minimum refills needed: " + sol.minimumRefill(plants, capacityA, capacityB)); // Expected output: 1

        int[] plants2 = {2, 2, 3, 3};
        int capacityA2 = 3;
        int capacityB2 = 4;

        System.out.println("Minimum refills needed: " + sol.minimumRefill(plants2, capacityA2, capacityB2)); // Expected output: 0

        int[] plants3 = {2, 2, 3, 3};
        int capacityA3 = 10;
        int capacityB3 = 8;

        System.out.println("Minimum refills needed: " + sol.minimumRefill(plants3, capacityA3, capacityB3)); // Expected output: 1
    }
}
