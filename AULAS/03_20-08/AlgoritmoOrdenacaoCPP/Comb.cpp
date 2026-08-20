void combSort(int *vetor, long long int n) {
    bool houveTroca;
    int tmp;
    long long int i;
    long long int distancia = n;
    long long int qtdComparacoes = 0, qtdTrocas = 0;

    do {
        distancia = (int)distancia / 1.3;
        if (distancia < 1) distancia = 1;

        houveTroca = false;
        for (i = 0; i < n - distancia; i++) {
            qtdComparacoes++;
            if (vetor[i] > vetor[i+distancia]) {
                houveTroca = true;
                tmp = vetor[i];
                vetor[i] = vetor[i+distancia];
                vetor[i+distancia] = tmp;
                qtdTrocas++;  
            }
        }
    } while (distancia > 1 || houveTroca);

        cout << "Quantidade comparações: " << qtdComparacoes << endl;
        cout << "Quantidade trocas: " << qtdTrocas << endl << endl;
}