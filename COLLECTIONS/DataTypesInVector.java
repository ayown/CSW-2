package COLLECTIONS;

import java.util.*;

public class DataTypesInVector {

    public static void main(String[] args) {

        Vector<Object> mixedVector = new Vector<>();

        mixedVector.add(10);
        mixedVector.add(20);
        mixedVector.add(3.14);
        mixedVector.add(2.718);

        mixedVector.add("Apple");
        mixedVector.add("Banana");

        System.out.println("Contents of the Vector: " + mixedVector);

        for (Object obj : mixedVector) {
            if (obj instanceof Integer) {
                System.out.println("Integer value: " + (Integer) obj);
            }
        }

        for (Object obj : mixedVector) {
            if (obj instanceof Double) {
                System.out.println("Double value: " + (Double) obj);
            }
        }

        for (Object obj : mixedVector) {
            if (obj instanceof String) {
                System.out.println("String value: " + (String) obj);
            }
        }

        System.out.println("Size of the vector: " + mixedVector.size());

        mixedVector.remove(0);
        System.out.println("After removing the first element, Vector: " + mixedVector);

        System.out.println("Contains 'Apple'? " + mixedVector.contains("Apple"));
    }
}
