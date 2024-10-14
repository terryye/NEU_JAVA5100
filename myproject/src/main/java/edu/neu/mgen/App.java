
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

        System.out.println(cities);
        printStr("Remove Paris:");
        cities.remove(3);
        System.out.println(cities);

    }

    public static void printStr(String str) {
        System.out.println(str);
    }

}