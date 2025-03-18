package COLLECTIONS;

import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<String> prQueue = new PriorityQueue<String>();
        prQueue.add("C");
        prQueue.add("Java");
        prQueue.add("Python");
        prQueue.add("C++");

        System.out.println("The head value by using peek function is: " + prQueue.peek());

        System.out.println("The total queue elements are:");
        List<String> queueList = new ArrayList<>(prQueue);
        for (String element : queueList) {
            System.out.println(element);
        }

        prQueue.poll();
        System.out.println("After removing an element with poll function: ");
        queueList = new ArrayList<>(prQueue);
        for (String element : queueList) {
            System.out.println(element);
        }

        prQueue.remove("Java");
        System.out.println("after removing Java with remove function");
        queueList = new ArrayList<>(prQueue);
        for (String element : queueList) {
            System.out.println(element);
        }

        boolean a = prQueue.contains("C");
        System.out.println("Does this priority queue contains C: " + a);
    }
}
