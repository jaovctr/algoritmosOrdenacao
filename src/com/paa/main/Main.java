/**
 * 
 */
package com.paa.main;
import java.util.Random;


import com.paa.algoritmos.*;
/**
 * @author jaovctr
 * @version 1.3
 * @since 1.0
 */
public class Main {
	public static void main(String[] args) {
		
		int[] tamanhos = {100,1000,5000,30000,50000,100000,150000,200000};
		
		for(int i = 0; i<tamanhos.length;i++) {
			
			
			int[] crescente = listaCrescente(tamanhos[i]);
			int[] decrescente=listaDecrescente(tamanhos[i]);
			int[] aleatorio=listaAleatoria(tamanhos[i]);
			
			int[] bubbleCrescente = crescente.clone();
			int[] bubbleDecrescente = decrescente.clone();
			int[] bubbleAleatorio = aleatorio.clone();
			
			int[] insertionCrescente = crescente.clone();
			int[] insertionDecrescente = decrescente.clone();
			int[] insertionAleatorio = aleatorio.clone();
			
			int[] mergeCrescente= crescente.clone();
			int[] mergeDecrescente=decrescente.clone();
			int[] mergeAleatorio=aleatorio.clone();
			
			int[] heapCrescente= crescente.clone();
			int[] heapDecrescente=decrescente.clone();
			int[] heapAleatorio=aleatorio.clone();
			
			int[] quickCrescente = crescente.clone();
			int[] quickDecrescente = decrescente.clone();
			int[] quickAleatorio = aleatorio.clone();
						
			System.out.println("----------------\n");
			System.out.println("Testes com "+tamanhos[i]+" elementos\n");
			
			ordenandoBubble(bubbleCrescente, bubbleDecrescente, bubbleAleatorio);
			
			ordenandoIsertion(insertionCrescente, insertionDecrescente, insertionAleatorio);
			
			ordenandoMerge(mergeCrescente, mergeDecrescente, mergeAleatorio);
			
			ordenandoHeap(heapCrescente, heapDecrescente, heapAleatorio);
				
			ordenandoQuick(quickCrescente, quickDecrescente, quickAleatorio);
		}
		
		
		
	}

	public static void ordenandoBubble(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("BUBBLE SORT:");
		
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			BubbleSort.bubbleSort(crescenteBackup);
			long fim= System.currentTimeMillis();
			
			BubbleSort.getComparacoes();
			BubbleSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		 
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			System.out.println("Ordenando decrescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			BubbleSort.bubbleSort(decrescenteBackup);
			long fim= System.currentTimeMillis();
			
			BubbleSort.getComparacoes();
			BubbleSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1) +"º vez: ");

			long inicio=System.currentTimeMillis();
			BubbleSort.bubbleSort(aleatorioBackup);
			long fim=System.currentTimeMillis();

			BubbleSort.getComparacoes();
			BubbleSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
	}
	
	public static void ordenandoIsertion(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("INSERTION SORT:");
		
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			InsertionSort.insertionSort(crescenteBackup);
			long fim= System.currentTimeMillis();
			
			InsertionSort.getComparacoes();
			InsertionSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		 
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			System.out.println("Ordenando decrescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			InsertionSort.insertionSort(decrescenteBackup);
			long fim= System.currentTimeMillis();
			
			InsertionSort.getComparacoes();
			InsertionSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1) +"º vez: ");

			long inicio=System.currentTimeMillis();
			InsertionSort.insertionSort(aleatorioBackup);
			long fim=System.currentTimeMillis();

			InsertionSort.getComparacoes();
			InsertionSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
	}
	
	public static void ordenandoMerge(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("MERGE SORT:");
		
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			MergeSort.mergeSort(crescenteBackup, 0, crescenteBackup.length-1);
			long fim= System.currentTimeMillis();
			
			MergeSort.getComparacoes();
			MergeSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			System.out.println("Ordenando decrescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			MergeSort.mergeSort(decrescenteBackup, 0, decrescenteBackup.length-1);
			long fim= System.currentTimeMillis();
			
			MergeSort.getComparacoes();
			MergeSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1) +"º vez: ");

			long inicio=System.currentTimeMillis();
			MergeSort.mergeSort(aleatorioBackup, 0, aleatorioBackup.length-1);
			long fim=System.currentTimeMillis();

			MergeSort.getComparacoes();
			MergeSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
	}
	
	public static void ordenandoHeap(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("HEAP SORT");
		
		
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1) +"º vez: ");
			
			long inicio=System.currentTimeMillis();
			HeapSort.heapSort(crescenteBackup);
			long fim= System.currentTimeMillis();
			
			HeapSort.getComparacoes();
			HeapSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
			
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			
			System.out.println("Ordenando decrescente pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			HeapSort.heapSort(decrescenteBackup);
			long fim= System.currentTimeMillis();
			
			HeapSort.getComparacoes();
			HeapSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			HeapSort.heapSort(aleatorioBackup);
			long fim= System.currentTimeMillis();
			
			HeapSort.getComparacoes();
			HeapSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
	}
	
	public static void ordenandoQuick(int[] crescente, int[] decrescente, int[]aleatorio) {
		System.out.println("QUICK SORT");
		
		
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			QuickSort.quickSort(crescenteBackup, 0, crescenteBackup.length-1);
			long fim=System.currentTimeMillis();
			
			QuickSort.getComparacoes();
			QuickSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			System.out.println("Ordenando decrescente pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			QuickSort.quickSort(decrescenteBackup, 0, decrescenteBackup.length-1);
			long fim=System.currentTimeMillis();
			
			QuickSort.getComparacoes();
			QuickSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			QuickSort.quickSort(aleatorioBackup, 0, aleatorioBackup.length-1);
			long fim=System.currentTimeMillis();
			
			QuickSort.getComparacoes();
			QuickSort.setComparacoes(0);
			
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
		}
		System.out.println("\n---\n");
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
