package models;

import java.util.List;
import java.util.Random;

/**
 * Classe responsável por fornecer métodos auxiliares
 * para manipulação das listas utilizadas no projeto.
 *
 * Esta classe pertence à camada Model do padrão MVC,
 * pois contém a lógica de processamento dos dados.
 */
public class Utilidades {

    /**
     * Popula uma lista de inteiros com valores aleatórios
     * ou sequenciais de acordo com o parâmetro informado.
     *
     * @param lista lista que receberá os valores gerados
     * @param quantidadeNumeros quantidade de números que serão adicionados
     * @param inicio valor inicial do intervalo de números
     * @param fim valor final do intervalo de números aleatórios
     * @param aleatorio define se a geração será aleatória (true)
     *                  ou sequencial (false)
     */
    public static void popularLista(List<Integer> lista, long quantidadeNumeros,
                                    int inicio, int fim, boolean aleatorio) {

        Random gerador = new Random();

        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                lista.add(gerador.nextInt(inicio, fim));
            }
        } else {
            for (long i = inicio; i <= quantidadeNumeros; i++) {
                lista.add((int) i);
            }
        }
    }
}
