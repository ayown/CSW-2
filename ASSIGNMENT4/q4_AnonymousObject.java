package ASSIGNMENT4;
//Create a Java program to demonstrate anonymous objects and garbage collection using the q4_AnonymousObject class. The class should have a constructor to initialize an object with a name. In the main() method, create an anonymous object and explicitly invoke the garbage collector. Override the finalize() method to print the object's name upon successful garbage collection.
class q4_AnonymousObject {
    private String name;

    public q4_AnonymousObject(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " is successfully garbage collected!");
    }

    public static void main(String[] args) {
        new q4_AnonymousObject("Anonymous Object");

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
