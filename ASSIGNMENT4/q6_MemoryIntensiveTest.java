package ASSIGNMENT4;
public class q6_MemoryIntensiveTest {

    static class MemoryObject {
        private int[] data = new int[1000]; 
    }

    public static void main(String[] args) {
 
        System.out.println("Start Timestamp: " + System.currentTimeMillis());
        
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Heap Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("Free Heap Memory: " + runtime.freeMemory() + " bytes");

        int numObjects = 100000;
        MemoryObject[] objects = new MemoryObject[numObjects];

        for (int i = 0; i < numObjects; i++) {
            objects[i] = new MemoryObject();
        }

        System.out.println("After Object Creation - Total Heap Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("After Object Creation - Free Heap Memory: " + runtime.freeMemory() + " bytes");

        System.gc();

        System.out.println("After GC - Total Heap Memory: " + runtime.totalMemory() + " bytes");
        System.out.println("After GC - Free Heap Memory: " + runtime.freeMemory() + " bytes");

        System.out.println("End Timestamp: " + System.currentTimeMillis());
    }
}
