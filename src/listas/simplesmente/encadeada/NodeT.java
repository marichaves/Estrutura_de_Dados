package listas.simplesmente.encadeada;

class NodeT {
    int data;
    NodeT next;
    
    public NodeT(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    NodeT head;
    
    public LinkedList() {
        this.head = null;
    }
    
    public void insert(int data) { //Insere um novo nó na lista, se estiver vazia o novo nó se torna head caso contrário, ele percorre a lista até encontrar o último nó e atribui o novo nó como o próximo do último nó.
        NodeT newNodeT = new NodeT(data);
        
        if (head == null) {
            head = newNodeT;
        } else {
            NodeT current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNodeT;
        }
    }
    
    public void display() { //exibe os valores da lista. Ele percorre a lista a partir do head, imprimindo o valor de cada nó e movendo-se para o próximo nó até chegar ao final da lista.
        NodeT current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}


