
package edu.neu.mgen;

import java.util.ArrayList;

/**
 * There is an array of Strings defined in the class: {“Anne”, “John”, “Alex”,
 * “Jessica”}. Create a method that returns a new array that consists of all
 * elements of the original array in the inverse order.
 * Each element (string) in the resultant array is written backward compared to
 * the original string (as the inverse words) – example “abc” -> “cba”.
 * Each element (string) in the resultant array starts with the capital letter,
 * and all other letters are lower case.
 * The main program calls the created methods that prints the original and
 * resultant arrays as shown below:
 * Original array:
 * “Anne”,
 * “John”,
 * “Alex”,
 * “Jessica”
 * End of the array
 * 
 * Resultant array:
 * “Acissej”,
 * “Xela”,
 * “Nhoj”,
 * “Enna”
 * End of the array
 */

public class HW8 {

    public static void main(String[] args) {
        String[] original = { "Anne", "John", "Alex", "Jessica" };
        String[] result = reverseStringsWithCapitalInArray(original);

        for (String str : result) {
            System.out.println(str);

        }

    }

    private static String[] reverseStringsWithCapitalInArray(String[] strArray) {

        if (strArray == null) {
            return null;
        }

        String[] result = new String[strArray.length];
        int idx;
        for (int i = 0; i < strArray.length; i++) {
            idx = strArray.length - 1 - i;
            result[idx] = reverseStringWithCapital(strArray[i]);
        }

        return result;

    }

    private static String reverseStringWithCapital(String original) {
        if (original == null) {
            return null;
        }
        int strLen = original.length();
        char[] str = new char[strLen];
        for (int i = 0; i < strLen; i++) {
            str[i] = original.charAt(strLen - i - 1);
            if (i == 0) {
                str[i] = Character.toUpperCase(str[i]);
            } else {
                str[i] = Character.toLowerCase(str[i]);
            }
        }
        String result = String.valueOf(str);
        return result;
    }

}