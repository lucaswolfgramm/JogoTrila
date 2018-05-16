package actions;

import java.util.Scanner;

import verifications.RemoveVerification;

public class RemovePiece {

	public void removePiece(String jogador, String[][] matrix) {

		Scanner ler = new Scanner(System.in);
		RemoveVerification removeVerification = new RemoveVerification();

		int linhaJogada;
		int colunaJogada;

		do {
			System.out.println("Digite a Linha:");
			linhaJogada = ler.nextInt();
			linhaJogada = linhaJogada - 1;

			linhaJogada = removeVerification.valorLinha(linhaJogada);

			System.out.println("Digite a Coluna:");
			colunaJogada = ler.nextInt();
			colunaJogada = colunaJogada - 1;

			colunaJogada = removeVerification.valorColuna(colunaJogada);

			if (matrix[linhaJogada][colunaJogada] != "0" && matrix[linhaJogada][colunaJogada] != jogador) {

			} else {
				System.out.println("Campo Indisponível, tente novamente !!!");
			}
			
		} while (matrix[linhaJogada][colunaJogada] == "0" && matrix[linhaJogada][colunaJogada] == jogador);
	}
}
