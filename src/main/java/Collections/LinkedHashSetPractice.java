package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        //Creating linkedHashSet object
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        //Adding elements having different datatypes to LinkedHashSet
        linkedHashSet.add("Ruturaj");
        linkedHashSet.add(18);
        linkedHashSet.add(18.18);
        linkedHashSet.add('@');
        linkedHashSet.add(true);

        System.out.println(linkedHashSet);

        System.out.println("Total elements present in linked hashset are : " + linkedHashSet.size());

        //Remove element from linkedHashSet
        linkedHashSet.remove(true);    // Using actual element

        System.out.println("LinkedHashSet after removing element : " + linkedHashSet);

        //To check if linkedHashSet contains specific element
        System.out.println("Verifying existing element : " + linkedHashSet.contains("Ruturaj"));
        System.out.println("Verifying non-existing element : " + linkedHashSet.contains("RuturajPatil"));

        //To verify if linkedHashSet is empty
        System.out.println("Verifying non-empty linkedHashSet : " + linkedHashSet.isEmpty());


        //To read all the elements in linkedHashSet using for..each loop
        System.out.println("****Reading all the elements in linkedHashSet using for..each loop****");

        for (Object elements : linkedHashSet) {
            System.out.println(elements);
        }

        //To read all the elements in linkedHashSet using for..each loop
        System.out.println("****Reading all the elements in linkedHashSet using iterator method****");

        Iterator iterator = linkedHashSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Creating new homogeneous linkedHashSet

        LinkedHashSet linkedHashSet1 = new LinkedHashSet();

        linkedHashSet1.add("X");
        linkedHashSet1.add("Y");
        linkedHashSet1.add("Z");
        linkedHashSet1.add("A");
        linkedHashSet1.add("B");
        linkedHashSet1.add("C");

        //Copying all elements from linkedHashSet1 to linkedHashSet2
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(linkedHashSet1);
        System.out.println("After copying all elements from linkedHashSet1 to linkedHashSet2 : " + linkedHashSet2);

        //Removing all elements from linkedHashSet2
        linkedHashSet2.removeAll(linkedHashSet1);
        System.out.println("After Removing all elements from linkedHashSet2 : " + linkedHashSet2);

        // LinkedHashSet with homogeneous data
        LinkedHashSet<Integer> oddNumbers = new LinkedHashSet<Integer>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        System.out.println("Set 1 : " + oddNumbers);

        LinkedHashSet<Integer> randomNumbers = new LinkedHashSet<Integer>();
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
