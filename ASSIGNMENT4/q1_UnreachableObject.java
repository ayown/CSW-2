package ASSIGNMENT4;
//Write a Java program to demonstrate garbage collection using an UnreachableObject class. It should include a constructor to initialize an object with a given name, a show() method creating an instance and invoking display(), and the display() method creating another instance. The main() method should call show() and explicitly invoke the garbage collector. The program must override the finalize() method to print the object's name upon successful garbage collection, illustrating how unreachable objects are collected.
class q1_UnreachableObject {
    private String name;

    public q1_UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        q1_UnreachableObject obj1 = new q1_UnreachableObject("Object 1");
        obj1.display();
    }

    public void display() {
        q1_UnreachableObject obj2 = new q1_UnreachableObject("Object 2");
    }
  
    protected void finalize() {
        System.out.println(name + " is successfully garbage collected!");
    }

    public static void main(String[] args) {
        q1_UnreachableObject obj = new q1_UnreachableObject("Main Object");
        obj.show();
        System.gc();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
