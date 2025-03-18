package ASSIGNMENT4;
class q2_ReassigningReference {
    private String name;
    public q2_ReassigningReference(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " is successfully garbage collected!");
    }

    public static void main(String[] args) {
   
        q2_ReassigningReference obj1 = new q2_ReassigningReference("Object 1");
        q2_ReassigningReference obj2 = new q2_ReassigningReference("Object 2");

   
        obj1 = obj2;

   
        System.gc();

    
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
