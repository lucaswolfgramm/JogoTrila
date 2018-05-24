package verifications;

import java.util.Scanner;

import actions.BuildBoard;

public class InsertVerification {

	int[][] linha0e6 = { { 0, 3, 6 } };
	int[][] linha1e5 = { { 1, 3, 5 } };
	int[][] linha2e4 = { { 2, 3, 4 } };
	int[][] linha3 = { { 0, 1, 2, 4, 5, 6 } };

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
		if (linhaJogada > 6) {
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
					if (colunaJogada == linha0e6[linhaJogada][colunaJogada]) {
						System.out.println("Digite outra Coluna:");
						colunaJogada = pegar.nextInt();
						colunaJogada = colunaJogada - 1;
					}

				} while (colunaOK == false);
			}
		}
		
		if (linhaJogada == 1 || linhaJogada == 5) {
			for (int i = 0; i < linha1e5.length; i++) {
				if (colunaJogada == linha1e5[0][i]) {
					colunaOK = true;
					break;
				}
			}
			if (colunaOK == false) {
				do {
					if (colunaJogada == linha1e5[0][0]) {
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
