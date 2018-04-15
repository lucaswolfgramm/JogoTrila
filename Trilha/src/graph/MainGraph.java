package graph;

import graph.Vertex;

public class MainGraph {

	public static void main(String[] args) {
		Graph<Integer> graphHorizontal = new Graph<>();
		Vertex<Integer> um = graphHorizontal.addVertex(1);
		Vertex<Integer> dois = graphHorizontal.addVertex(2);
		Vertex<Integer> tres = graphHorizontal.addVertex(3);
		Vertex<Integer> quatro = graphHorizontal.addVertex(4);
		Vertex<Integer> cinco = graphHorizontal.addVertex(5);
		Vertex<Integer> seis = graphHorizontal.addVertex(6);
		Vertex<Integer> sete = graphHorizontal.addVertex(7);
		Vertex<Integer> oito = graphHorizontal.addVertex(8);
		Vertex<Integer> nove = graphHorizontal.addVertex(9);
		Vertex<Integer> dez = graphHorizontal.addVertex(10);
		Vertex<Integer> onze = graphHorizontal.addVertex(11);
		Vertex<Integer> doze = graphHorizontal.addVertex(12);
		Vertex<Integer> treze = graphHorizontal.addVertex(13);
		Vertex<Integer> quatorze = graphHorizontal.addVertex(14);
		Vertex<Integer> quinze = graphHorizontal.addVertex(15);
		Vertex<Integer> dezeseis = graphHorizontal.addVertex(16);
		Vertex<Integer> dezesete = graphHorizontal.addVertex(17);
		Vertex<Integer> dezoito = graphHorizontal.addVertex(18);
		Vertex<Integer> dezenove = graphHorizontal.addVertex(19);
		Vertex<Integer> vinte = graphHorizontal.addVertex(20);
		Vertex<Integer> vinteum = graphHorizontal.addVertex(21);
		Vertex<Integer> vintedois = graphHorizontal.addVertex(22);
		Vertex<Integer> vintetres = graphHorizontal.addVertex(23);
		Vertex<Integer> vintequatro = graphHorizontal.addVertex(24);

		/*
		 * {1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15},
		 * {16,17,18},{19,20,21},{22,23,24}
		 */

		um.addEdge(dois);
		dois.addEdge(tres);
		quatro.addEdge(cinco);
		cinco.addEdge(seis);
		sete.addEdge(oito);
		oito.addEdge(nove);
		dez.addEdge(onze);
		onze.addEdge(doze);
		treze.addEdge(quatorze);
		quatorze.addEdge(quinze);
		dezeseis.addEdge(dezesete);
		dezesete.addEdge(dezoito);
		dezenove.addEdge(vinte);
		vinte.addEdge(vinteum);
		vintedois.addEdge(vintetres);
		vintetres.addEdge(vintequatro);

		graphHorizontal.traverse(um);
	}
}
