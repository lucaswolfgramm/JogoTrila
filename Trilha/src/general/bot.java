package general;

import actions.BuildBoard;
import actions.GravarRemover;

public class bot extends BuildBoard {

	public void robotPlayer(int linhaJogada, int colunaJogada, String[][] matrix) {
		String jogador = "o";

		GravarRemover gravarRemover = new GravarRemover();

		for (int linha = 0; linha < matrix.length; linha++) {
			for (int coluna = 0; coluna < matrix[linha].length; coluna++) {

				linhaJogada = linha;

				colunaJogada = coluna;

				if (matrix[linhaJogada][colunaJogada].equals("0")) {
					matrix[linhaJogada][colunaJogada] = jogador;
					gravarRemover.gravaValorJogada(linhaJogada, colunaJogada, jogador);
					break;
				}
			}
		}
	}
}
