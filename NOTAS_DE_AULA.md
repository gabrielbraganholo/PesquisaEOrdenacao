# 03/08

## MVC

MVC (**Model–View–Controller**) é um padrão de arquitetura de software que organiza uma aplicação em três responsabilidades principais. O objetivo é separar a lógica de negócio, a interface e o controle da aplicação, facilitando a manutenção e a organização do código.

### Model
Responsável pelos **dados** e pela **lógica de negócio** da aplicação.

- Representa as entidades do sistema.
- Realiza validações e regras de negócio.
- Interage com o banco de dados.
- Não depende da interface do usuário.

### View
Responsável pela **interface com o usuário**.

- Exibe os dados ao usuário.
- Recebe as interações do usuário (cliques, formulários etc.).
- Não contém regras de negócio.
- Apenas apresenta as informações fornecidas pelo Controller.

### Controller
Responsável por fazer a comunicação entre o Model e a View.

- Recebe as requisições do usuário.
- Processa as ações necessárias.
- Chama o Model quando precisa acessar ou alterar dados.
- Retorna uma View com as informações adequadas.

### Fluxo do MVC

1. O usuário realiza uma ação na **View**.
2. A **Controller** recebe essa ação.
3. A **Controller** solicita dados ou executa operações no **Model**.
4. O **Model** processa a solicitação e retorna o resultado.
5. A **Controller** envia os dados para a **View**.
6. A **View** apresenta o resultado ao usuário.


## Pesquisa Sobre os Métodos de Ordenação

1) Pesquisar na IA generativa sobre os métodos de ordenação e categoriza-los:
  - algorítmo de memória interna ou externa
  - se é estável ou instável
  - complexidade
  - porções de ordenação

- Bubble Sort
  - memória interna
  - estável
  - O(n²)
  - porção ordenada: final

- Selection Sort
  - memória interna
  - instável
  - O(n²)
  - porção ordenada: início

- Insertion Sort
  - memória interna
  - estável
  - O(n²)
  - porção ordenada: início

- Comb Sort
  - memória interna
  - instável
  - O(n²)
  - porção ordenada: sem porção fixa (reduz gradualmente a desordem com gaps)

- Cocktail Shaker Sort
  - memória interna
  - estável
  - O(n²)
  - porção ordenada: início e final

- Shell Sort
  - memória interna
  - instável
  - O(n²)
  - porção ordenada: parcial (subgrupos definidos pelos gaps)

- Bucket Sort
  - memória interna
  - estável*
  - O(n + k) (médio) / O(n²) (pior caso)
  - porção ordenada: buckets (baldes)

- Radix Sort
  - memória interna
  - estável
  - O(n · k)
  - porção ordenada: por dígitos (unidades, dezenas, centenas...)

- Heap Sort
  - memória interna
  - instável
  - O(n log n)
  - porção ordenada: final

- Merge Sort
  - memória interna
  - estável
  - O(n log n)
  - porção ordenada: subvetores (metades) que são unidos em ordem

- Quick Sort
  - memória interna
  - instável
  - O(n log n) (médio) / O(n²) (pior caso)
  - porção ordenada: pivô na posição correta após cada partição

> *Bucket Sort é estável quando o algoritmo utilizado para ordenar os buckets também é estável.*

## Comentários 

Eficiente X Eficaz
  - Ambos atingem objetivos
  - Eficaz tem relação com o tempo

Qual o melhor algorítmo de ordenação?
  Depende:
    - Do tamanho da estrutura 
    - Do quanto já está ordenado

Cenários de um processo de ordenação
  - Pior caso:
    - Bubble -> lista ordenada decrescente se deseja ordenar crescente
    - Selection -> lista ordenada
    - Insertion -> lista ordenada decrescente se deseja ordenar crescente


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
