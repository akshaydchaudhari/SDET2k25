package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        //Creating linkedList object
        LinkedList linkedList = new LinkedList();

        //Adding elements having different datatypes to linkedList
        linkedList.add("Ruturaj");
        linkedList.add(18);
        linkedList.add(18.18);
        linkedList.add('@');
        linkedList.add(true);

        System.out.println(linkedList); //[Ruturaj, 18, 18.18, @, true]

        System.out.println("Total elements present in linkedList are : " + linkedList.size());

        //Remove element from linkedList
        linkedList.remove(3);       // Using index
        linkedList.remove(true);    // Using actual element

        System.out.println("linkedList after removing elements : " + linkedList); //[Ruturaj, 18, 18.18]

        //Add element at particular index
        linkedList.add(3, '$');
        linkedList.add(4, false);

        System.out.println("linkedList after adding new elements using index no : " + linkedList); //[Ruturaj, 18, 18.18, $, false]

        //retrieve element at specific index
        System.out.println("Element at second index : " + linkedList.get(2));

        //Replace the element at specific index
        linkedList.set(3, '#');

        System.out.println("linkedList after replacing element at third index : " + linkedList);   //[Ruturaj, 18, 18.18, #, false]

        //To check if linkedList contains specific element
        System.out.println("Verifying existing element : " + linkedList.contains("Ruturaj"));
        System.out.println("Verifying non-existing element : " + linkedList.contains("RuturajPatil"));

        //To verify if linkedList is empty
        System.out.println("Verifying non-empty linkedList : " + linkedList.isEmpty());

        //To read all the elements in linkedList using for loop
        System.out.println("****Reading all the elements in linkedList using for loop****");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //To read all the elements in linkedList using for..each loop
        System.out.println("****Reading all the elements in linkedList using for..each loop****");

        for (Object elements : linkedList) {
            System.out.println(elements);
        }

        //To read all the elements in linkedList using for..each loop
        System.out.println("****Reading all the elements in linkedList using iterator method****");

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Creating new homogeneous linkedList

        LinkedList linkedList1 = new LinkedList();

        linkedList1.add("X");
        linkedList1.add("Y");
        linkedList1.add("Z");
        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");

        //Copying all elements from linkedList1 to linkedList2
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addAll(linkedList1);
        System.out.println("After copying all elements from linkedList1 to linkedList2 : " + linkedList2);  //[X, Y, Z, A, B, C]

        //Removing all elements from linkedList2
        linkedList2.removeAll(linkedList1);
        System.out.println("After Removing all elements from linkedList2 : " + linkedList2);

        //Sorting linkedList
        Collections.sort(linkedList1);
        System.out.println("After Sorting all elements of linkedList1 : " + linkedList1); //[A, B, C, X, Y, Z]

        //Sorting linkedList in reverse order
        Collections.sort(linkedList1, Collections.reverseOrder());
        System.out.println("After Sorting all elements of linkedList1 in reverse order : " + linkedList1); //[Z, Y, X, C, B, A]

        //Shuffling the linkedList
        Collections.shuffle(linkedList1);
        System.out.println("After Shuffling all elements of linkedList1 : " + linkedList1);

        //New methods of linkedlist

        //To add element at first index
        linkedList1.addFirst("Pratibha");

        //To add element at last index
        linkedList1.addLast("Tejas");

        System.out.println("LinkedList1 after adding element at first & last index : " + linkedList1);

        //To remove element at first index
        linkedList1.removeFirst();

        //To remove element at last index
        linkedList1.removeLast();

        System.out.println("LinkedList1 after removing element at first & last index : " + linkedList1);

        //To get element at first index
        System.out.println("LinkedList1 has element at first index : " + linkedList1.getFirst());

        //To get element at last index
        linkedList1.getLast();
        System.out.println("LinkedList1 has element at last index : " + linkedList1.getLast());

    }

}
