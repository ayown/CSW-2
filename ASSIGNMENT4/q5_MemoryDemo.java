package ASSIGNMENT4;
class Data {
    private int integerValue;
    private double doubleValue;

    public Data(int integerValue, double doubleValue) {
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
    }

    public void setValues(int integerValue, double doubleValue) {
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
    }

    public void updateValues(int integerValue, double doubleValue) {
        this.integerValue = integerValue;
        this.doubleValue = doubleValue;
    }

    public int getIntegerValue() {
        return integerValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }
}

public class q5_MemoryDemo {
    public static void main(String[] args) {
     
        Runtime runtime = Runtime.getRuntime();

        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Initial Memory Used: " + initialMemory + " bytes");

        Data obj1 = new Data(10, 20.5);
        Data obj2 = new Data(30, 40.7);

        obj1.setValues(15, 25.5);
        obj2.updateValues(35, 45.7);

        System.out.println("obj1: " + obj1.getIntegerValue() + ", " + obj1.getDoubleValue());
        System.out.println("obj2: " + obj2.getIntegerValue() + ", " + obj2.getDoubleValue());

        obj1 = null;
        obj2 = null;

        System.gc();

        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory Used After Garbage Collection: " + finalMemory + " bytes");

        System.out.println("Memory Freed: " + (initialMemory - finalMemory) + " bytes");
    }
}
