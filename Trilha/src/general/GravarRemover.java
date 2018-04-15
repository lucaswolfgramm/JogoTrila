package general;

import PutParts.BuildBoard;

public class GravarRemover {

	BuildBoard build = new BuildBoard();
	Tabuleiro tabuleiro = new Tabuleiro();

	public void gravaValorJogada(int linhaJogada, int colunaJogada, String jogador) {

		if (jogador == "x") {
			if (linhaJogada == 0) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "1";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "2";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
				}
			}
			if (linhaJogada == 1) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "4";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "5";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "6";
				}
			}
			if (linhaJogada == 2) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "7";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "8";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "9";
				}
			}
			if (linhaJogada == 3) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "10";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "11";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "12";
				}
			}
			if (linhaJogada == 4) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "13";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "14";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "15";
				}
			}
			if (linhaJogada == 5) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "16";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "17";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "18";
				}
			}
			if (linhaJogada == 6) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "19";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "20";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "21";
				}
			}
			if (linhaJogada == 7) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "22";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "22";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "23";
				}
			}
		}

		if (jogador == "o") {
			if (linhaJogada == 0) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "1";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "2";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "3";
				}
			}
			if (linhaJogada == 1) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "4";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "5";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "6";
				}
			}
			if (linhaJogada == 2) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "7";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "8";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "9";
				}
			}
			if (linhaJogada == 3) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "10";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "11";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "12";
				}
			}
			if (linhaJogada == 4) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "13";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "14";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "15";
				}
			}
			if (linhaJogada == 5) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "16";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "17";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "18";
				}
			}
			if (linhaJogada == 6) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "19";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "20";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "21";
				}
			}
			if (linhaJogada == 7) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "22";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "22";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "23";
				}
			}
		}
	}

}
