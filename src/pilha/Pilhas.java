package pilha;

import java.util.Stack;

public class Pilhas {
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		System.out.println("Inicio do passeio....... " + pilha);
		pilha.push("Casa");
		pilha.push("Cinema");
		pilha.push("Oficina mecênica");
		pilha.push("Zoológico");
		System.out.println("Local onde deixou a carteira: " + pilha);
		pilha.push("Museu");
		pilha.push("Parque");
		pilha.push("Sorveteria");
		System.out.println("Fim do passeio........: " + pilha);
		System.out.println("--------------------------------------------------");
		System.out.println("Inicio do caminho inverso");
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Local onde deixou a carteira "+ pilha);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		System.out.println("Fim do caminho inversso........: " + pilha);
		
	}
}
