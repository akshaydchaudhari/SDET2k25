package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {

        //Only homogeneous data allowed
        PriorityQueue priorityQueue = new PriorityQueue();

        //add() --> Unsuccessful --> throws Exception & offer() --> Unsuccessful --> returns false
        //Both the methods are used to add data to the priority queue
        priorityQueue.add("A");
        priorityQueue.add("B");
        priorityQueue.add("C");
        priorityQueue.add("D");
        priorityQueue.offer("E");
        priorityQueue.offer("F");

        System.out.println("All Queue elements" + priorityQueue);

        //element() --> Unsuccessful --> throws Exception & peek() --> Unsuccessful --> returns null
        //Both the methods are used to get head element of the priority queue
        System.out.println("element method returns head object of the Queue : " + priorityQueue.element());
        System.out.println("peek method returns head object of the Queue : " + priorityQueue.peek());

        //remove() --> Unsuccessful --> throws Exception & poll() --> Unsuccessful --> returns null
        //Both the methods are used to return & remove head element from the priority queue
        System.out.println("remove method remove & returns head object of the Queue : " + priorityQueue.remove());
        System.out.println("Remaining Queue elements" + priorityQueue);

        System.out.println("poll method remove & returns head object of the Queue : " + priorityQueue.poll());
        System.out.println("Remaining Queue elements" + priorityQueue);

        //Verify element,peek, remove and poll mothods on empty Queue
        PriorityQueue emptyPriorityQueue = new PriorityQueue();

        try {
            System.out.println("element method returns exception if head object of the Queue is not found : " + emptyPriorityQueue.element());
        } catch (Exception e) {
            System.out.println("peek method returns null if head object of the Queue : " + emptyPriorityQueue.peek());
            e.printStackTrace();
        }

        try {
            System.out.println("remove method returns exception if head object of the Queue is not found : " + emptyPriorityQueue.remove());
        } catch (Exception e) {
            System.out.println("poll method returns null if head object of the Queue : " + emptyPriorityQueue.poll());
            e.printStackTrace();
        }

        //Printing all elemets of Queue

        PriorityQueue priorityQueueNumbers = new PriorityQueue();
        priorityQueueNumbers.add("1");
        priorityQueueNumbers.add("3");
        priorityQueueNumbers.add("2");
        priorityQueueNumbers.add("5");
        priorityQueueNumbers.add("4");

        //To read all the elements in queue using for..each loop
        System.out.println("****Reading all the elements in queue using for..each loop****");
        for (Object e : priorityQueueNumbers) {
            System.out.println(e);
        }

        //To read all the elements in queue using iterator method
        System.out.println("****Reading all the elements in queue using iterator method****");
        Iterator iterator = priorityQueueNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
