package Collections;

import java.util.Hashtable;

public class HashTablePractice {

    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<Integer, String>();

        hashTable.put(18, "Virat Kohli");
        hashTable.put(17, "Rishabh Pant");
        hashTable.put(93, "Jasprit Bumrah");
        hashTable.put(33, "Hardik Pnadya");
        hashTable.put(45, "Rohit Sharma");
        hashTable.put(01, "KL Rahul");

        System.out.println("All entries in the hashtable are : " + hashTable);

        System.out.println("Get value by key 18 : " + hashTable.get(18));

        System.out.println("Remove value by key 45 : " + hashTable.remove(45));

        System.out.println("Checking for existing key : " + hashTable.containsKey(18));
        System.out.println("Checking for non-existing key : " + hashTable.containsKey(45));

        System.out.println("Checking for existing value : " + hashTable.containsValue("Virat Kohli"));
        System.out.println("Checking for non-existing value : " + hashTable.containsValue("Rohit Sharma"));

        System.out.println("Checking for non-empty hashtable : " + hashTable.isEmpty());

        System.out.println("Key set is : " + hashTable.keySet());
        System.out.println("Value set is : " + hashTable.values());
        System.out.println("Entry set is : " + hashTable.entrySet());

        //Reading all elements from Keys
        System.out.println("All keys are : ");
        for (int number : hashTable.keySet()) {
            System.out.println(number);
        }

        //Reading all elements from value
        System.out.println("All values are : ");
        for (String values : hashTable.values()) {
            System.out.println(values);
        }

        //Reading key value pairs from hashtable
        System.out.println("All key-value pairs are : ");
        for (int number : hashTable.keySet()) {
            System.out.println(number + " : " + hashTable.get(number));
        }

    }

}
