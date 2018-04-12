package PutParts;
import java.util.Arrays;
import java.util.Scanner;

import general.verificador;

public class main {

	public static void main(String[] args) {

		Scanner jogada = new Scanner(System.in);
		verificador verifica = new verificador();

		String[][] matrix = { { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" },
				{ "0", "0", "0" }, { "0", "0", "0" }, { "0", "0", "0" } };

		System.out.println(Arrays.deepToString(matrix));

		for (int line = 0; line < 17; line++) {
			int linhaJogada;
			int colunaJogada;
			String jogador = "";

			if (line % 2 == 0) {
				System.out.println("Peça Preta (x) :");
				jogador = "x";
			} else {
				System.out.println("Peça Branca (o) :");
				jogador = "o";
			}

			do {
				System.out.println("Digite a Linha:");
				linhaJogada = jogada.nextInt();
				linhaJogada = linhaJogada - 1;
				
				verifica.valorLinha(linhaJogada);

				System.out.println("Digite a Coluna:");
				colunaJogada = jogada.nextInt();
				colunaJogada = colunaJogada - 1;
				
				verifica.valorColuna(colunaJogada);
				
				if(matrix[linhaJogada][colunaJogada] != "0"){
					System.out.println("Campo Indisponível, tente novamente !!!");
				}
			} while (matrix[linhaJogada][colunaJogada] != "0");

			matrix[linhaJogada][colunaJogada] = jogador;
			System.out.println(Arrays.deepToString(matrix));
		}
	}
}
