package model;

import java.util.Random;

/**
 * Classe responsável por fornecer métodos auxiliares
 * para manipulação das listas utilizadas no projeto.
 */
public class Utilidades {

    /**
     * Popula um vetor de inteiros com valores aleatórios
     * ou sequenciais de acordo com o parâmetro informado.
     *
     * @param vetor vetor que receberá os valores gerados
     * @param quantidadeNumeros quantidade de números que serão adicionados
     * @param inicio valor inicial do intervalo de números
     * @param fim valor final do intervalo de números aleatórios
     * @param aleatorio define se a geração será aleatória (true)
     *                  ou sequencial (false)
     */
    public static void popularVetor(int[] vetor, long quantidadeNumeros, int inicio, int fim, boolean aleatorio) {

        Random gerador = new Random();

        if (aleatorio) {
            for (long i = 0; i < quantidadeNumeros; i++) {
                vetor[(int) i] = gerador.nextInt(inicio, fim);
            }
        } else {
            for (long i = 0; i < quantidadeNumeros; i++) {
                vetor[(int) i] = inicio + (int) i;
            }
        }
    }
}
