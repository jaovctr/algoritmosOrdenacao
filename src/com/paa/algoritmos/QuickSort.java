/**
 * 
 */
package com.paa.algoritmos;

/**
 * @author jaovctr
 * @version 1.2
 * @since 1.0
 */
public class QuickSort {
	private static long comparacoes=0;
	
	/**
	 * @return the comparacoes
	 */
	public static void getComparacoes() {
		System.out.println("Comparacoes: "+ comparacoes);
	}
	/**
	 * @param comparacoes the comparacoes to set
	 */
	public static void setComparacoes(int comparacoes) {
		QuickSort.comparacoes = comparacoes;
	}
	
	
	private static void trocar(int[] A, int i, int j) {
		int troca=A[i];
		A[i]=A[j];
		A[j]=troca;
	}
	
	public static void quickSort(int[] A, int p, int u) {
		int i=p; 
		int j=u;
		int x= A[(p+u)/2];
		while(i<=j) {
			while (A[i]<x) {
				i++;
				comparacoes++;
			}
			while (A[j]>x) {
				j--;
				comparacoes++;
			}
			if(i<=j) {
				trocar(A, i, j);
				i++;
				j--;
				comparacoes++;
			}
		}
		if(p<j) {
			quickSort(A, p, j);
		}
		if(u>i) {
			quickSort(A, i, u);
		}
	}
}
