package Array;

public class FindPairSumOfArray {

    public static void main(String[] args) {
        int[] arr = {0, 7, 4, -5, 11, 5, 20};
        int target1 = 11;

        findPair(arr, target1);
    }

    public static void findPair(int[] arr, int target) {
        boolean pairFound = false;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println("pair Found: (" + arr[i] + " : " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }
        if (!pairFound) {
            System.out.println("No Pair found");
        }

    }
}

