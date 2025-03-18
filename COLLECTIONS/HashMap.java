package COLLECTIONS;
import java.util.*;
class HashMap {
    public static void main(String[] args){
        Map<String,Integer> m1=new java.util.HashMap<>();
        m1.put("ayan",100);
        m1.put("shivam",95);
        m1.put("rishabh",90);
        m1.put("aman",85);
        m1.put("harsh",80);
        int marks=m1.get("harsh");

        m1.forEach((key,value) -> {
            System.out.println(key + " - "+value);
        });
        System.out.println("harsh's marks ="+marks);

        System.out.println(m1.size());
        m1.remove("harsh");


        m1.forEach((key,value) -> {
            System.out.println(key + " - "+value);
        });

        System.out.println(m1.get("adarsh"));


        m1.put(null,90);
        m1.put("Harsh",null);
        m1.put("Adarsh",null);


        System.out.println(m1);
//        for (int i=1;i<=3;i++){
//            System.out.println("key is "+i+" and "+m1.get(i)+" is the value");
//        }

    }
}
