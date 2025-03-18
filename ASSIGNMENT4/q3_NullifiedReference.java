package ASSIGNMENT4;
class q3_NullifiedReference {
    private String name;

    public q3_NullifiedReference(String name) {
        this.name = name;
    }

    protected void finalize() {
        System.out.println(name + " is successfully garbage collected!");
    }

    public static void main(String[] args) {
  
        q3_NullifiedReference obj = new q3_NullifiedReference("Object 1");

        obj = null;

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
