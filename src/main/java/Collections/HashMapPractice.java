package Collections;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(18, "Virat Kohli");
        hashMap.put(17, "Rishabh Pant");
        hashMap.put(93, "Jasprit Bumrah");
        hashMap.put(33, "Hardik Pnadya");
        hashMap.put(45, "Rohit Sharma");
        hashMap.put(01, "KL Rahul");

        System.out.println("All entries in the hasmap are : " + hashMap);

        System.out.println("Get value by key 18 : " + hashMap.get(18));

        System.out.println("Remove value by key 45 : " + hashMap.remove(45));

        System.out.println("Checking for existing key : " + hashMap.containsKey(18));
        System.out.println("Checking for non-existing key : " + hashMap.containsKey(45));

        System.out.println("Checking for existing value : " + hashMap.containsValue("Virat Kohli"));
        System.out.println("Checking for non-existing value : " + hashMap.containsValue("Rohit Sharma"));

        System.out.println("Checking for non-empty hashmap : " + hashMap.isEmpty());

        System.out.println("Key set is : " + hashMap.keySet());
        System.out.println("Value set is : " + hashMap.values());
        System.out.println("Entry set is : " + hashMap.entrySet());

        //Reading all elements from Keys
        System.out.println("All keys are : ");
        for (int number : hashMap.keySet()) {
            System.out.println(number);
        }

        //Reading all elements from value
        System.out.println("All values are : ");
        for (String values : hashMap.values()) {
            System.out.println(values);
        }

        //Reading key value pairs from hasmap
        System.out.println("All key-value pairs are : ");
        for (int number : hashMap.keySet()) {
            System.out.println(number + " : " + hashMap.get(number));
        }

    }

}
