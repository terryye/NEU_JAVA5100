package edu.neu.mgen.HW12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Develop the following program:
        - Open a Notepad application on your computer, write phrase “This is my Java read test”, and save it - under filename “my_test_file.txt”
        - Read this file from your Java program and print the phrase in the Java terminal.
        - Enter phrase “Java write test” into your Java program from the Java terminal.
        - Save this phrase in the same file “my_test_file.txt” using your Java program,
        - Open file “my_test_file.txt” with Notepad and make sure that your last phrase is written into the file.
         */

//        String filePath = Main.class.getResource("./my_test_file.txt").getPath();// this will return the target folder path
//        System.out.println("file path: " + filePath);
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/src/main/java/edu/neu/mgen/HW12/my_test_file.txt";
        try{
            // Read the file
            File myObjFile = new File(filePath);
            Scanner myReader = new Scanner(myObjFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);               
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        try{
            //read the input from the terminal
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the text to write to the file: ");
            String text = scanner.nextLine();
            scanner.close();
            //write the text to the file
            FileWriter myFileWriter = new FileWriter(filePath);
            myFileWriter.write(text);
            myFileWriter.close();

        } catch (IOException e) {
            System.out.println("Can not write into file");
            e.printStackTrace();
        }
    }
}
