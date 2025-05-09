package CH16.IO;

import java.io.*;

public class Writer {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("CH16/IO/output.txt");
            writer.write('A');
            char[] data={'H','e','l','l','o',' ','A'};
            writer.write(data);
            writer.close();
            System.out.println("Data written succesfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
