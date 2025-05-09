package CH16.IO;

import java.io.*;

public class DeleteAndRecreateFile {
    public static void main(String[] args) {
        File file = new File("CH16/IO/output.txt");
        try{
            if(file.exists()){
                file.delete();
//                char[] n={'n','e','w'};
                file.createNewFile();
                System.out.println("File content deleted succesfully. ");
            }else{
                System.out.println("File does not exist. ");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
