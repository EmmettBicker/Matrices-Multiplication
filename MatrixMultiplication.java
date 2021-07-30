package com.company;
import java.util.Arrays;


public class MatrixMultiplication {

    public static void main(String[] args){
        int[][] A = {{1992, 1969}, {1921, 200324}, {2124, 2374121}, {700, 221}, {0, 0}, {7211, 392}};
        int[][] B = {{1, 23, 32}, {10, 6, 0}};

        System.out.println(Arrays.deepToString(MatricesMultiplication(A,B)));

    }
    static int[][] MatricesMultiplication(int[][] A, int[][] B)
    {
        int tempint = 0;
        try {
            int[][] C = new int[A.length][B[0].length];
            // Multiply the 0,0 of B by the 0,0 of A
            // Multiply the 1,0 of B by the 0,1 of A
            // Add them together and print that out
            // Multiply the 0,0 of B by the 1,0 of A
            // Multiply the 1,0 of B by the 1,1 of A
            for (int k = 0; k < B[0].length; k++) {
                for (int j = 0; j < A.length; j++) {
                    for (int l = 0; l < A[0].length; l++) {
                        tempint = 0;
                        for (int i = 0; i < B.length; i++) {


                            tempint = tempint + (B[i][k] * A[j][i]);
                        }

                    }
                    C[j][k] = tempint;
                }
            }
            return C;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            int[][] TheresAGlitchInTheMatrix = {{0}};
            System.out.println("Theres probably an issue with your matrices' dimensions! Make sure that matrix 1's column count lines up with matrix 2's row count!:D");
            return TheresAGlitchInTheMatrix;
        }
    }
}

