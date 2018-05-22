package general;

import actions.BuildBoard;
import actions.GravarRemover;
import verifications.BlockTrail;

public class bot extends BuildBoard {

	public void robotPlayer(int linhaJogada, int colunaJogada, String[][] matrix) {
		String jogador = "o";
		boolean entrou = false;
		boolean jogou = false;

		GravarRemover gravarRemover = new GravarRemover();
		Tabuleiro tabuleiro = new Tabuleiro();
		BlockTrail blockTrial = new BlockTrail();

		blockTrial.searchTrailForBlock(matrix, jogou);

		if (jogou == false) {
			for (int linha = 0; linha < matrix.length; linha++) {
				for (int coluna = 0; coluna < matrix[linha].length; coluna++) {

					linhaJogada = linha;
					colunaJogada = coluna;

					if (matrix[linhaJogada][colunaJogada].equals("0")) {
						matrix[linhaJogada][colunaJogada] = jogador;
						gravarRemover.gravaValorJogada(linhaJogada, colunaJogada, jogador);
						tabuleiro.mostrarTabuleiro(matrix);
						entrou = true;
						break;
					}
				}
				if (entrou == true) {
					break;
				}
			}
		}

	}
}
