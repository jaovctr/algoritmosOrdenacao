/**
 * 
 */
package com.paa.algoritmos;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 */
public class AlgoritmoMisto {
	private static long comparacoes=0;
	
	public static long getComparacoes() {
		return comparacoes;
	}
	/**
	 * @param comparacoes the comparacoes to set
	 */
	public static void setComparacoes(int comparacoes) {
		AlgoritmoMisto.comparacoes = comparacoes;
	}
	
	
	public static void algoritmoMisto (int[] A, int i, int j) {
		if(A.length<1000) {
			InsertionSort.insertionSort(A);
			comparacoes=InsertionSort.getComparacoes();
			InsertionSort.setComparacoes(0);
		}else {
			if(checaOrdenacao(A)) {
				InsertionSort.insertionSort(A);
				comparacoes=InsertionSort.getComparacoes();
				InsertionSort.setComparacoes(0);
			}else {
				QuickSort.quickSort(A, i, j);
				comparacoes=QuickSort.getComparacoes();
				QuickSort.setComparacoes(0);
			}
		}
	}
	
	private static boolean checaOrdenacao(int[] A) {	
		int controle=A[0];
		for (int i=1;i<A.length;i++) {
			if(controle>A[i]) {
				return false;
			}
			controle=A[i];
		}
		return true;
	}
}
