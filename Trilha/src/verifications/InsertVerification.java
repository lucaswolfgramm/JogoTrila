package verifications;

import java.util.Scanner;

import actions.BuildBoard;

public class InsertVerification {

	int[][] linha0e6 = { { 1, 4, 7 } };
	int[][] linha2e6 = { { 2, 4, 6 } };
	int[][] linha3e5 = { { 3, 4, 5 } };
	int[][] linha6 = { { 1, 2, 3, 5, 6, 7 } };

	Scanner pegar = new Scanner(System.in);
	BuildBoard build = new BuildBoard();

	public String buscarJogador(int line, String jogador) {
		if (line % 2 == 0) {
			System.out.println("Peça Preta (x) :");
			jogador = "x";
		} else {
			// System.out.println("Peça Branca (o) :");
			jogador = "o";
		}
		return jogador;
	}

	public int valorLinha(int linhaJogada) {
		if (linhaJogada > 7) {
			do {
				System.out.println("Digite outra Linha:");
				linhaJogada = pegar.nextInt();
				linhaJogada = linhaJogada - 1;

				if (linhaJogada > 7) {
					System.out.println("Linha Inválida !!!");
				}

			} while (linhaJogada > 7);
		}
		return linhaJogada;
	}

	public int valorColuna(int colunaJogada, int linhaJogada) {
		boolean colunaOK = false;

		if (linhaJogada == 0 || linhaJogada == 6) {
			for (int i = 0; i < linha0e6.length; i++) {
				if (colunaJogada == linha0e6[0][i]) {
					colunaOK = true;
					break;
				}
			}
			if (colunaOK == false) {
				do {
					if (colunaJogada == linha0e6[0][0]) {
						System.out.println("Digite outra Coluna:");
						colunaJogada = pegar.nextInt();
						colunaJogada = colunaJogada - 1;
					}

				} while (colunaOK == false);
			}
		}

		/*if (colunaJogada > 2) {
			do {
				System.out.println("Digite outra Coluna:");
				colunaJogada = pegar.nextInt();
				colunaJogada = colunaJogada - 1;

				if (colunaJogada > 2) {
					System.out.println("Coluna Inválida !!!");
				}

			} while (colunaJogada > 2);
		}*/
		return colunaJogada;
	}

}
