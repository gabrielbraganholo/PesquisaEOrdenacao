void cocktailSort(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i, ini = 0, fim = n - 1;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        // aplicando o bolha da esquerda para direita
        houveTroca = false;
        for (i = ini; i < fim; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+1];
                vetor[i+1] = tmp;
                qtdTrocas++;
            }
        }
        fim--;

        if (!houveTroca) {
            break;
        }

        // aplicando o bolha da direita para esquerda
        houveTroca = false;
        for (i = fim; i > ini; i--) {
            qtdComparacoes++;
            if (vetor[i] < vetor[i-1]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i-1];
                vetor[i-1] = tmp;
                qtdTrocas++;
            }
        }
        ini++;

    } while (houveTroca && ini <= fim);

    cout << "Quantidade comparações: " << qtdComparacoes << endl;
    cout << "Quantidade trocas: " << qtdTrocas << endl << endl;
}