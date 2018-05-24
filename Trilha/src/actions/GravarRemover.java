package actions;

import general.Tabuleiro;

public class GravarRemover {

	BuildBoard build = new BuildBoard();
	Tabuleiro tabuleiro = new Tabuleiro();

	public void gravaValorJogada(int linhaJogada, int colunaJogada, String jogador) {

		if (jogador == "x") {
			if (linhaJogada == 0 || linhaJogada == 6) {
				if (colunaJogada == 0) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "0";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "0";
					}
				}
				if (colunaJogada == 3) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "3";
					}
				}
				if (colunaJogada == 6) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "6";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "6";
					}
				}
			}
			if (linhaJogada == 1 || linhaJogada == 5) {
				if (colunaJogada == 1) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "1";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "1";
					}
				}
				if (colunaJogada == 3) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "3";
					}
				}
				if (colunaJogada == 5) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "5";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "5";
					}
				}
			}
			if (linhaJogada == 2 || linhaJogada == 4) {
				if (colunaJogada == 2) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "2";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "2";
					}
				}
				if (colunaJogada == 3) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "3";
					}
				}
				if (colunaJogada == 4) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "4";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "4";
					}
				}
			}
			if (linhaJogada == 3) {
				if (colunaJogada == 0) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "0";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "0";
					}
				}
				if (colunaJogada == 1) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "1";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "1";
					}
				}
				if (colunaJogada == 2) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "2";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "2";
					}
				}
				if (colunaJogada == 4) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "3";
					}
				}
				if (colunaJogada == 5) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "5";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "5";
					}
				}
				if (colunaJogada == 6) {
					if (jogador == "x") {
						build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "6";
					} else {
						build.getObtidoJogadorO()[linhaJogada][colunaJogada] = "6";
					}
				}
			}
		}
		/*
		if (jogador == "o") {
			if (linhaJogada == 0 || linhaJogada == 6) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "0";
				}
				if (colunaJogada == 3) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
				}
				if (colunaJogada == 6) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "6";
				}
			}
			if (linhaJogada == 1 || linhaJogada == 5) {
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "1";
				}
				if (colunaJogada == 3) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
				}
				if (colunaJogada == 5) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "5";
				}
			}
			if (linhaJogada == 2 || linhaJogada == 4) {
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "2";
				}
				if (colunaJogada == 3) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "3";
				}
				if (colunaJogada == 4) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "4";
				}
			}
			if (linhaJogada == 3) {
				if (colunaJogada == 0) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "0";
				}
				if (colunaJogada == 1) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "1";
				}
				if (colunaJogada == 2) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "2";
				}
				if (colunaJogada == 4) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "4";
				}
				if (colunaJogada == 5) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "5";
				}
				if (colunaJogada == 6) {
					build.getObtidoJogadorX()[linhaJogada][colunaJogada] = "6";
				}
			}
		}*/
	}

}
