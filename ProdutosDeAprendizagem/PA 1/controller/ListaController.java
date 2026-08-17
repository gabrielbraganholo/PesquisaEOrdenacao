package controller;


import model.Ordenacao;
import model.Utilidades;
import view.ExibicaoView;

/**
 * Classe responsável pelo controle da aplicação.
 */
public class ListaController {

    private final ExibicaoView view = new ExibicaoView();

    /**
     * Executa o processo de criação das listas
     * e mede o tempo de execução de cada rotina.
     */
    public void executar() {

        long tempoInicio, tempoFim;

        int[] vetorAleatorio = new int[100000];

        tempoInicio = System.nanoTime();
        Utilidades.popularVetor(vetorAleatorio, 100000, 100, 100000, true);
        tempoFim = System.nanoTime();

        view.exibirTempo("Popular lista aleatória", (tempoFim - tempoInicio) / 1000000);

        
        tempoInicio = System.nanoTime();
        Ordenacao.bubbleSort(vetorAleatorio, vetorAleatorio.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Buble Sort", (tempoFim - tempoInicio) / 1000000);


        tempoInicio = System.nanoTime();
        Ordenacao.insertionSort(vetorAleatorio, vetorAleatorio.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Insertion Sort", (tempoFim - tempoInicio) / 1000000);


        tempoInicio = System.nanoTime();
        Ordenacao.selectionSort(vetorAleatorio, vetorAleatorio.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Selection Sort", (tempoFim - tempoInicio) / 1000000);


        tempoInicio = System.nanoTime();
        Ordenacao.cocktailShakerSort(vetorAleatorio, vetorAleatorio.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Cocktail", (tempoFim - tempoInicio) / 1000000);
    }
}