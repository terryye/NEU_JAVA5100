package edu.neu.mgen.HW11;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        printString("Welcome to the Input Program!");     
       
        try{
            printString("Please enter an integer:");
            int intInput = Integer.parseInt(scanner.nextLine());
            printString("You entered " + intInput);
            
            printString("Now enter a decimal number:");
            double decimalInput = Double.parseDouble(scanner.nextLine());
            printString("You entered: " + decimalInput);

        }catch(NumberFormatException e){
            printString("Error: Invalid number format. Please enter valid numeric values.");
        }catch(Exception e){
            printString("Error: Unexpected error.");
        }finally {
            scanner.close();
        }
    }

    public static void printString(String str){
        System.out.println(str); 
    }
}
