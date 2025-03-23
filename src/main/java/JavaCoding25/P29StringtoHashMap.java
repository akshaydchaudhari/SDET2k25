package JavaCoding25;

import java.util.HashMap;
import java.util.Map;

public class P29StringtoHashMap {

    public static void main(String[] args) {

        String str = " | name= Akshay| surname=Chaudhari | city=pune| ";

        // Call the method to convert string to HashMap
        Map<String, String> map = convertoHashmap(str);

        // Print the resulting HashMap
        System.out.println(map);

        convertoHashmap1(str);
    }

    public static Map<String, String> convertoHashmap(String str) {

        Map<String, String> map = new HashMap<>();

        String[] pairs = str.trim().split("\\|");

        for (String pair : pairs) {
            if (pair.contains("=")) {

                String[] keyValue = pair.trim().split("=", 2);

                if (keyValue.length == 2) {

                    map.put(keyValue[0].trim(), keyValue[1].trim());
                }
            }

        }
        return map;
    }


    public static void convertoHashmap1(String str) {

        Map<String, String> map = new HashMap<>();

        String[] pairs = str.trim().split("\\|");

        for (String pair : pairs) {
            if (pair.contains("=")) {

                String[] keyValue = pair.trim().split("=", 2);

                if (keyValue.length == 2) {

                    map.put(keyValue[0].trim(), keyValue[1].trim());
                }
            }

        }
        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " : " + entry.getValue());

        }
    }
}
