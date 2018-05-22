package verifications;

public class BlockTrail {

	public void searchTrailForBlock(String[][] matrix, boolean jogou) {

		// Conjuntos de linhas/colunas possíveis para obter trilha
		int[][] TrialVertical = { { 1, 1 }, { 4, 1 }, { 8, 1 },
								  { 2, 1 }, { 4, 2 }, { 7, 1 },
								  { 3, 1 }, { 4, 2 }, { 6, 1 },
								  { 1, 2 }, { 2, 2 }, { 3, 2 },
								  { 6, 2 }, { 7, 2 }, { 8, 2 }, 
								  { 3, 3 }, { 5, 1 }, { 6, 3 }, 
								  { 2, 3 }, { 5, 2 }, { 7, 3 },
								  { 1, 3 }, { 5, 3 }, { 8, 3 } };

		int countTrialForLine = 0;
		int countAllTrial = 0;
		int countLine = 0;
		int fieldLine = 0;
		int fieldColumn = 0;

		// procura na horizontal
		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				if (matrix[line][column] == "x") {
					countTrialForLine++;
				}

				if (countAllTrial == 0 & matrix[line][column].equals("0")) {
					fieldLine = line;
					fieldColumn = column;
				}

				if (column == 2) {
					if (countTrialForLine == 2) {
						countAllTrial++;
					}
				}
			}
			countTrialForLine = 0;
		}

		// procura vertical
		for (int i = 0; i < 23; i++) {

			int line = TrialVertical[i][i];
			int column = TrialVertical[i][1];			

			if (matrix[line][column].equals("x")) {
				countTrialForLine++;
			}
			if (countAllTrial == 0 & matrix[line][column].equals("0")) {
				fieldLine = line;
				fieldColumn = column;
			}
			countLine++;

			// verifica se esta no ultimo conjunto de linha/coluna
			if (column == 2) {
				if (countTrialForLine == 2) {
					countAllTrial++;
				}
			}

			countTrialForLine = 0;
			countLine++;
		}

		if (countAllTrial != 0) {
			matrix[fieldLine][fieldColumn] = "o";
			jogou = true;
		}
	}
}
