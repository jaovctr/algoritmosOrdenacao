/**
 * 
 */
package com.paa.algoritmos;



/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * Algoritmo Merge Sort
 * TODO comparações
 */
public class MergeSort {
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
		MergeSort.comparacoes = comparacoes;
	}
	
	public static void mergeSort(int[] A,int p,int u){		
		if(p<u) {
			int q=(p+u)/2;
			mergeSort(A, p, q);
			mergeSort(A,q+1,u);
			comparacoes= comparacoes + merge(A,p,q,u);
		}
		
	}
	public static int merge(int[] A,int p, int q, int u) {
		int n1=q-p+1;
		int n2=u-q;
		int comparacoes=0;
		int esquerda[] =new int[n1];
		int direita[] = new int[n2];
		
		for (int i = 0; i < n1; i++) {
			esquerda[i]=A[p+i];
		}
		for(int j=0;j<n2;j++) {
			direita[j]=A[q+j+1];
		}
		    
		int i=0,j=0;		
		for(int k=p;k<u+1;k++) {
			if(i<n1 && j<n2) {
				
				if(esquerda[i]<direita[j]) {
					A[k]=esquerda[i];
					comparacoes++;
					i++;
				}else {
					A[k]=direita[j];
					comparacoes++;
					j++;
				}
			}else if(i<n1){
				A[k]=esquerda[i];
				i++;
			}else if(j<n2){
				A[k]=direita[j];
				j++;
			}
		}
		return comparacoes;
	}
}
