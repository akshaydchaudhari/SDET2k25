package Array;

public class CheckPalindromArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        System.out.println("Array is Palindro: " + isPalindrom(arr));
    }

    private static boolean isPalindrom(int[] arr) {

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
}
