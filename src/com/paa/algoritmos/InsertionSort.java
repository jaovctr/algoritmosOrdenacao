package com.paa.algoritmos;


/**
 * @author jpedr
 * @version 1.0
 * @since 1.0
 * 
 */

public class InsertionSort {

    public static int comparacoes = 0;

    /*
     * Implementado como descrito na página 18 do livro do Cormen.
     */
    public static int[] insertionSort(int[] A){

        comparacoes = 0;

        for (int j = 2; j <= A.length; j++){
            int key = A[j];
            int i = j - 1;

            while(i > 0 && A[i] > key){
                comparacoes += 1;
                A[i + 1] = A[i];
                i = i - 1;
            }

            A[i + 1] = key;
        }

        return A;
    }
}
