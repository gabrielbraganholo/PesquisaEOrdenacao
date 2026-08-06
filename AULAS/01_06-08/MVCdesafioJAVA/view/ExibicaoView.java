package view;

import java.util.List;

/**
 * Classe responsável pela apresentação dos dados ao usuário.
 *
 * Esta classe pertence à camada View do padrão MVC,
 * pois realiza somente a exibição das informações,
 * sem possuir regras de negócio.
 */
public class ExibicaoView {

    /**
     * Exibe os valores presentes em uma lista.
     *
     * @param lista lista de inteiros que será exibida
     * @param frase mensagem exibida antes da lista
     */
    public void exibirLista(List<Integer> lista, String frase) {
        System.out.println(frase);

        for (Integer item : lista) {
            System.out.println(item);
        }

        System.out.println("--------------------------");
        System.out.println("Total de registros: " + lista.size());
    }

    /**
     * Exibe o tempo gasto na execução de uma rotina.
     *
     * @param rotina nome da rotina executada
     * @param tempo tempo de execução em milissegundos
     */
    public void exibirTempo(String rotina, long tempo) {
        System.out.println("Tempo (ms) " + rotina + ": " + tempo);
    }
}