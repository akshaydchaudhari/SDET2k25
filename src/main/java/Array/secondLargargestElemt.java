package Array;

public class secondLargargestElemt {

    public static void main(String[] args) {

        int[] arr = {1, 2, 18, 4, 2, 22, 4, 7, 2, 6, 2};

        secondMaxElement(arr);
    }

    private static void secondMaxElement(int[] arr) {

        int max = Integer.MIN_VALUE;
        int secondMx = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > max) {

                secondMx = max;
                max = num;
            } else if (num > secondMx && num != max) {

                secondMx = num;

            }

        }
        System.out.println("Second Largest Number: " + secondMx);
    }
}
