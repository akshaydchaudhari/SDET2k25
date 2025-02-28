package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        //Different ways of creatin hahset object

        HashSet hashSetWithLimit = new HashSet(100); //Set initial limit to 100
        HashSet hashSetWithLoadFactor = new HashSet(100, (float) 0.80); // Set initial limit as well as load factor

        //Considering the 0.80 load factor, if hashset with limit 100 elements ges filled with 80 elements then it will automatically create new object internally
        //Creating hashSet object
        HashSet hashSet = new HashSet();

        //Adding elements having different datatypes to HashSet
        hashSet.add("Ruturaj");
        hashSet.add(18);
        hashSet.add(18.18);
        hashSet.add('@');
        hashSet.add(true);

        System.out.println(hashSet);

        System.out.println("Total elements present in hashset are : " + hashSet.size());

        //Remove element from hashSet
        hashSet.remove(true);    // Using actual element

        System.out.println("HashSet after removing element : " + hashSet);

        //To check if hashSet contains specific element
        System.out.println("Verifying existing element : " + hashSet.contains("Ruturaj"));
        System.out.println("Verifying non-existing element : " + hashSet.contains("RuturajPatil"));

        //To verify if hashSet is empty
        System.out.println("Verifying non-empty hashSet : " + hashSet.isEmpty());


        //To read all the elements in hashSet using for..each loop
        System.out.println("****Reading all the elements in hashSet using for..each loop****");

        for (Object elements : hashSet) {
            System.out.println(elements);
        }

        //To read all the elements in hashSet using for..each loop
        System.out.println("****Reading all the elements in hashSet using iterator method****");

        Iterator iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Creating new homogeneous hashSet

        HashSet hashSet1 = new HashSet();

        hashSet1.add("X");
        hashSet1.add("Y");
        hashSet1.add("Z");
        hashSet1.add("A");
        hashSet1.add("B");
        hashSet1.add("C");

        //Copying all elements from hashSet1 to hashSet2
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(hashSet1);
        System.out.println("After copying all elements from hashSet1 to hashSet2 : " + hashSet2);

        //Removing all elements from hashSet2
        hashSet2.removeAll(hashSet1);
        System.out.println("After Removing all elements from hashSet2 : " + hashSet2);

        // HashSet with homogeneous data
        HashSet<Integer> oddNumbers = new HashSet<Integer>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        System.out.println("Set 1 : " + oddNumbers);

        HashSet<Integer> randomNumbers = new HashSet<Integer>();
        randomNumbers.add(3);
        randomNumbers.add(5);
        randomNumbers.add(9);
        System.out.println("Set 2 : " + randomNumbers);

        //Union Operation
        //oddNumbers.addAll(randomNumbers);
        //System.out.println("Unique elements from both sets after union operation" + oddNumbers);

        //Intersection Operation
        //oddNumbers.retainAll(randomNumbers);
        //System.out.println("Common elements between both sets after intersection operation" + oddNumbers);

        //Difference Operation
        oddNumbers.removeAll(randomNumbers);
        System.out.println("Difference after removing set2 elements from set1 : " + oddNumbers);


    }

}
