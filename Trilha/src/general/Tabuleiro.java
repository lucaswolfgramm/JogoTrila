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
		System.out.println("_____________________");
		for (int i = 0; i < matrix.length; i++) {
			String zero = "0";
//			if(i == 0) {
//				System.out.print("|" + Arrays.deepToString(matrix[i]1
//						1));
//			}
			
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
