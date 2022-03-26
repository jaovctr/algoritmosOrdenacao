/**
 * 
 */
package com.paa.algoritmos;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * TODO CORRIGIR BUGS
 */
public class QuickSort {
	private static int comparacoes=0;
	
	/**
	 * @return the comparacoes
	 */
	public static void getComparacoes() {
		System.out.println("Comparações: "+ comparacoes);
	}
	/**
	 * @param comparacoes the comparacoes to set
	 */
	public static void setComparacoes(int comparacoes) {
		QuickSort.comparacoes = comparacoes;
	}
	
	
	public static void quickSort(int[] A, int p, int r) {
		if(p<r) {
			int q=Partition(A,p,r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	
	private static int Partition(int[] A, int p, int r) {
		int x=A[r];
		int i=p-1;
		
		for(int j=p; j<=(r-1);j++) {
			if(A[j]<x) {
				i++;
				trocar(A,i,j);
				comparacoes++;
			}			
		}
		trocar(A,i+1,r);
		return (i+1);
	}
	private static void trocar(int[] A, int i, int j) {
		int troca=A[i];
		A[i]=A[j];
		A[j]=troca;
	}
}
