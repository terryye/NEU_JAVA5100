
package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    /*
     * declare and initialize variables of types "int", "long", "double", "boolean",
     * and "char" - two variables for each type.
     * convert initialized variables of type "int" to "long"
     * convert initialized variables of type "long" to "int"
     * enter values for variables from the terminal.
     * write the code and run the program for various arithmetic and logical
     * operation with the variables.
     */

    public static void main(String[] args) {
        hw5();

    }

    public static void hw4() {
        // declare and initialize variables of types "int", "long", "double", "boolean",
        // and "char" - two variables for each type.
        int intVar1 = -5000;
        int intVar2 = 2 ^ 19;
        long longVar1 = -90000;
        long longVar2 = 223372036854775807L;
        double dbVar1 = 385739.328173;
        double dbVar2 = -9985739.36478;
        boolean bVar1 = true;
        boolean bVar2 = false;

        // convert initialized variables of type "int" to "long"
        long longVarFromInt1 = intVar1;
        long longVarFromInt2 = intVar2;

        System.out.println("intVar1 = " + intVar1 + ", converted to long:" + longVarFromInt1);
        System.out.println("intVar2 = " + intVar2 + ", converted to long:" + longVarFromInt2);

        // convert initialized variables of type "long" to "int"
        int intVarFromlong1 = (int) longVar1;
        int intVarFromlong2 = (int) longVar2;
        System.out.println("longVar1 = " + longVar1 + ", converted to long:" + intVarFromlong1);
        System.out.println("longVar2 = " + longVar2 + ", converted to long:" + intVarFromlong2);

        // enter values for variables from the terminal.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        intVar1 = scanner.nextInt();

        System.out.println("Enter second integer: ");
        intVar2 = scanner.nextInt();

        System.out.println("Enter first long: ");
        longVar1 = scanner.nextLong();

        System.out.println("Enter sencond long: ");
        longVar2 = scanner.nextLong();

        System.out.println("Enter first double: ");
        dbVar1 = scanner.nextDouble();

        System.out.println("Enter sencond double: ");
        dbVar2 = scanner.nextDouble();

        System.out.println("Enter fitst boolean: ");
        bVar1 = scanner.nextBoolean();

        System.out.println("Enter sencond boolean: ");
        bVar2 = scanner.nextBoolean();
        scanner.close();

        // write the code and run the program for various arithmetic and logical
        // print text in the console
        int intVar = intVar1 - intVar2;
        double longVarDiv = longVar1 / (double) longVar2;
        boolean boolVar = bVar1 && bVar2;
        double dbVar = longVar1 / dbVar1;

        // Print the results in the terminal.
        System.out.println("intVar - intVar2 = " + intVar);
        System.out.println("longVar1 / longVar2 = " + longVarDiv);
        System.out.println("bVar1 && bVar2 = " + boolVar);
        System.out.println("longVar1 / dbVar1 = " + dbVar);
    }

    /**
     * 1) Given String str = “Oakland”; Write a code to
     * find the length of the string
     * find a character with index 2 in the string.
     * extract a substring “land” from str
     * convert all letters in str to capital letters “OAKLAND”.
     * 2) Given int[] abc = {1,3,5,2,5}; Write a code to
     * find the length of the array
     * find the last member of the array.
     * 3) Create an ArrayList that consists of the following strings: “Austin”,
     * “Houston”, “Oakland”, “Paris”, “San Francisco”, “Seattle”. Remove “Paris’
     * from the ArrayList.
     */

    public static void hw5() {
        // Q1:
        String str = "Oakland";
        printStr("str length is " + str.length());
        printStr("char at 2 " + str.charAt(2));
        printStr("substring from index 3 is " + str.substring(3));
        printStr("to uppercase " + str.toUpperCase());

        // Q2:
        int[] abc = { 1, 3, 5, 2, 5 };
        printStr("abc's lenght is " + abc.length);
        printStr("abc's last element is " + abc[abc.length - 1]);

        // Q3:“”, “Oakland”, “Paris”, “San Francisco”, “Seattle”. Remove “Paris’
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");

        cities.remove(3);
        System.out.println(cities);

    }

    public static void printStr(String str) {
        System.out.println(str);
    }

}