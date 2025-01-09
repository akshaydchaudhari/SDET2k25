package JavaCoding25;

import java.util.Arrays;
import java.util.Scanner;

public class P18AnagramString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input First String:" );
        String str1 = sc.nextLine();
        System.out.println("Input First String:" );
        String str2 = sc.nextLine();

        System.out.println(isAnagram(str1, str2));

        System.out.println(isAnagram("listen", "silent"));

    }
    public static boolean isAnagram(String str1, String str2) {

        if(str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        else {

           char[] arrStr1 = str1.toCharArray();
           char[] arrStr2  = str2.toCharArray();

            Arrays.sort(arrStr1);
            Arrays.sort(arrStr2);
            Arrays.equals(arrStr1,arrStr2);

        }

        return true;
    }
}
