package heap;

public class HeapMaximo {
	private int[] Heap;
	private int tamanho;
	private int tamanhoMaximo;

	public HeapMaximo(int tamanhoLimite) {
		this.tamanhoMaximo = tamanhoLimite;
		this.tamanho = 0;
		Heap = new int[this.tamanhoMaximo + 1];
		Heap[0] = Integer.MAX_VALUE;
	}

	private int noPai(int pos) {
		return pos / 2;
	}

	private int filhoAEsquerda(int pos) {
		return (2 * pos);
	}

	private int filhoADireita(int pos) {
		return 2 * pos + 1;
	}

	private boolean ehNoFolha(int pos) {
		return pos >= (tamanho / 2) && pos <= tamanho;
	}

	private void trocarPosicoes(int pos1, int pos2) {
		int tmp = Heap[pos1];
		Heap[pos1] = Heap[pos2];
		Heap[pos2] = tmp;
	}

	private void repararHeap(int pos) {
		if (ehNoFolha(pos))
			return;
		int esq = filhoAEsquerda(pos);
		int dir = filhoADireita(pos);

		int maior = pos;
		if (esq <= this.tamanhoMaximo && Heap[esq] > Heap[pos])
			maior = esq;
		if (dir <= this.tamanhoMaximo && Heap[dir] > Heap[maior])
			maior = dir;

		if (maior != pos) {
			trocarPosicoes(pos, maior);
			repararHeap(maior);
		}
	}

	public void inserir(int i) {
		if (tamanho >= tamanhoMaximo) {
            System.out.println("O heap está cheio. Não é possível inserir mais elementos.");
            return;
        }

        tamanho++;
        int pos = tamanho;

        Heap[pos] = i;

        while (pos > 1 && Heap[pos] > Heap[noPai(pos)]) {
            trocarPosicoes(pos, noPai(pos));
            pos = noPai(pos);
        }
		
	}

	public void exibirHeap() {
		for (int i = 1; i <= tamanho; i++) {
            System.out.print(Heap[i] + " ");
        }
        System.out.println();
		
	}

	public int removerMaximo() {
		if (tamanho == 0) {
            System.out.println("O heap está vazio. Não há elementos para remover.");
            return -1; // Valor padrão para indicar falha na remoção
        }

        int maximo = Heap[1];
        Heap[1] = Heap[tamanho];
        tamanho--;

        repararHeap(1);

        return maximo;
	}
}
