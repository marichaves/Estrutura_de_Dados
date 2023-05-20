package listas.simplesmente.encadeada;

public class Listas_simplesmente_encadeadas_teste {

	public static void main(String[] args) {
	    Nodo nodo1 = new Nodo();
	    nodo1.setDado(7);
	    
	    Nodo nodo2 = new Nodo();
	    nodo2.setDado(2);
	    
	    nodo1.setProximo(nodo2);
	    
	    Nodo nodoAtual = nodo1;
	    
	    while (nodoAtual != null) {
	        System.out.println(nodoAtual.getDado());
	        nodoAtual = nodoAtual.getProximo();
	    }
	}



}
