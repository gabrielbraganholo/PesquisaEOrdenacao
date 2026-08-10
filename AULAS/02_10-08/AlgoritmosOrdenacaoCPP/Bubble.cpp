void Bubble(List<int> lista) {

    int aux;
    boolean houveTroca;
    int i;

    do {
        houveTroca = false;
        for(i=0; i < lista.size()-1; i++) {
            if (lista[i] > lista[i+1]) {
                houveTroca = true;
                aux = lista[i];
                lista[i] = lista[i+1];
                lista[i+1] = aux;
            }
        }
    } while(houveTroca);
}