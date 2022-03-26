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
		HeapSort.comparacoes = comparacoes;
	}
	
	public static void heapSort(int[] A) {
		
		
		constroiHeapMax(A);
	}
	
	private static void constroiHeapMax(int[] A) {
		int tamanhoHeap=A.length;
		for(int i=(tamanhoHeap/2)-1;i>=0;i--) {
			refazHeapMax(A,i);
		}
	}
	
	private static void refazHeapMax(int[] A, int i) {
		int esquerda = (i*2+1);
		int direita = (i*2+2);
		int maior=i;
		int tamanho=A.length;
		if(esquerda< tamanho && A[esquerda]>A[maior]) {
			maior=esquerda;
			comparacoes++;
		}else if(direita<tamanho && A[direita]>A[maior]) {
			maior=direita;
			comparacoes++;
		}else if(maior!=i){
			trocar(A,i,maior);
			comparacoes++;
			refazHeapMax(A, maior);
		}
			
	}
	private static void trocar(int[] A,int i, int maior) {
		int troca=A[i];
		A[i]=A[maior];
		A[maior]=troca;
	}
	
}
