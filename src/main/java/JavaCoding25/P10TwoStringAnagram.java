package JavaCoding25;

import java.util.Arrays;

public class P10TwoStringAnagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("triangle","internal"));
        System.out.println(isAnagram("avc", "asks"));

    }

    public static boolean isAnagram(String str, String str1) {

        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);


        return Arrays.equals(arrStr,arrStr1);
    }
}
