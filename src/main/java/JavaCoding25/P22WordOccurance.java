package JavaCoding25;

import java.util.HashMap;
import java.util.Map;

public class P22WordOccurance {

    public static void main(String[] args) {

        String str = "Akshay is the best Akshay is perfect";

        String[] str1 = str.split(" ");

        findWordOccurance(str1);
    }

    private static void findWordOccurance(String[] str1) {

        Map<String, Integer> freqOfWord = new HashMap<>();

        for (String word : str1) {

            freqOfWord.put(word, freqOfWord.getOrDefault(word, 0) + 1);
        }

        System.out.println(freqOfWord); // {the=1, Akshay=2, perfect=1, is=2, best=1}

        for (Map.Entry<String, Integer> entry : freqOfWord.entrySet()) {

            System.out.println("Word:" + entry.getKey() + " : " + entry.getValue());


        }
    }

}
