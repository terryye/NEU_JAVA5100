
package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 
 * Write and run the program that performs as follows:
 * 
 * As the program starts, its prompts in the terminal “Enter any word:”
 * You enter a word and then press the “Enter” key.
 * The program calculates the length of the entered word (suppose it is Y) and
 * the time passed between the prompt output in item (a) and you pressed “Enter”
 * key in item (b) (suppose the time lapsed is Z seconds)
 * If you press “Enter” key without typing a word, the system types the output
 * “You did not enter any word” and stops. If you entered a not empty word, then
 * the length of the word is less or equal 5, the word is classified as “short”,
 * if the length of the word is between 5 and 10, the word is classified as
 * “medium”, otherwise the word is classified and “long”.
 * If you entered word is not empty, the program output consists of four lines
 * as follows:
 * Your word is XXX
 * It is a short/medium/long word
 * The length of the word is Y
 * Your reaction time is Z seconds
 *
 */

enum LengthType {
    SHORT,
    MEDIUM,
    LONG
}

public class App {

    public static void main(String[] args) {
        printStr("Enter any word:");

        Scanner scanner = new Scanner(System.in);
        long startTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        String userInput = scanner.nextLine();
        long endTime = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
        scanner.close();

        long secondCost = endTime - startTime;

        int len = userInput.length();
        LengthType inputLength;

        if (len == 0) {
            printStr("You did not enter any word");
            return;
        }

        if (len <= 5) {
            inputLength = LengthType.SHORT;
        } else if (len <= 10) {
            inputLength = LengthType.MEDIUM;
        } else {
            inputLength = LengthType.LONG;
        }

        printStr("Your word is " + userInput);
        printStr("It is a " + inputLength.name().toLowerCase() + " word");
        printStr("The length of the word is " + len);
        printStr("Your reaction time is " + secondCost + " seconds");

    }

    public static void printStr(String str) {
        System.out.println(str);
    }

}