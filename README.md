# Estrutura de Dados - Estudos PUC
 Estudos sobre Estrutura de Dados em Java
 
 Listas: 
  -Listas Simplesmente Encandeadas:
   Uma lista simplesmente encadeada é uma estrutura de dados em que cada elemento (nodo) contém uma informação e uma referência para o próximo elemento da lista. Essa abordagem permite flexibilidade na inserção e exclusão de informações, mas requer mais memória em comparação com a alocação sequencial.
   O código está organizado em dois arquivos dentro da pasta "Listas". A pasta "Listas" contém os seguintes arquivos:

   -> Nodo.java: Este arquivo define a classe Nodo, que representa um nodo individual em uma lista encadeada. A classe possui dois atributos: dado, que armazena um valor numérico do tipo float, e proximo, que é uma referência para o próximo nodo na lista. A classe também possui métodos getter e setter para acessar e       modificar esses atributos. Essa classe é responsável por definir a estrutura básica de um nodo em uma lista encadeada.

  -> Listas_simplesmente_encadeadas_teste.java: Este arquivo contém o código de teste para a classe Nodo e está localizado dentro da pasta "Listas". Ele importa a classe Nodo e define o método main, que é o ponto de entrada do programa. No método main, são criadas duas instâncias da classe Nodo, nodo1 e nodo2. Em seguida, são atribuídos os valores 7 e 2 aos atributos dado desses nodos usando os métodos setDado. A conexão entre os nodos é estabelecida, com nodo1 apontando para nodo2 através do método setProximo. Em seguida, é criada uma variável nodoAtual que inicia com o valor de nodo1. Um loop while é utilizado para percorrer a lista encadeada. Dentro do loop, o valor do atributo dado do nodo atual é impresso na tela usando System.out.println. Em seguida, a variável nodoAtual é atualizada para o próximo nodo da lista usando nodoAtual = nodoAtual.getProximo(). O loop continua até que nodoAtual seja null, indicando o final da lista encadeada.

   Assim, o código na pasta "Listas" implementa e testa a estrutura de uma lista encadeada simples. Ele cria nodos, atribui valores aos atributos dado de cada nodo e estabelece as conexões entre eles. Em seguida, percorre a lista e imprime os valores de cada nodo na tela.
