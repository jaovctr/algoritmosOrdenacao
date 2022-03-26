/**
 * 
 */
package com.paa.main;
import java.util.Random;
import java.util.Scanner;

import com.paa.algoritmos.*;
/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * TODO CONTADOR DE TEMPO
 * bubblesort - j pedro
 * insertionsort - j pedro
 * teste com 100 1k 5k 30k 50k 100k 150k 200k
 * 
 */
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o tamanho das listas:");
		int tamanho=input.nextInt();
		int[] crescente = listaCrescente(tamanho);
		int[] decrescente=listaDecrescente(tamanho);
		int[] aleatorio=listaAleatoria(tamanho);
		//ordenandoMerge(crescente, decrescente, aleatorio);
	//	ordenandoHeap(crescente, decrescente, aleatorio);
		ordenandoQuick(crescente, decrescente, aleatorio);
		
		
	}


	public static void ordenandoMerge(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("MERGE SORT:");
		
		System.out.println("Ordenando crescente:");
		MergeSort.mergeSort(crescente, 0, crescente.length-1);
		MergeSort.getComparacoes();
		MergeSort.setComparacoes(0);
		
		System.out.println("Ordenando decrescente:");
		MergeSort.mergeSort(decrescente, 0, decrescente.length-1);
		MergeSort.getComparacoes();
		MergeSort.setComparacoes(0);
		
		System.out.println("Ordenando aleatorio:");
		MergeSort.mergeSort(aleatorio, 0, aleatorio.length-1);
		MergeSort.getComparacoes();
		MergeSort.setComparacoes(0);
		
	}
	
	public static void ordenandoHeap(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("HEAP SORT");
		
		System.out.println("Ordenando crescente:");
		HeapSort.heapSort(crescente);
		HeapSort.getComparacoes();
		HeapSort.setComparacoes(0);
		
		System.out.println("Ordenando decrescente:");
		HeapSort.heapSort(decrescente);
		HeapSort.getComparacoes();
		HeapSort.setComparacoes(0);
		
		System.out.println("Ordenando aleatorio:");
		HeapSort.heapSort(aleatorio);
		HeapSort.getComparacoes();
		HeapSort.setComparacoes(0);
		
		
	}
	
	public static void ordenandoQuick(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("QUICK SORT");
		
		System.out.println("Ordenando Crescente:");
		QuickSort.quickSort(crescente, 0, crescente.length-1);
		QuickSort.getComparacoes();
		QuickSort.setComparacoes(0);
		
		System.out.println("Ordenando Decrescente:");
		QuickSort.quickSort(decrescente, 0, decrescente.length-1);
		QuickSort.getComparacoes();
		QuickSort.setComparacoes(0);
		
		System.out.println("Ordenando Aleatorio:");
		QuickSort.quickSort(aleatorio, 0, aleatorio.length-1);
		QuickSort.getComparacoes();
		QuickSort.setComparacoes(0);
	}
	
	public static int[] listaCrescente(int tamanho) {		
		int[] lista=new int[tamanho];
		for (int i=0;i<tamanho;i++) {
			lista[i]=i+1;
		}
		return lista;
	}
	
	public static int[] listaDecrescente(int tamanho) {
		int[] lista = new int[tamanho];
		int valor=tamanho;
		for(int i =0;i<tamanho;i++) {
			lista[i]=valor;
			valor--;
		}
		return lista;
	}
	
	public static int[] listaAleatoria(int tamanho) {
		Random random = new Random();
		int[] lista = new int[tamanho];
		for (int i=0;i<tamanho;i++) {
			lista[i]= random.nextInt();
		}
		return lista;
	}
}
