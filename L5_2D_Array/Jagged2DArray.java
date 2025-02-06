public class Jagged2DArray {
    public static void main(String[] args) {
        // Declaring the array reference 
        int[][] jaggedArray = new int[3][]; //->[] this must be empty 

// Declaring the actual arrays (each row can have different lengths)
        jaggedArray[0] = new int[2];  // First row has 2 elements
        jaggedArray[1] = new int[4];  // Second row has 4 elements
        jaggedArray[2] = new int[3];  // Third row has 3 elements

// Assigning values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
        jaggedArray[1][2] = 5;
        jaggedArray[1][3] = 6;
        jaggedArray[2][0] = 7;
        jaggedArray[2][1] = 8;
        jaggedArray[2][2] = 9;

// Displaying the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
