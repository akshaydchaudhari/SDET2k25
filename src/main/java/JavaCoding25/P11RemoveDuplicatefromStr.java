package JavaCoding25;

import java.util.LinkedHashSet;
import java.util.Set;

public class P11RemoveDuplicatefromStr {

    public static void main(String[] args) {

        System.out.println(removeDup("akshay"));


    }

    public static String removeDup(String str) {

        StringBuilder strNoDup = new StringBuilder();

        for(char ch : str.toCharArray()) {

            if(!strNoDup.toString().contains(String.valueOf(ch))) {
                strNoDup.append(ch);

            }
        }
        return strNoDup.toString();
    }

    //Another way to do it with Set

    public static  String  removeDupWithSet(String str) {
        StringBuilder strNoDup = new StringBuilder();

        char[] letters = str.toCharArray();

        Set<Character> set = new LinkedHashSet<>();

        // add each letter to set. It will remove duplicates - Set does not allow duplicates
        for(Character ch : set) {

            strNoDup.append(ch);

        }
        return strNoDup.toString();
    }

}
