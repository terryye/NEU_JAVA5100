
package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1 {

    public static void main(String[] args) {
        part1();
        part2();
    }

    /**
     * Lab 1 part 1 - Array
     * 
     * Initiate two integer arrays, x, and y, each containing 5 numbers.
     * Create another array z of length 5, the elements of which are the max of the
     * respective numbers of the two arrays x and y.
     * Organize a nice-looking output to the terminal that looks like the following:
     * Array x = { array x values here separated by coma }
     * 
     * Array y = { array y values here separated by coma }
     * 
     * Array z = x + y = { array z values here separated by coma }
     * 
     * 
     */

    private static void part1() {

        int[] x = { 29, 2, 34, 13, 51 };
        int[] y = { 10, 20, 30, 40, 50 };
        int[] z = new int[5];

        for (int i = 0; i < z.length; i++) {
            z[i] = x[i] > y[i] ? x[i] : y[i];
        }

        printArray("Array x =", x);
        printArray("Array y =", y);
        printArray("Array z = x + y = ", z);
    }

    /**
     * Lab 1 part 2 - ArrayList
     * 
     * Initiate an ArrayList that contain 5 names
     * Switch the first and last letters in each name in the ArrayList. Do not
     * forget that each name begins with a capital letter, but the other letters are
     * lowercase. The names with switched letters should follow the same rule as
     * there are new names.
     * Organize a nice-looking output to the terminal that looks like the following:
     * Names = { list of names here separated by coma }
     * 
     * Names (switched) = { list of names with switched first and last letters here
     * separated by coma }
     */
    private static void part2() {

        ArrayList<String> original = new ArrayList<String>();
        original.add("John");
        original.add("Lucy");
        original.add("Cindy");
        original.add("Tommy");
        original.add("Terry");
        printArray("Names =", original);

        ArrayList<String> switched = new ArrayList<String>();
        for (String name : original) {
            switched.add(changeLetter(name));
        }
        printArray("Names (switched) =", switched);

    }

    private static String changeLetter(String name) {
        if (name == null) {
            return null;
        }
        if (name.length() == 0) {
            return name;
        }

        char[] nameChars = name.toCharArray();
        char firstChar = nameChars[0];
        int indexLast = name.length() - 1;
        nameChars[0] = Character.toUpperCase(nameChars[indexLast]);
        nameChars[indexLast] = Character.toLowerCase(firstChar);

        return String.valueOf(nameChars);

    }

    private static <T> void printArray(String prefix, int[] array) {
        System.out.print(prefix);
        System.out.print(" { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != (array.length - 1)) {
                System.out.print(" , ");
            }

        }
        System.out.println(" } ");
    }

    private static <T> void printArray(String prefix, ArrayList<String> array) {
        System.out.print(prefix);
        System.out.print(" { ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i != (array.size() - 1)) {
                System.out.print(" , ");
            }

        }
        System.out.println(" } ");
    }

}