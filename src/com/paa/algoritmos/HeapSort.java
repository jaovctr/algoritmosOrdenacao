/**
 * 
 */
package com.paa.algoritmos;

/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * TODO CONTADOR
 */
public class HeapSort {
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
		HeapSort.comparacoes = comparacoes;
	}
	
	public static void heapSort(int[] A) {
		
		constroiHeapMax(A);
	}
	
	private static void constroiHeapMax(int[] A) {
		int tamanhoHeap=A.length;
		for(int i=((tamanhoHeap+1)/2)-1;i>=0;i--) {
			refazHeapMax(A,i, tamanhoHeap);
		}
		for(int i=tamanhoHeap-1;i>0;i--) {
			trocar(A, 0, i);
			refazHeapMax(A, 0, i);
		}
		
	}
	
	private static void refazHeapMax(int[] A, int i, int tamanhoHeap) {
		int esquerda = (2*i);
		int direita = (2*i)+1;
		int maior=i;
		
		if(esquerda < tamanhoHeap && A[esquerda]>A[maior]) {
			maior=esquerda;
			comparacoes++;
		}
		if(direita<tamanhoHeap && A[direita]>A[maior]) {
			maior=direita;
			comparacoes++;
		}
		if(maior!=i){
			trocar(A,i,maior);
			comparacoes++;
			refazHeapMax(A, maior, tamanhoHeap);
		}
			
	}
	private static void trocar(int[] A,int i, int maior) {
		int troca=A[i];
		A[i]=A[maior];
		A[maior]=troca;
	}
	
}
