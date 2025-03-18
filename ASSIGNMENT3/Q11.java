package ASSIGNMENT3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q11 {

    public static void processFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
