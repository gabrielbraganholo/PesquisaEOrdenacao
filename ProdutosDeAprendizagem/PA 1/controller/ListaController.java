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

        int[] vetorBase = new int[100000];

        tempoInicio = System.nanoTime();
        Utilidades.popularVetor(vetorBase, 100000, 100, 100000, true);
        tempoFim = System.nanoTime();

        view.exibirTempo("Popular lista aleatória", (tempoFim - tempoInicio) / 1000000);


        int[] vetorBubble = vetorBase.clone();
        tempoInicio = System.nanoTime();
        Ordenacao.bubbleSort(vetorBubble, vetorBubble.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Buble Sort", (tempoFim - tempoInicio) / 1000000);


        int[] vetorInsertion = vetorBase.clone();
        tempoInicio = System.nanoTime();
        Ordenacao.insertionSort(vetorInsertion, vetorInsertion.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Insertion Sort", (tempoFim - tempoInicio) / 1000000);


        int[] vetorSelection = vetorBase.clone();
        tempoInicio = System.nanoTime();
        Ordenacao.selectionSort(vetorSelection, vetorSelection.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Selection Sort", (tempoFim - tempoInicio) / 1000000);


        int[] vetorCocktail = vetorBase.clone();
        tempoInicio = System.nanoTime();
        Ordenacao.cocktailSort(vetorCocktail, vetorCocktail.length);
        tempoFim = System.nanoTime();

        view.exibirTempo("Cocktail Sort", (tempoFim - tempoInicio) / 1000000);
    }
}