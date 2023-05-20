package listas.duplamente.encadeadas;


public class TesteNodoDuplamente {
	public static void main(String[] args) {
	    
		
		NodoDuplamente primeiro = new NodoDuplamente(0);
		primeiro.setData(10);
		
		NodoDuplamente segundo = new NodoDuplamente(0);
		segundo.setData(2);
		
		NodoDuplamente terceiro = new NodoDuplamente(0);
		terceiro.setData(3);
		
		NodoDuplamente quarto = new NodoDuplamente(0);
		quarto.setData(9);
		
		primeiro.setNext(segundo);
		segundo.setNext(terceiro);
		terceiro.setNext(quarto);
		
		NodoDuplamente nodoAtual = primeiro;
		while (nodoAtual != null) {
			System.out.println(nodoAtual.getData());
			nodoAtual = nodoAtual.getNext();
		}
		
		
		
	}
}
