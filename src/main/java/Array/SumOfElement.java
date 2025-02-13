package Array;

public class SumOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(sumofElememts(arr));

    }

    private static int sumofElememts(int[] arr) {
        int sum = 0;

        for (int num : arr) {

            sum += num;

        }
        return sum;
    }
}
