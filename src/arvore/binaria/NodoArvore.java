package arvore.binaria;

public class NodoArvore {
	private NodoArvore filhoEsquerda;
	private int chave;
	private NodoArvore filhoDireita;
	
	public NodoArvore(int valor){
		
		 this.setChave(valor);
		 this.setFilhoEsquerda(null);
		 this.setFilhoDireita(null);
		 }

	public NodoArvore getFilhoEsquerda() {
		return filhoEsquerda;
	}

	public void setFilhoEsquerda(NodoArvore filhoEsquerda) {
		this.filhoEsquerda = filhoEsquerda;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public NodoArvore getFilhoDireita() {
		return filhoDireita;
	}

	public void setFilhoDireita(NodoArvore filhoDireita) {
		this.filhoDireita = filhoDireita;
	}
	public interface Arvore {
		 public NodoArvore pesquisa (int valor);
		 public void inserir (int valor);
		 public void remover (int valor);
		 public void imprime_preFixado();
		}
//	public class ArvoreBinaria implements Arvore {
//		 private NodoArvore raiz;
//		 public ArvoreBinaria(){
//		 this.raiz = null;
//		 }


}
