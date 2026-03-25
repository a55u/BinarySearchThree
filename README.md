# Árvore Binária de Busca (BST) em Java

Este repositório contém uma implementação educacional de uma **Árvore Binária de Busca** (Binary Search Tree - BST) desenvolvida em Java. O objetivo deste projeto é demonstrar o funcionamento de estruturas de dados baseadas em nós, recursão e algoritmos de travessia.

# Funcionalidades Implementadas

A classe `BinarySearchTree` conta com os seguintes métodos principais:

* **`insert(int valor)`**: Insere um novo valor na posição correta da árvore, mantendo a regra da BST.
* **`search(int valor)`**: Busca um valor específico na árvore e retorna `true` se encontrado, ou `false` caso contrário.
* **Travessias (Tree Traversals)**:
  * **`preOrder()`**: Visita o nó atual, depois a subárvore esquerda e por fim a direita.
  * **`inOrder()`**: Visita a subárvore esquerda, o nó atual e depois a direita. (Gera os valores em ordem crescente!).
  * **`postOrder()`**: Visita a subárvore esquerda, a direita e por último o nó atual.

## Como rodar o projeto

### Pré-requisitos
* Ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina (versão 8 ou superior).

### Passo a passo

1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git](https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git)
    ```
2. Entre na pasta onde o repositório foi clonado:
    ```bash
    cd ./sua-pasta/BinarySearchThree
    ```
3. Rode o algoritmo: 
    ```bash
    java BinarySearchThree.java
    ```

