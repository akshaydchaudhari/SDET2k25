package Array;

public class CountEvenAndOdd {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2, 2, 6, 7, 9, 8, 7, 1};

        countEvenAndOdd(arr);
    }

    private static void countEvenAndOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {

            if (num % 2 == 0) evenCount++;
            else oddCount++;

        }
        System.out.println("Even Numbers :" + evenCount);
        System.out.println("Odd Number :" + oddCount);
    }
}
