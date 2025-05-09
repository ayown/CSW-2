package CH16.IO;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try{
            FileReader r = new FileReader("CH16/IO/output.txt");
            int data=r.read();
            System.out.println("First Character: "+(char)data);
            char[] buffer =  new char[10];
            int bytesRead= r.read(buffer);
            System.out.println("Remaining Content: ");
            for(int i=0;i< bytesRead;i++){
                System.out.print(buffer[i]);
            }
            r.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
