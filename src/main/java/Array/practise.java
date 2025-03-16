package Array;

public class practise {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 4, 2, 1};
        System.out.println(isPalindron(arr));

        int[] arr1 = {-1, -2, 1, 1, 0, -1, 2, -1};

        consectriSumZero(arr);
    }

    private static boolean isPalindron(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            if (arr[start] != arr[end]) {

                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    private static void consectriSumZero(int arr[]) {
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] + arr[i + 1] + arr[i + 2] == 0) {

                count++;
                System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);

            }
        }

        System.out.println(count);


    }
}

