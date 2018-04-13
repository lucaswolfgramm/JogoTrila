package general;

import java.util.Arrays;

public class Tabuleiro {

	public void mostrarTabuleiro(String matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			if (i == 3) {
				System.out.print(Arrays.deepToString(matrix[i]));
			} else {
				System.out.println("     " + Arrays.deepToString(matrix[i]));
			}
		}
	}
}
