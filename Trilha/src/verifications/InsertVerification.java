package verifications;

import java.util.Scanner;

import actions.BuildBoard;

public class InsertVerification {

	Scanner pegar = new Scanner(System.in);
	BuildBoard build = new BuildBoard();

	public String buscarJogador(int line, String jogador) {
		if (line % 2 == 0) {
			System.out.println("Pe�a Preta (x) :");
			jogador = "x";
		} else {
			//System.out.println("Pe�a Branca (o) :");
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
					System.out.println("Linha Inv�lida !!!");
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
					System.out.println("Coluna Inv�lida !!!");
				}

			} while (colunaJogada > 2);
		}
		return colunaJogada;
	}

}
