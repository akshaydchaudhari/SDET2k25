package JavaCoding25;

import java.util.LinkedHashMap;
import java.util.Map;

public class P12CountLetters {

    public static void main(String[] args) {

        System.out.println(countLetters("hello"));
        System.out.println(countLetters("akshay"));

    }

    public static Map<Character, Integer> countLetters(String str) {

        Map<Character, Integer> letters = new LinkedHashMap<>();


        for (int i =0; i<str.length(); i++) {

            char ch = str.charAt(i);

            if(letters.containsKey(ch)) {

                letters.put(ch, letters.get(ch)+1);

            }
            else {
                letters.put(ch, 1);
            }
        }
        return letters;
    }
}
