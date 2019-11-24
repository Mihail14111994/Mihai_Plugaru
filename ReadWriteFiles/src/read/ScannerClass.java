package read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    File file;
    Scanner scanner;

    public ScannerClass(String path) throws FileNotFoundException {
        this.file = new File(path);
        scanner = new Scanner(this.file);
    }

    public void readFromFile(){
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
    }
}
