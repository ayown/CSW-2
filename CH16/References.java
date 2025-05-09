package CH16;

//import java.lang.ref.PhantomReference;
//import java.lang.ref.ReferenceQueue;
//import java.lang.ref.SoftReference;
//import java.lang.ref.WeakReference;

import java.lang.ref.*;
public class References {
    public static void main(String[] args) throws InterruptedException {
        Employee emp;
        emp = null;
        System.out.println("* Before any Reference:- ");
        System.out.println("  "+emp);
        System.out.println();
        System.out.println("* After References:- ");
        WeakRefer();
        System.out.println();
        SoftRefer();
        System.out.println();
        PhantomRefer();
    }

    private static void WeakRefer() {
        System.out.println("  Weak Reference Example: ");
        Employee emp = new Employee (12,"AP");
        WeakReference<Employee> weak = new WeakReference<>(emp);
        System.out.println(emp);
        System.out.println("  Before GC: " + weak.get());
        emp = null;
        System.gc();
        System.out.println("  After GC: " + weak.get());
    }
    private static void SoftRefer() {
        System.out.println("  Soft Reference Example: ");
        Employee emp = new Employee (12,"AP");
        SoftReference<Employee> soft = new SoftReference<>(emp);
        System.out.println(emp);
        System.out.println("  Before GC: " + soft.get());
        emp = null;
        System.gc();
        System.out.println("  After GC: " + soft.get());
    }
    private static void PhantomRefer() throws InterruptedException {
        System.out.println("  Phantom Reference Example: ");
        Employee emp = new Employee (12,"AP");
        ReferenceQueue<Employee> refq = new ReferenceQueue<>();
        PhantomReference<Employee> phan = new PhantomReference<>(emp,refq);
        emp=null;
        System.gc();
        Thread.sleep(1000);
        if(refq.poll()!= null ) {
            System.out.println("  Employee object is garbage collected");
            phan.clear();
        }else{
            System.out.println("  Employee object is NOT yet garbage collected");
        }
        System.out.println("  "+ phan.get());
    }

}
class Employee {
    private int id;
    private String name;
    public Employee (int id , String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "  Employee [id=" + id + ", name=" + name + "]";
    }
}



