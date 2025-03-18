package ASSIGNMENT3;

class CustomNullPointerException {
    String str="";
    public CustomNullPointerException(String s) {
        str=s;
    }
    public void demonstrateNullPointerException() throws NullPointerException{
        throw new NullPointerException(str);
    }
}
public class Q2 {
    public static void main(String[] args) {
        CustomNullPointerException a = new CustomNullPointerException("Array is Null");
        try {
            int[] ar = {1,2,3};
            if (ar==null)
                a.demonstrateNullPointerException();
            else
                System.out.println("Array at index "+2+" is: "+ar[2]);
        }	catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}


