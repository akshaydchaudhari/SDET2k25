package Array;

public class ConsecutiveTripletsSumZero {
    //Find the count of three consecutive numbers in the array {-1, -2, 1, 1, 0, -1, 2, -1} whose sum equals zero.
    public static void main(String[] args) {

        int[] arr = {-1, -2, 1, 1, 0, -1, 2, -1};
        ConsecutiveTripletsSumZero1(arr);
    }

    private static void ConsecutiveTripletsSumZero1(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {

            if (arr[i] + arr[i + 1] + arr[i + 2] == 0) {

                count++;
                System.out.println("Triplate: (" + arr[i] + "," + arr[i + 1] + "," + arr[i + 2] + ")");

            }
        }
        System.out.println("Count of Consecutive Numbers whose sum is Zero: " + count);
    }


}
