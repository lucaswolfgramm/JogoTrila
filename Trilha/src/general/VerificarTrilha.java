package general;

public class VerificarTrilha {

	int[][] esperadoTrilhaHorizontal = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 }, { 13, 14, 15 },
			{ 16, 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 } };
	int[][] esperadoTrilhaVertical = { { 1, 10, 22 }, { 4, 11, 19 }, { 7, 12, 16 }, { 2, 5, 8 }, { 17, 20, 23 },
			{ 9, 13, 18 }, { 6, 14, 21 }, { 3, 15, 24 } };

	public void verificaTrilha(String[][] obtidoJogadorO, String[][] obtidoJogadorX){
		for (int linha = 0; linha < esperadoTrilhaHorizontal.length; linha++) {
			assert.assertEquals(esperadoTrilhaHorizontal[linha], obtidoJogadorO[]);
		}
	}
}
