# 30/07

## Discussão e entendimento do Plano de Ensino

- Ordenação: conceitos, algorítmos
- Pesquisa: conceitos, alorítmo
- Pesquisa digital: algorítmos
- Tabela hash: conceitos, algorítmos
- Balanceamento em árvores: conceitos, algorítmos
- Árvores B: conceitos, algorítmos

## Conceitos Iniciais

- Por que ordenar?
  - Para otimizar a busca ou pesquisa
- Pesquisar: localizar ou bscar um dado detro de uma estrutura via alguma chave
  - Recuperar: localizar ou buscar dados com relevância (semântica ou significado)
- Complexidade de um algorítmo: é o esforço computacional de um alorítmo, ou seja, quanto de recursos ele aloca para realizar suas tarefas
  - alta: mais esforço
  - baixa: menos esforço
  - Notação Big O (em ordem de cmplexidade crescente)
    - O(n!) -> fatorial
    - o(n^x) -> exponencial
    - O(log n + n)
    - O(n) -> linear
    - O(log n) -> logarítmico (árvores)

## Como Medir a Complexidade

| Ordenação | Pesquisa |
|------------|-----------|
| Quantidade de comparações | Quantidade de comparações |
| + | — |
| Quantidade de trocas | — |
## Tipos de Busca

- **Search / Find**: buscar, localizar ou pesquisar um item.
- **Retrieve**: recuperar informações com base em relevância, como ocorre em mecanismos de busca (ex.: Google).

## Bubble Sort × Comb Sort

- **Bubble Sort**
  - Algoritmo **estável**.
  - Mantém a ordem relativa de elementos com valores iguais.

- **Comb Sort**
  - Algoritmo **instável**.
  - Não garante a ordem relativa entre elementos iguais.
  - Em compensação, costuma ser mais eficiente que o Bubble Sort em muitos casos.

> **Observação:** um algoritmo estável não é necessariamente melhor. A escolha depende do problema e dos requisitos da aplicação.


------

# 27/07

## Escalabilidade

### Escalabilidade Vertical
- É necessário parar o sistema para realizar modificações (upgrade de hardware ou recursos da máquina).

### Escalabilidade Horizontal
- Permite realizar modificações com o sistema em funcionamento.
- Consiste em adicionar mais máquinas/servidores para distribuir a carga.


## Algoritmos de Ordenação (Sort)

### Algoritmos mais simples
- Selection Sort
- Bubble Sort
  - Simples de implementar, mas possui alta complexidade.
- Insertion Sort

### Algoritmos intermediários
- Agitação (Shaker Sort)
- Pente (Comb Sort)
- Shell Sort

### Algoritmos mais eficientes
- Radix Sort
- Bucket Sort
- Merge Sort
  - Mais complexo de implementar, porém possui baixa complexidade.
- Quick Sort


## Complexidade

- Refere-se ao esforço computacional necessário para executar um algoritmo.
- Geralmente é analisada em relação ao tempo de execução e ao uso de memória.
