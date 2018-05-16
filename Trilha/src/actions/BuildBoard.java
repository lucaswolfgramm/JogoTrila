package actions;

import java.util.Scanner;

import general.Tabuleiro;
import general.bot;
import verifications.InsertVerification;
import verifications.VerificarTrilha;

public class BuildBoard {

	String[][] matrix = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
			{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };
	private String[][] obtidoJogadorX = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
			{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };
	private String[][] obtidoJogadorO = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
			{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };

	int cont = 0;

	public void buildBoard() {

		Scanner ler = new Scanner(System.in);
		InsertVerification verifica = new InsertVerification();
		Tabuleiro tabuleiro = new Tabuleiro();
		GravarRemover gravarRemover = new GravarRemover();
		VerificarTrilha verificaTrilha = new VerificarTrilha();
		bot bot = new bot();

		tabuleiro.mostrarTabuleiro(matrix);

		for (int line = 0; line < 17; line++) {
			int linhaJogada;
			int colunaJogada;
			String jogador = "";

			jogador = verifica.buscarJogador(line, jogador);

			if (jogador == "o") {
				linhaJogada = 0;
				colunaJogada = 0;
				bot.robotPlayer(linhaJogada, colunaJogada, matrix);
			}

			if (jogador == "x") {
				do {
					System.out.println("Digite a Linha:");
					linhaJogada = ler.nextInt();
					linhaJogada = linhaJogada - 1;

					linhaJogada = verifica.valorLinha(linhaJogada);

					System.out.println("Digite a Coluna:");
					colunaJogada = ler.nextInt();
					colunaJogada = colunaJogada - 1;

					colunaJogada = verifica.valorColuna(colunaJogada);

					if (matrix[linhaJogada][colunaJogada] != "0") {
						System.out.println("Campo Indisponível, tente novamente !!!");
					}
				} while (!matrix[linhaJogada][colunaJogada].equals("0"));

				matrix[linhaJogada][colunaJogada] = jogador;
				gravarRemover.gravaValorJogada(linhaJogada, colunaJogada, jogador);
			}

			tabuleiro.mostrarTabuleiro(matrix);

			// tabuleiro.mostrarTabuleiroIndividualX(gravarRemover.getObtidoJogadorX());
			// tabuleiro.mostrarTabuleiroIndividualO(gravarRemover.getObtidoJogadorO());

			cont++;

			// if (cont >= 5) {
			// verificaTrilha.verificaTrilha(obtidoJogadorO, obtidoJogadorX, jogador,
			// matrix);
			// }
		}

	}

	public String[][] getObtidoJogadorX() {
		return obtidoJogadorX;
	}

	public void setObtidoJogadorX(String[][] obtidoJogadorX) {
		this.obtidoJogadorX = obtidoJogadorX;
	}

	public String[][] getObtidoJogadorO() {
		return obtidoJogadorO;
	}

	public void setObtidoJogadorO(String[][] obtidoJogadorO) {
		this.obtidoJogadorO = obtidoJogadorO;
	}
}
