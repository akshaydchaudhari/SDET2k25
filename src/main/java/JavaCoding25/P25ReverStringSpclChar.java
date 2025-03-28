package JavaCoding25;

public class P25ReverStringSpclChar {

    public static void main(String[] args) {

        String str = "a%B*C&%d(hds@";   //output : s%d*h&%d(CBa@

        System.out.println(revStrWithoutSpclChar2(str));


    }

    private static String revStrWithoutSpclChar(String str) {

        char[] arr = str.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {
                left++;
            } else if (!Character.isLetter(arr[right])) {

                right--;
            } else {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }


        }
        return new String(arr);
    }

    private static String revStrWithoutSpclChar2(String str) {


        char[] arr = str.toCharArray();

        int left = 0, right = arr.length - 1;

        while (left < right) {

            while (!Character.isLetter(arr[left])) {
                left++;
            }
            while (!Character.isLetter(arr[right])) {

                right--;
            }
            if (left < right) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }


        }
        return new String(arr);
    }
}
