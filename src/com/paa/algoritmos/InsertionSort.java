package com.paa.algoritmos;


/**
 * @author jpedr
 * @author jaovctr
 * @version 1.2
 * @since 1.0
 * 
 */

public class InsertionSort {

    public static long comparacoes = 0;
    
    /**
	 * @return the comparacoes
	 */
    public static long getComparacoes() {
		return comparacoes;
	}
	/**
	 * @param comparacoes the comparacoes to set
	 */
	public static void setComparacoes(int comparacoes) {
		BubbleSort.comparacoes = comparacoes;
	}
    
    
    /*
     * Implementado como descrito na página 18 do livro do Cormen.
     */
    public static void insertionSort(int[] A){

        comparacoes = 0;

        for (int j = 1; j < A.length; j++){
            int key = A[j];
            int i = j - 1;

            while(i >= 0 && A[i] > key){
                comparacoes += 1;
                A[i + 1] = A[i];
                i = i - 1;
            }

            A[i + 1] = key;
        }
      
    }
}
