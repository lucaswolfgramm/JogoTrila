package general;

import PutParts.BuildBoard;

public class VerificaTrilha {

	BuildBoard build = new BuildBoard();

	public void verificaTrilha(String matrix[][], int linhaJogada, int colunaJogada, String jogador) {

		int columnCount = matrix[0].length;
		int lineCount = matrix.length;

		int[][] esperadoTrilhaHorizontal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 },
				{ 16, 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 } };
		int[][] esperadoTrilhaVertical = { { 1, 10, 22 }, { 4, 11, 19 }, { 7, 12, 16 }, { 2, 5, 8 }, { 17, 20, 23 },
				{ 9, 13, 18 }, { 6, 14, 21 }, { 3, 15, 24 } };
		String[][] obtidoJogadorX = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
			{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };
		String[][] obtidoJogadorO = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
				{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };
		
		if (jogador == "x") {
			for (int line = 0; line < lineCount; line++) {
				for (int column = 0; column < columnCount; column++) {
					if (matrix[line][column] == jogador) {
						if(line == 1) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "1";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "2";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "3";
							}
						}
						if(line == 2) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "4";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "5";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "6";
							}
						}
						if(line == 3) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "7";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "8";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "9";
							}
						}
						if(line == 4) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "10";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "11";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "12";
							}
						}
						if(line == 5) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "13";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "14";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "15";
							}
						}
						if(line == 6) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "16";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "17";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "18";
							}
						}
						if(line == 7) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "19";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "20";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "21";
							}
						}
						if(line == 8) {
							if(column == 0) {
								obtidoJogadorX[line][column] = "22";
							}
							if(column == 1) {
								obtidoJogadorX[line][column] = "22";
							}
							if(column == 2) {
								obtidoJogadorX[line][column] = "23";
							}
						}
					}
				}
			}
		}

	}

	public static String gameOver(String[][] matrix) {
		int columnCount = matrix[0].length;
		int lineCount = matrix.length;

		for (int line = 0; line < lineCount; line++) {
			if (matrix[line][0] != null && matrix[line][1] != null && matrix[line][2] != null) {
				if (matrix[line][0] == matrix[line][1] && matrix[line][1] == matrix[line][2])
					;
				String ganhador = matrix[line][0];
				return ganhador;
			}
		}
		for (int column = 0; column < lineCount; column++) {
			if (matrix[0][column] != null && matrix[1][column] != null && matrix[2][column] != null) {
				if (matrix[0][column] == matrix[1][column] && matrix[1][column] == matrix[2][column])
					;
				String ganhador = matrix[0][column];
				return ganhador;
			}
		}

		if (matrix[0][0] != null && matrix[1][1] != null && matrix[2][2] != null) {
			if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2])
				;
			String ganhador = matrix[0][0];
			return ganhador;
		}

		if (matrix[0][2] != null && matrix[1][1] != null && matrix[2][0] != null) {
			if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])
				;
			String ganhador = matrix[0][2];
			return ganhador;
		}
		return "F";
	}
}
