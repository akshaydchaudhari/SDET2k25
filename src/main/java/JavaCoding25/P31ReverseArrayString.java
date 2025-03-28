package JavaCoding25;

import java.util.Arrays;

public class P31ReverseArrayString {

    public static void main(String[] args) {

        String[] str = {"Akshay", "Chaudhari", "Automation"};
        revArrayString(str);

    }

    public static void revArrayString(String[] str) {

        String revString = "";

        for (String word : str) {

            for (int i = word.length() - 1; i >= 0; i--) {

                revString = revString + word.charAt(i);
            }
            revString = revString + " ";
        }

        System.out.println(revString);
        String[] reverStringArray = revString.split(" ");

        System.out.println(Arrays.toString(reverStringArray));


    }
}
