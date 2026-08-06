package view;

import java.util.List;

public class ExibicaoView {

    public void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);

        for (Integer item : lista) {
            System.out.println(item);
        }

        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }

    public void exibirTempo(String rotina, long tempo) {
        System.out.println("Tempo (ms) " + rotina + ": " + tempo);
    }
}