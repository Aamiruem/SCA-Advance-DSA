package Array;

public class Arrays {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.out.println("Array size is " + arr.length);
        // Array resizing
       arr = new int[]{10, 20, 30, 40};
       System.out.println("Now Array size is " + arr.length);
       // Array declaration

        int[] arr1 = new int[10];

        System.out.println(arr1[0]);

        System.out.println(arr1[1]);

        System.out.println(arr1[2]);

        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        arr1[3] = 400;
        arr1[4] = 500;
        arr1[5] = 600;
        arr1[6] = 700;
        arr1[7] = 800;
        arr1[8] = 900;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static char[] toString(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }
}
