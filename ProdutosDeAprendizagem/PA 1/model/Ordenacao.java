package model;


public class Ordenacao {

    public static void bubbleSort(int[] vetor, long n) {
        boolean houveTroca;
        int tmp;
        long i;
        long qtdComparacoes = 0, qtdTrocas = 0;

        do {
            houveTroca = false;
            for (i = 0; i < n - 1; i++) {
                qtdComparacoes++;

                if (vetor[(int) i] > vetor[(int) i + 1]) {
                    houveTroca = true;
                    tmp = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) i + 1];
                    vetor[(int) i + 1] = tmp;
                    qtdTrocas++;
                }
            }
        } while (houveTroca);

        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas + "\n");
    }

    public static void selectionSort(int[] vetor, long n) {
        long posMenor, i, j;
        int tmp;
        long qtdComparacoes = 0, qtdTrocas = 0;

        for (i = 0; i < n - 1; i++) {
            posMenor = i;

            for (j = i + 1; j < n; j++) {
                qtdComparacoes++;

                if (vetor[(int) j] < vetor[(int) posMenor]) {
                    posMenor = j;
                }
            }

            if (i != posMenor) {
                tmp = vetor[(int) i];
                vetor[(int) i] = vetor[(int) posMenor];
                vetor[(int) posMenor] = tmp;
                qtdTrocas++;
            }
        }

        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas + "\n");
    }

    public static void insertionSort(int[] vetor, long n) {
        long i, j;
        int tmp;
        long qtdComparacoes = 0, qtdTrocas = 0;

        for (i = 1; i < n; i++) {
            tmp = vetor[(int) i];

            for (j = i - 1; j >= 0; j--) {
                qtdComparacoes++;

                if (tmp < vetor[(int) j]) {
                    vetor[(int) j + 1] = vetor[(int) j];
                    qtdTrocas++;
                } else {
                    break;
                }
            }

            vetor[(int) j + 1] = tmp;
            qtdTrocas++;
        }

        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas + "\n");
    }

    public static void cocktailShakerSort(int[] vetor, long n) {
        boolean houveTroca;
        int tmp;
        long i, ini = 0, fim = n - 1;
        long qtdComparacoes = 0, qtdTrocas = 0;

        do {
            // aplicando o bolha da esquerda para direita
            houveTroca = false;

            for (i = ini; i < fim; i++) {
                qtdComparacoes++;

                if (vetor[(int) i] > vetor[(int) i + 1]) {
                    houveTroca = true;

                    tmp = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) i + 1];
                    vetor[(int) i + 1] = tmp;

                    qtdTrocas++;
                }
            }

            fim--;

            if (!houveTroca) {
                break;
            }

            // aplicando o bolha da direita para esquerda
            houveTroca = false;

            for (i = fim; i > ini; i--) {
                qtdComparacoes++;

                if (vetor[(int) i] < vetor[(int) i - 1]) {
                    houveTroca = true;

                    tmp = vetor[(int) i];
                    vetor[(int) i] = vetor[(int) i - 1];
                    vetor[(int) i - 1] = tmp;

                    qtdTrocas++;
                }
            }

            ini++;

        } while (houveTroca && ini <= fim);

        System.out.println("Quantidade comparações: " + qtdComparacoes);
        System.out.println("Quantidade trocas: " + qtdTrocas + "\n");
    }

}