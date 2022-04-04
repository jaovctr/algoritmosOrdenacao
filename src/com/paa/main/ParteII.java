/**
 * 
 */
package com.paa.main;

import com.paa.algoritmos.AlgoritmoMisto;


/**
 * @author jaovctr
 * @version 1.0
 * @since 1.0
 * 
 */
public class ParteII extends ParteI{
	public static void main(String[] args) {
		int[] tamanhos = {100,1000,5000,30000,50000,100000,150000,200000};
		
		for(int i = 0; i<tamanhos.length;i++) {
			

			int[] crescente = listaCrescente(tamanhos[i]);
			int[] decrescente= listaDecrescente(tamanhos[i]);
			int[] aleatorio= listaAleatoria(tamanhos[i]);
			
			int[] insertionCrescente = crescente.clone();
			int[] insertionDecrescente = decrescente.clone();
			int[] insertionAleatorio = aleatorio.clone();

			int[] quickCrescente = crescente.clone();
			int[] quickDecrescente = decrescente.clone();
			int[] quickAleatorio = aleatorio.clone();
			
			int[] mistoCrescente = crescente.clone();
			int[] mistoDecrescente = decrescente.clone();
			int[] mistoAleatorio = aleatorio.clone();
			
			System.out.println("----------------\n");
			System.out.println("Testes com "+tamanhos[i]+" elementos\n");
			
			ordenandoIsertion(insertionCrescente, insertionDecrescente, insertionAleatorio);
				
			ordenandoQuick(quickCrescente, quickDecrescente, quickAleatorio);

			ordenandoMisto(mistoCrescente, mistoDecrescente, mistoAleatorio); 
		}
	}
	
	public static void ordenandoMisto(int[] crescente, int[] decrescente, int[]aleatorio) {
System.out.println("ALGORITMO MISTO");
		
		long tempos=0;
		long comparacoes=0;
		for(int i=0;i<3;i++) {
			int[] crescenteBackup=crescente.clone();
			System.out.println("Ordenando crescente pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			AlgoritmoMisto.algoritmoMisto(crescenteBackup, 0, crescenteBackup.length-1);
			long fim=System.currentTimeMillis();
			
			tempos=tempos+(fim-inicio);
			comparacoes=comparacoes+AlgoritmoMisto.getComparacoes();
			
			System.out.println("Comparacoes: " + AlgoritmoMisto.getComparacoes());
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
			
			AlgoritmoMisto.setComparacoes(0);
		}
		System.out.println("Media de comparacoes: "+(comparacoes/3.0));
		System.out.println("Media de tempo: "+(tempos/3.0));
		System.out.println("\n---\n");
		 
		comparacoes=0;
		tempos=0;
		
		
		for(int i=0;i<3;i++) {
			int[] decrescenteBackup=decrescente.clone();
			System.out.println("Ordenando decrescente pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			AlgoritmoMisto.algoritmoMisto(decrescenteBackup, 0, decrescenteBackup.length-1);
			long fim=System.currentTimeMillis();
			
			tempos=tempos+(fim-inicio);
			comparacoes=comparacoes+AlgoritmoMisto.getComparacoes();
			
			System.out.println("Comparacoes: " + AlgoritmoMisto.getComparacoes());
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
			
			AlgoritmoMisto.setComparacoes(0);
		}
		System.out.println("Media de comparacoes: "+(comparacoes/3.0));
		System.out.println("Media de tempo: "+(tempos/3.0));
		System.out.println("\n---\n");
		 
		comparacoes=0;
		tempos=0;
		
		
		for(int i=0;i<3;i++) {
			int[] aleatorioBackup=aleatorio.clone();
			System.out.println("Ordenando aleatorio pela "+ (i+1)+ "º vez:");
			
			long inicio=System.currentTimeMillis();
			AlgoritmoMisto.algoritmoMisto(aleatorioBackup, 0, aleatorioBackup.length-1);
			long fim=System.currentTimeMillis();
			
			tempos=tempos+(fim-inicio);
			comparacoes=comparacoes+AlgoritmoMisto.getComparacoes();
			
			System.out.println("Comparacoes: " + AlgoritmoMisto.getComparacoes());
			System.out.println("Tempo da execucao "+ (i+1) +": " + (fim-inicio));
			
			AlgoritmoMisto.setComparacoes(0);
		}
		System.out.println("Media de comparacoes: "+(comparacoes/3.0));
		System.out.println("Media de tempo: "+(tempos/3.0));
		System.out.println("\n---\n");
		 
		comparacoes=0;
		tempos=0;
	}
}
