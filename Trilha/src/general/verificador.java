package general;
import java.util.Scanner;

import PutParts.main;

public class verificador extends main {

	Scanner jogada = new Scanner(System.in);

	main pai;

	public void valorLinha(int linhaJogada) {
		if (linhaJogada > 7) {
			do {
				System.out.println("Digite outra Linha:");
				linhaJogada = jogada.nextInt();
				
				if(linhaJogada > 7){
					System.out.println("Linha Inválida !!!");
				}
				
			} while (linhaJogada > 7);
		}
	}

	public void valorColuna(int colunaJogada) {
		if (colunaJogada > 2) {
			do {
				System.out.println("Digite outra Coluna:");
				colunaJogada = jogada.nextInt();
				
				if(colunaJogada > 2){
					System.out.println("Coluna Inválida !!!");
				}
				
			} while (colunaJogada > 2);
		}
	}

	public void verificaTrilha (){
		/*
		 
		 1				,2				,3
		 	  4,		 5,		  6
		 	        7,   8   ,9
		 10, 11,   12,  	 13,  14,   15
		 	 	   16,  17   18
		 	 19, 		20,	 	  21
		 22,		    23			   ,24
		 
		 
		 1,2,3
		 4,5,6
		 7,8,9
		 10,11,12
		 13,14,15
		 16,17,18
		 19,20,21
		 22,23,24
		 
		 1,10,22
		 4,11,19
		 7,12,16
		 2,5,8
		 17,20,23
		 9,13,18
		 6,14,21
		 3,15,24
		 
		 */
		
	}
	
	// public void campoJogado (int linhaJogada, int colunaJogada){
	// do {
	// } while(pai.matrix[linhaJogada][colunaJogada] != "0");
	// }
}
