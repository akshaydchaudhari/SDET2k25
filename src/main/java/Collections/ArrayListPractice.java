package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListPractice {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) {

        //Creating arraylist object
        ArrayList arrayList = new ArrayList();

        //Adding elements having different datatypes to ArrayList
        arrayList.add("Akshay");
        arrayList.add(18);
        arrayList.add(18.18);
        arrayList.add('@');
        arrayList.add(true);

        System.out.println(arrayList); //[Akshay, 18, 18.18, @, true]

        System.out.println("Total elements present in arraylist are : " + arrayList.size());

        //Remove element from arraylist
        arrayList.remove(3);       // Using index
        arrayList.remove(true);    // Using actual element

        System.out.println("ArrayList after removing elements : " + arrayList); //[Ruturaj, 18, 18.18]

        //Add element at particular index
        arrayList.add(3, '$');
        arrayList.add(4, false);

        System.out.println("ArrayList after adding new elements using index no : " + arrayList); //[Ruturaj, 18, 18.18, $, false]

        //retrieve element at specific index
        System.out.println("Element at second index : " + arrayList.get(2));

        //Replace the element at specific index
        arrayList.set(3, '#');

        System.out.println("ArrayList after replacing element at third index : " + arrayList);   //[Ruturaj, 18, 18.18, #, false]

        //To check if arrayList contains specific element
        System.out.println("Verifying existing element : " + arrayList.contains("Ruturaj"));
        System.out.println("Verifying non-existing element : " + arrayList.contains("RuturajPatil"));

        //To verify if arraylist is empty
        System.out.println("Verifying non-empty arraylist : " + arrayList.isEmpty());

        //To read all the elements in arraylist using for loop
        System.out.println("****Reading all the elements in arraylist using for loop****");

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //To read all the elements in arraylist using for..each loop
        System.out.println("****Reading all the elements in arraylist using for..each loop****");

        for (Object elements : arrayList) {
            System.out.println(elements);
        }

        //To read all the elements in arraylist using for..each loop
        System.out.println("****Reading all the elements in arraylist using iterator method****");

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Creating new homogeneous arraylist

        ArrayList arraylist1 = new ArrayList();

        arraylist1.add("X");
        arraylist1.add("Y");
        arraylist1.add("Z");
        arraylist1.add("A");
        arraylist1.add("B");
        arraylist1.add("C");

        //Copying all elements from arraylist1 to arraylist2
        ArrayList arraylist2 = new ArrayList();
        arraylist2.addAll(arraylist1);
        System.out.println("After copying all elements from arraylist1 to arraylist2 : " + arraylist2);  //[X, Y, Z, A, B, C]

        //Removing all elements from arraylist2
        arraylist2.removeAll(arraylist1);
        System.out.println("After Removing all elements from arraylist2 : " + arraylist2);

        //Sorting arraylist
        Collections.sort(arraylist1);
        System.out.println("After Sorting all elements of arraylist1 : " + arraylist1); //[A, B, C, X, Y, Z]

        //Sorting arraylist in reverse order
        Collections.sort(arraylist1, Collections.reverseOrder());
        System.out.println("After Sorting all elements of arraylist1 in reverse order : " + arraylist1); //[Z, Y, X, C, B, A]

        //Shuffling the arraylist
        Collections.shuffle(arraylist1);
        System.out.println("After Shuffling all elements of arraylist1 : " + arraylist1);

        //Converting array into arraylist

        String[] array = {"Ruturaj", "Rajaram", "Nanda", "Patil"};

        System.out.println("***All names in the array***");
        for (String names : array) {
            System.out.println(names);
        }

        ArrayList arrayToArrayList = new ArrayList(Arrays.asList(array));
        System.out.println("After converting array to arrayList :" + arrayToArrayList);
    }

}
