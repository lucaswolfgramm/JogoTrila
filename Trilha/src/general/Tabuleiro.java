package general;

import java.util.Arrays;

public class Tabuleiro {

	public void mostrarTabuleiro(String matrix[][]) {
		
		System.out.println();
		System.out.println("_____________________");
		for (int i = 0; i < matrix.length; i++) {
			String zero = "0";
			if(i == 0) {
				System.out.print("|" + Arrays.deepToString(matrix[i][0]));
			}
			
			if (i == 3) {
				System.out.print("| " + Arrays.deepToString(matrix[i]));
			} else {
				System.out.println("|    " + Arrays.deepToString(matrix[i]));
			}
		}
		System.out.println("_____________________");
		System.out.println();
		System.out.println();
	}
}
