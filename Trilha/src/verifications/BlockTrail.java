package verifications;

public class BlockTrail {

	public void searchTrailForBlock(String[][] matrix, boolean jogou) {

		// Conjuntos de linhas/colunas possíveis para obter trilha
		/*int[][] TrialVertical = { { 1, 1 }, { 4, 1 }, { 7, 1 },
								  { 2, 2 }, { 4, 2 }, { 6, 2 },
								  { 3, 3 }, { 4, 3 }, { 5, 3 },
								  { 1, 4 }, { 2, 4 }, { 3, 4 },
								  { 5, 4 }, { 6, 4 }, { 7, 4 }, 
								  { 3, 5 }, { 4, 5 }, { 5, 5 }, 
								  { 2, 6 }, { 4, 6 }, { 5, 6 },
								  { 1, 7 }, { 4, 7 }, { 7, 7 } }; */

		int countTrialForLine = 0;
		int countAllTrial = 0;
		int countLine = 0;
		int fieldLine = 0;
		int fieldColumn = 0;
		int countPoint = 0;

		// procura na horizontal
		for (int line = 0; line < matrix.length; line++) {
			for (int column = 0; column < matrix[line].length; column++) {
				if (matrix[line][column].equals("x")) {
					countTrialForLine++;
				}

				if (!matrix[line][column].equals(" ")) {
					countPoint++;
					if (countAllTrial == 0 & matrix[line][column].equals("0")) {
						fieldLine = line;
						fieldColumn = column;
					}
	
					if (countPoint == 2) {
						if (countTrialForLine == 2) {
							countAllTrial++;
						}
					}
				}
			}
			countTrialForLine = 0;
		}

		// procura vertical
		/*
		for (int i = 0; i < 23; i++) {

			int line = TrialVertical[i][i]-1;
			int column = TrialVertical[i][1]-1;			

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
		}*/

		if (countAllTrial != 0) {
			matrix[fieldLine][fieldColumn] = "o";
			jogou = true;
		} 
	}
}
