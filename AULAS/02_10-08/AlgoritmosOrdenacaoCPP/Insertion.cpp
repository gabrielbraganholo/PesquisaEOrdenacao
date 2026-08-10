void Insertion(List<int> lista) {
    
    int aux;
    int i, j;

    for(i = 1; i < lista.size(); i++) {
        aux = lista[i];
        for(j = i - 1; j >= 0; j--) {
            if (aux < lista[j]) {
                lista[j+1] = lista[j];
            }
            else breack;
        }

        lista[j+1] = aux;
    }
}