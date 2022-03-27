/**
 * 
 */
package com.paa.algoritmos;

/**
 * @author jpedr
 * @author jaovctr
 * @version 1.2
 * @since 1.0
 * 
 */
public class BubbleSort {

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
    
    public static int[] bubbleSort(int[] A){

        comparacoes = 0;

        int arr_size = A.length;

        for (int i = 0; i < arr_size - 1; i++){
            for(int j = 0; j < arr_size-i-1; j++){

                if(A[j] > A[j+1]){
                    comparacoes += 1;
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }

        return A; 
    }
}
