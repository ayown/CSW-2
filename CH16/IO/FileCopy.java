package CH16.IO;
import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

        try (FileReader r = new FileReader("CH16/IO/input.txt");
             FileWriter w = new FileWriter("CH16/IO/output.txt")) {

            char[] arr = new char[10];
            int bytesread = r.read(arr);

            if (bytesread != -1) {
                w.write(arr, 0, bytesread);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
