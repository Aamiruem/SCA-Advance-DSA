
public class MaxRowColSum {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int max = Integer.MIN_VALUE;
        int index = -1;
        boolean isRow = true;

        // Calculate max row sum
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;
                index = i;
                isRow = true;
            }
        }

        // Calculate max column sum
        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
            if (max < sum) {
                max = sum;
                index = j;
                isRow = false;
            }
        }

        if (isRow) {
            System.out.println("Row " + index + " has the max sum: " + max);
        } else {
            System.out.println("Column " + index + " has the max sum: " + max);
        }
    }
}
