package PutParts;

import java.util.Scanner;
import general.Tabuleiro;
import general.Verificador;

public class BuildBoard {

	String[][] matrix = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
			{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };

	public void buildBoard() {

		Scanner pegar = new Scanner(System.in);
		Verificador verifica = new Verificador();
		Tabuleiro tabuleiro = new Tabuleiro();

		tabuleiro.mostrarTabuleiro(matrix);

		for (int line = 0; line < 17; line++) {
			int linhaJogada;
			int colunaJogada;
			String jogador = "";

			jogador = verifica.buscarJogador(line, jogador);

			do {
				System.out.println("Digite a Linha:");
				linhaJogada = pegar.nextInt();
				linhaJogada = linhaJogada - 1;

				linhaJogada = verifica.valorLinha(linhaJogada);

				System.out.println("Digite a Coluna:");
				colunaJogada = pegar.nextInt();
				colunaJogada = colunaJogada - 1;

				colunaJogada = verifica.valorColuna(colunaJogada);

				if (matrix[linhaJogada][colunaJogada] != "0") {
					System.out.println("Campo Indisponível, tente novamente !!!");
				}
			} while (matrix[linhaJogada][colunaJogada] != "0");

			matrix[linhaJogada][colunaJogada] = jogador;

			tabuleiro.mostrarTabuleiro(matrix);
			
		}
	}
}
