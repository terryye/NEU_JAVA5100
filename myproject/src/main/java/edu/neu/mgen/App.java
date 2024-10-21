
package edu.neu.mgen;

import java.util.ArrayList;

/**
 * Program
 * You have two matrices A[][] = {{2,3,4},{3,4,5}} and B[][] =
 * {{1,2},{3,4},{5,6}}
 * First check if the matrices can be multiplied A*B.
 * If yes, then use loops to calculate the product of these two matrices A*B
 * Output the result.
 * Comments:
 * 
 * Learn first how to multiply matrices
 * Use loops to go through the matrices.
 * Your algorithm should be able to handle matrices of any size.
 */

public class App {

    public static void main(String[] args) {
        int[][] A = { { 2, 3, 4 }, { 3, 4, 5 } };
        int[][] B = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        if (!isValidMatrix(A)) {
            printStr("A is invalid.");
            return;
        }

        if (!isValidMatrix(B)) {
            printStr("B is invalid.");
            return;
        }

        if (A[0].length != B.length) {
            printStr("A * B is invalid.");
            return;
        }

        ArrayList<ArrayList<Integer>> result = new ArrayList<>(A.length);
        for (int rowA = 0; rowA < A.length; rowA++) {
            result.add(new ArrayList<Integer>());
            for (int columnB = 0; columnB < B[0].length; columnB++) {
                int sum = 0;
                ArrayList<Integer> row = result.get(rowA);
                for (int columnA = 0; columnA < A[0].length; columnA++) {
                    sum += A[rowA][columnA] * B[columnA][columnB];
                }
                row.add(sum);
            }
        }

        System.out.println(result);

    }

    private static boolean isValidMatrix(int[][] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].length != arr[i].length) {
                return false;
            }
        }

        return true;
    }

    public static void printStr(String str) {
        System.out.println(str);
    }

}