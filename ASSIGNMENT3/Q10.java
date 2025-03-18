package ASSIGNMENT3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileNotFoundCustomException extends Exception {
    public FileNotFoundCustomException(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Q10 {

    public static void readFile(String filePath) throws FileNotFoundCustomException, FileReadPermissionException {
        File file = new File(filePath);
        if (file == null || !file.exists()) {
            throw new FileNotFoundCustomException("File not found: " + filePath);
        }
        if (!file.canRead()) {
            throw new FileReadPermissionException("Permission denied to read the file: " + filePath);
        }
        System.out.println("File found and ready to read: " + filePath);
    }

    public static void main(String[] args) {
        try {
            readFile(args[0]);
        } catch (FileNotFoundCustomException | FileReadPermissionException e) {
            System.out.println(e.getMessage());
        }
    }
}

