package heap;

public class TesteHeap {
    public static void main(String[] args) {
        HeapMaximo heap = new HeapMaximo(10);

        // Inserir elementos no heap
        heap.inserir(5);
        heap.inserir(10);
        heap.inserir(3);
        heap.inserir(8);

        // Exibir o estado atual do heap
        System.out.println("Estado atual do heap:");
        heap.exibirHeap();

        // Remover o maior elemento do heap
        int max = heap.removerMaximo();
        System.out.println("Maior elemento removido: " + max);

        // Exibir o estado atual do heap após a remoção
        System.out.println("Estado atual do heap após a remoção:");
        heap.exibirHeap();
    }
}

