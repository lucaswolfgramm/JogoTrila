package general;

import java.util.Scanner;
import PutParts.BuildBoard;

public class Verificador {

	Scanner pegar = new Scanner(System.in);
	BuildBoard build = new BuildBoard();

	public String buscarJogador(int line, String jogador) {
		if (line % 2 == 0) {
			System.out.println("Peça Preta (x) :");
			jogador = "x";
		} else {
			System.out.println("Peça Branca (o) :");
			jogador = "o";
		}
		return jogador;
	}

	public int valorLinha(int linhaJogada) {
		if (linhaJogada > 7) {
			do {
				System.out.println("Digite outra Linha:");
				linhaJogada = pegar.nextInt();

				if (linhaJogada > 7) {
					System.out.println("Linha Inválida !!!");
				}

			} while (linhaJogada > 7);
		}
		return linhaJogada;
	}

	public int valorColuna(int colunaJogada) {
		if (colunaJogada > 2) {
			do {
				System.out.println("Digite outra Coluna:");
				colunaJogada = pegar.nextInt();

				if (colunaJogada > 2) {
					System.out.println("Coluna Inválida !!!");
				}

			} while (colunaJogada > 2);
		}
		return colunaJogada;
	}

	public void verificaTrilha() {
		
		
		/*
		 * 
		 * 1 				,2 					 ,3 
		 * 		4, 			 5,			  6 
		 *			 7, 	 8 		,9 
		 * 10, 11,  12, 			13,   14,    15 
		 * 			16, 	17, 	18 
		 * 	   19, 			20, 		  21 
		 * 22, 				23, 				 24
		 * 
		 * 
		 * 1,2,3 
		 * 4,5,6 
		 * 7,8,9 
		 * 10,11,12 
		 * 13,14,15 
		 * 16,17,18 
		 * 19,20,21 
		 * 22,23,24
		 * 
		 * 1,10,22 
		 * 4,11,19 
		 * 7,12,16 
		 * 2,5,8 
		 * 17,20,23 
		 * 9,13,18 
		 * 6,14,21 
		 * 3,15,24
		 */
	}
}
