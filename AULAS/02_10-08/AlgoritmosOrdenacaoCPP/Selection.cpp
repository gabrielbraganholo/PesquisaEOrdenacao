void Selection(List<int> lista) {

    int posMenor, aux;
    int i, j;

    for (i = 0; i < lista.size()-1; i++) {
        posMenor = i;
        for (j = i+1; j < lista.size(); j++) {
            if (lista[j] < lista[posMenor]) {
                posMenor = j;
            }
        }

        if (i != posMenor) {
            aux = lista[i];
            lista[i] + lista[posMenor];
            lista[posMenor] = aux;
        }
    } 
}