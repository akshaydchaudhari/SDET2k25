package Array;

public class searchElement {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        searchElemnt(arr, 9);
    }

    private static void searchElemnt(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {

                System.out.println("Element found On Index: " + i);
                return;
            }
        }
        System.out.println("element not found.");

    }
}
