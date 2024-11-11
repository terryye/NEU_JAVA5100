
package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Develop a program that calculates the sum of all elements of a matrix. Use
 * loops. For example, in case of matrix {{1,2,3}, {4,5,6}}, the output should
 * be 21 which is 1+2+3+4+5+6.
 * 
 * Initiate any matrix of any size no less than 2 x 3 in your program. Show the
 * matrix as an output of the program. Run the program. Do not use square
 * matrices (with the same number of rows and columns).
 * 
 * Make a screenshot of the output.
 * Submit both the actual source code file with the program and matrix (the
 * actual java file that can be copied and run) and the snapshot image file of
 * the program output. Thus, submit two files - one the actual java file with
 * the source code and another image file with the screenshot of the output.
 */

public class MiddleExam {

    public static void main(String[] args) {

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        long sum = 0;
        System.out.println("{");
        for (int row = 0; row < matrix.length; row++) {
            System.out.print("{");
            for (int column = 0; column < matrix[row].length; column++) {
                if (column != 0) {
                    System.out.print(",");
                }
                System.out.print(matrix[row][column]);
                sum += matrix[row][column];
            }
            System.out.println("}");
        }
        System.out.println("}");

        System.out.println("sum = " + sum);

    }

    public static void printStr(String str) {
        System.out.println(str);
    }

}