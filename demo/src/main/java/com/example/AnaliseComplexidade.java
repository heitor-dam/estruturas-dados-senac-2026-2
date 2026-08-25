package com.example;

/**
 * Classe didática usada para demonstrar, na prática, os quatro níveis de
 * complexidade de tempo mais comuns em algoritmos, na ordem do melhor
 * caso para o pior caso:
 *
 * 
 *   O(1)      - Tempo Constante</li>
 *   O(log n)  - Tempo Logarítmico</li>
 *   O(n)      - Tempo Linear</li>
 *   O(n²)     - Tempo Quadrático</li>
 * 
 *
 * Cada método imprime no console os passos que ele executa, para que seja
 * possível "ver" a diferença de custo entre eles: quanto mais passos são
 * impressos, mais caro é o algoritmo.
 *
 * A documentação detalhada de cada complexidade (conceito, analogia e
 * características) está nos arquivos Markdown em
 * {@code demo/docs/complexidade/}.
 */
public class AnaliseComplexidade {

    /**
     * Tamanho da entrada usado nas demonstrações. É o "n" que aparece nas
     * notações O(1), O(log n), O(n) e O(n²). Usamos 10 porque é pequeno o
     * suficiente para ler a saída no console, mas já mostra a diferença de
     * quantidade de passos entre as complexidades (compare 10 linhas
     * impressas no linear com 100 linhas no quadrático).
     */
    private static final int N = 10;

    /**
     * Demonstra tempo constante — O(1).
     *
     * <p>Complexidade O(1) significa que o algoritmo executa sempre a
     * mesma quantidade de passos, não importa o tamanho da entrada.
     * Aqui, a "operação" é acessar a primeira posição do vetor: seja o
     * vetor de tamanho 10 ou de tamanho 10 milhões, acessar o índice 0
     * é sempre 1 única operação, com custo fixo.</p>
     *
     * @param numeros vetor de entrada; apenas o índice 0 é acessado, o
     *                tamanho do vetor não influencia o custo do método
     */
    public void tempoConstante(int[] numeros) {
        // Cabeçalho apenas para identificar, na saída do console, qual
        // bloco de demonstração está sendo executado.
        System.out.println("\n--- Tempo Constante O(1) ---");

        // numeros[0] é um acesso direto por índice: o Java calcula o
        // endereço de memória da posição 0 em tempo constante, sem
        // precisar percorrer o vetor. Por isso essa linha é O(1).
        System.out.println("Primeiro numero do vetor: " + numeros[0]);
    }

    /**
     * Demonstra tempo logarítmico — O(log n).
     *
     * <p>Complexidade O(log n) significa que, a cada passo, o tamanho do
     * problema é reduzido (aqui, pela metade). Por isso o número de
     * passos cresce muito mais devagar que o tamanho da entrada: dobrar
     * "n" adiciona apenas 1 passo a mais, em vez de dobrar o trabalho.</p>
     *
     * @param n valor inicial que será sucessivamente dividido por 2 até
     *          restar 1 ou menos; representa o tamanho do problema
     */
    public void tempoLogaritmico(int n) {
        System.out.println("\n--- Tempo Logaritmico O(log n) ---");

        // passos conta quantas vezes o laço abaixo executa. É essa
        // contagem que cresce de forma logarítmica em relação a "n":
        // para n = 10, passos termina em 3 ou 4; para n = 1.000.000,
        // passos termina perto de 20.
        int passos = 0;

        // valor guarda o "tamanho do problema restante" a cada iteração.
        // Começa igual a n e vai sendo dividido pela metade a cada volta
        // do laço — é essa divisão que caracteriza o comportamento
        // logarítmico (o problema encolhe exponencialmente rápido).
        int valor = n;

        // O laço continua enquanto ainda houver mais de 1 elemento para
        // "considerar". Assim que valor chega a 1 (ou menos), não há
        // mais o que dividir e o laço para.
        while (valor > 1) {
            // Divisão inteira por 2: descarta metade do problema a cada
            // passo, exatamente como uma busca binária descarta metade
            // do vetor a cada comparação.
            valor = valor / 2;

            // Registra que mais um passo foi executado.
            passos++;

            // Mostra o progresso: o valor restante encolhe rapidamente.
            System.out.println("Passo " + passos + " -> valor reduzido para: " + valor);
        }
    }

    /**
     * Demonstra tempo linear — O(n).
     *
     * <p>Complexidade O(n) significa que o algoritmo executa uma
     * quantidade de passos diretamente proporcional ao tamanho da
     * entrada: um único laço percorre todos os "n" elementos, um a um,
     * sem pular nenhum e sem repetir nenhum.</p>
     *
     * @param n quantidade de números que serão contados, do 0 até n - 1
     */
    public void tempoLinear(int n) {
        System.out.println("\n--- Tempo Linear O(n) ---");

        // i representa a posição atual da contagem. O laço roda
        // exatamente n vezes: começa em 0, incrementa 1 por vez
        // (i++) e para assim que i deixa de ser menor que n.
        // Cada volta do laço é 1 passo, então o custo total é
        // diretamente proporcional a n — daí o nome "linear".
        for (int i = 0; i < n; i++) {
            System.out.println("Contando: " + i);
        }
    }

    /**
     * Demonstra tempo quadrático — O(n²).
     *
     * <p>Complexidade O(n²) aparece quando há um laço dentro de outro
     * laço e ambos dependem do tamanho da entrada: para cada um dos "n"
     * elementos do laço externo, o laço interno percorre novamente todos
     * os "n" elementos. O resultado é n × n = n² passos no total, que
     * cresce muito mais rápido do que o tamanho da entrada.</p>
     *
     * @param n quantidade de elementos considerados em cada um dos dois
     *          laços; o total de passos executados é n * n
     */
    public void tempoQuadratico(int n) {
        System.out.println("\n--- Tempo Quadratico O(n^2) ---");

        // i é o laço externo: cada valor de i representa "um elemento
        // fixo" para o qual vamos comparar todos os outros.
        for (int i = 0; i < n; i++) {
            // j é o laço interno: para CADA valor de i, j percorre todos
            // os n valores de novo, do 0 ao n - 1. É essa repetição
            // completa dentro de outra repetição completa que gera o
            // total de n * n execuções (o "quadrado" de n).
            for (int j = 0; j < n; j++) {
                System.out.println("Par: (" + i + ", " + j + ")");
            }
        }
    }

    /**
     * Executa, em sequência, as quatro demonstrações de complexidade, na
     * ordem do melhor caso (O(1)) para o pior caso (O(n²)), usando sempre
     * o mesmo tamanho de entrada ({@link #N}) para permitir a comparação
     * direta entre elas.
     */
    public void demonstrarTodos() {
        // Vetor de exemplo usado apenas pelo método tempoConstante, que
        // precisa de um vetor (array) para simular o acesso por índice.
        // Os demais métodos recebem apenas o tamanho N, pois trabalham
        // com contagens, não com um vetor específico.
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        tempoConstante(numeros); // O(1)      - melhor caso
        tempoLogaritmico(N);     // O(log n)
        tempoLinear(N);          // O(n)
        tempoQuadratico(N);      // O(n^2)    - pior caso desta demonstração
    }
}