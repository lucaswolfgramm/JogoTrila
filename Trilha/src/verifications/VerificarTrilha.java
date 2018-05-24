package verifications;

import actions.BuildBoard;
import actions.RemovePiece;

public class VerificarTrilha extends BuildBoard {

	String[][] esperadoTrilhaHorizontal = { { "0", "3", "6" }, { "1", "3", "5" }, { "2", "3", "4" },
											{ "0", "1", "2" }, { "4", "5", "6" } };
	/*String[][] esperadoTrilhaVertical = { { "0", "3", "6" }, { "2", "3", "5" }, { "2", "3", "4" },
			{ "0", "1", "2" }, { "4", "5", "6" }, { "9", "13", "18" }, { "6", "14", "21" }, { "3", "15", "24" } };
	*/
	public void verificaTrilha(String[][] obtidoJogadorO, String[][] obtidoJogadorX, String jogador,
			String[][] matrix) {
		String resultadoEsperado = "";
		String resultadoJogador = "";

		RemovePiece remove = new RemovePiece();
		// BuildBoard build = new BuildBoard();

		for (int linha = 0; linha < esperadoTrilhaHorizontal.length; linha++) {
			for (int coluna = 0; coluna < obtidoJogadorX.length; coluna++) {
				resultadoEsperado = resultadoEsperado + String.valueOf(esperadoTrilhaHorizontal[linha][coluna]);

				if (jogador == "x") {
					resultadoJogador = resultadoJogador + obtidoJogadorX[linha][coluna];
				} else {
					if (jogador == "o") {
						resultadoJogador = resultadoJogador + obtidoJogadorO[linha][coluna];
					} else {
						System.out.println("Jogador não encontrado !!!");
						break;
					}
				}
			}

			if (linha == 2) {
				if (resultadoEsperado == resultadoJogador) {
					remove.removePiece(jogador, matrix);
				}
			}

		}
	}
}
