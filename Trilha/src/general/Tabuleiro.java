package general;

import java.util.Arrays;

import PutParts.main;

public class Tabuleiro extends main {

	main main = new main();

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
