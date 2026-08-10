package controller;

import java.util.ArrayList;
import java.util.List;
import models.Utilidades;
import view.ExibicaoView;

/**
 * Classe responsável pelo controle da aplicação.
 *
 * Atua como intermediária entre Model e View no padrão MVC.
 *
 * Suas responsabilidades são:
 * - Controlar o fluxo de execução.
 * - Solicitar operações ao Model.
 * - Enviar informações para a View.
 */
public class ListaController {

    private final ExibicaoView view = new ExibicaoView();

    /**
     * Executa o processo de criação das listas
     * e mede o tempo de execução de cada rotina.
     */
    public void executar() {

        long tempoInicio, tempoFim;

        List<Integer> listaAleatoria = new ArrayList<>();
        List<Integer> listaSequencial = new ArrayList<>();

        tempoInicio = System.nanoTime();

        Utilidades.popularLista(listaAleatoria, 100000, 100, 100000, true);

        tempoFim = System.nanoTime();

        view.exibirTempo("Rotina 1", (tempoFim - tempoInicio) / 1000000);

        tempoInicio = System.nanoTime();

        Utilidades.popularLista(listaSequencial, 100000, 1, 100000, false);

        tempoFim = System.nanoTime();

        view.exibirTempo("Rotina 2", (tempoFim - tempoInicio) / 1000000);
    }
}