package Array;

public class FindMaxAndMin {

    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {

            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
