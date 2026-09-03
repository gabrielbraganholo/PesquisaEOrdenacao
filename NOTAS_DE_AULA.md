# 03/09

## Ordenação ~= Organização => Otimização de Pesquisa
- chave de ordenação ~= índice
  - pode ser mais de 1 { caso seja mais de 1 necessita da implementação do Compare

## Métodos de baixa complexidade, porém mais difíceis de implementar

- Merge Sort (Intercalar)
  - Recursivo
  - Composto por dois métodos:
    - merge -> recursivo
    - intercalar -> ordenar no retorno do empilhamento
  - OBS: O processo é baseado em divisões de estrutura recursivmente, sempre no meio
  - melhor caso -> O(n log n)
  - pior caso -> O(n log n)

- Quick Sort (Pivo)
  - Recursivo
  - Composto por dois métodos:
    - quick -> recursivo
    - posicionar -> ordenar o pivo
  - OBS: O processo é baseado em decisões de estrutura, recursivamente, porém obedecendo a posição do pivo
  - melhor caso -> O(n log n)
  - pior caso -> O(n²)


# 10/08

## Algoritmos de Ordenação

### Estabilidade

Um algoritmo de ordenação é **estável** quando mantém a ordem relativa entre elementos que possuem a mesma chave/valor.

Exemplo:

```text
Antes:
(A, 10), (B, 5), (C, 10)

Depois de uma ordenação estável:
(B, 5), (A, 10), (C, 10)
```

Os elementos `A` e `C` possuem o mesmo valor (`10`), então sua ordem original foi mantida.

Um algoritmo **instável** pode alterar essa ordem:

```text
(B, 5), (C, 10), (A, 10)
```

#### Estável vs. instável

Não é correto dizer que algoritmos instáveis são sempre melhores que os estáveis.

* **Estáveis:** preservam a ordem dos elementos com valores iguais.
* **Instáveis:** não garantem essa preservação.
* Algoritmos instáveis podem ser mais simples ou ter algumas vantagens de desempenho/memória.
* A estabilidade pode ser importante quando os elementos possuem outras informações associadas.

---

## Explicação Geral

Os três algoritmos estudados são:

* **Bubble Sort**
* **Selection Sort**
* **Insertion Sort**

Todos são algoritmos de ordenação e, na implementação mais comum, possuem complexidade de tempo **O(n²)** no pior caso.

A diferença principal está na forma como cada algoritmo percorre o vetor e organiza os elementos.

Durante a implementação, é importante observar:

* `for` e `while` controlam as repetições;
* os índices indicam quais posições do vetor estão sendo analisadas;
* normalmente são feitas comparações entre elementos;
* dependendo do algoritmo, os elementos podem ser trocados ou deslocados.

---

### Bubble Sort

O **Bubble Sort** percorre o vetor comparando elementos **vizinhos**.

Se dois elementos estiverem na ordem errada, eles são trocados.

Exemplo:

```text
[5, 3, 8, 4]

5 > 3 → troca
[3, 5, 8, 4]

5 < 8 → não troca
[3, 5, 8, 4]

8 > 4 → troca
[3, 5, 4, 8]
```

Ao final de uma passagem, o maior elemento da parte ainda não ordenada vai para o final.

Por isso, pode-se imaginar os maiores elementos "borbulhando" para o final do vetor.

#### Estrutura

Normalmente são utilizados dois `for`:

```text
for → controla as passagens pelo vetor
    for → compara os elementos vizinhos
```

A comparação geralmente é feita entre:

```text
vetor[j] e vetor[j + 1]
```

Se:

```text
vetor[j] > vetor[j + 1]
```

os dois elementos são trocados.

#### Complexidade

* Melhor caso: **O(n)**, quando existe uma otimização que detecta que não houve trocas.
* Caso médio: **O(n²)**
* Pior caso: **O(n²)**
* Memória extra: **O(1)**
* É geralmente **estável**.

---

### Selection Sort

O **Selection Sort** divide o vetor em duas partes:

```text
[ parte ordenada | parte não ordenada ]
```

A cada passagem, procura o **menor elemento** da parte não ordenada.

Depois, troca esse menor elemento com o primeiro elemento da parte não ordenada.

Exemplo:

```text
[5, 3, 8, 4]

menor = 3

troca 3 com 5:

[3, 5, 8, 4]
```

Agora o `3` está na posição correta.

Na próxima passagem, procura o menor elemento entre:

```text
[5, 8, 4]
```

O menor é `4`:

```text
[3, 4, 8, 5]
```

E assim por diante.

#### Estrutura

Normalmente utiliza dois `for`:

```text
for → percorre as posições que serão preenchidas
    for → procura o menor elemento restante
```

Durante o segundo `for`, é comum guardar o **índice do menor elemento** encontrado.

Por exemplo:

```text
indiceMenor
```

No final da passagem, ocorre uma única troca entre o elemento atual e o menor encontrado.

---

### Insertion Sort

O **Insertion Sort** funciona de maneira parecida com a forma como organizamos cartas na mão.

Ele considera que uma parte do vetor já está ordenada e pega o próximo elemento para **inseri-lo na posição correta**.

Exemplo:

```text
[5, 3, 8, 4]
```

Consideramos inicialmente:

```text
[5] | [3, 8, 4]
```

Pegamos o `3` e comparamos com `5`.

Como:

```text
3 < 5
```

o `5` é deslocado para a direita:

```text
[3, 5] | [8, 4]
```

Depois pegamos o `8`:

```text
[3, 5] | [8, 4]
```

Como `8` já está na posição correta:

```text
[3, 5, 8] | [4]
```

Por fim, inserimos o `4`:

```text
[3, 5, 8] | [4]
```

Deslocamos `8` e `5`:

```text
[3, 4, 5, 8]
```

#### Estrutura

Normalmente utiliza-se um `for` para percorrer os elementos.

Para cada elemento, podemos usar um `while` para deslocar os elementos maiores para a direita.

A ideia é:

```text
for → escolhe o elemento que será inserido

    while → enquanto o elemento anterior for maior
             desloca o elemento para a direita
```

É comum guardar o elemento atual em uma variável, por exemplo:

```text
chave
```

Depois que os elementos maiores são deslocados, a `chave` é colocada na posição correta.

---

# Comparação

| Algoritmo      | Melhor caso | Médio | Pior caso | Memória | Estável? |
| -------------- | ----------: | ----: | --------: | ------: | -------- |
| Bubble Sort    |       O(n)¹ | O(n²) |     O(n²) |    O(1) | Sim      |
| Selection Sort |       O(n²) | O(n²) |     O(n²) |    O(1) | Não      |
| Insertion Sort |        O(n) | O(n²) |     O(n²) |    O(1) | Sim      |

¹ Considerando a versão otimizada que detecta quando nenhuma troca foi realizada.

### Ideia principal de cada um

**Bubble Sort:**

> Compara vizinhos e troca quando estão fora de ordem.

**Selection Sort:**

> Procura o menor elemento e coloca-o na posição correta.

**Insertion Sort:**

> Pega o próximo elemento e insere-o na posição correta da parte já ordenada.

------

# 06/08

## Padrão de Desenvolvimento

- Ideia de MVC
- Documentação

## Benchmark

- Medições:
  - Tempo
  - Complexidade:
    - Quantidade de Comparações
    - Quantidade de Tocas

### Exemplo de Medição de Tempo

```python
tempoInicio = time.time()
# rotina 1
tempoFim = time.time()
print("Tempo da rotina 1: ", (tempoFim - tempoInicio) , "s")
```

------

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
  - Depende:
    - Do tamanho da estrutura 
    - Do quanto já está ordenado

Cenários de um processo de ordenação
  - Pior caso:
    - Bubble -> lista ordenada decrescente se deseja ordenar crescente
    - Selection -> lista ordenada
    - Insertion -> lista ordenada decrescente se deseja ordenar crescente

------

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
