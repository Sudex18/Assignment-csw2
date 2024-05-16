package file_management;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileq2  {

    public static void main(String[] args) {
        File file = new File("diary.txt");

        if (!file.exists()) {
            System.out.println("The diary file does not exist.");
            return;
        }

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Contents of my diary:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file....");
            e.printStackTrace();
        }
    }
}

