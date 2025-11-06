package skillbuilder;

import java.io.File;
import java.util.Scanner;

public class myfilepart1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = input.nextLine();

        File textFile = new File(fileName);

        if (textFile.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

      
    }
}
