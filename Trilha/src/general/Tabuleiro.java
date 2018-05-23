package general;

import java.io.IOException;
import java.util.Arrays;

public class Tabuleiro {

	public void mostrarTabuleiro(String matrix[][]) {
		
//		try {
//			Runtime.getRuntime().exec("cls");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		System.out.println();
		System.out.println("______________________");
		for (int i = 0; i < matrix.length; i++) {
			String zero = "0";
			
			System.out.println("| " + Arrays.deepToString(matrix[i]));

		}
		System.out.println("______________________");
		System.out.println();
		System.out.println();
	}
}
