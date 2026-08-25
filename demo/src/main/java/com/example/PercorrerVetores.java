package com.example;

/**
 * Classe didática que relembra as diferentes formas de percorrer
 * (iterar) um vetor em Java, isto é, visitar todos os seus elementos
 * um por um.
 *
 * Percorrer um vetor de tamanho n é sempre uma operação O(n) — ver
 * pois cada elemento é visitado exatamente uma vez.
 *
 */
public class PercorrerVetores {

    /**
     * Vetor de exemplo compartilhado pelos métodos desta classe, apenas
     * para que todos percorram os mesmos valores e o resultado impresso
     * seja fácil de comparar entre uma forma e outra.
     */
    private final int[] numeros = {5, 10, 15, 20, 25};

    /**
     * Percorre o vetor usando o {@code for} tradicional, controlado por
     * um índice numérico.
     *
     * <p>Essa é a forma mais flexível: como temos acesso ao índice
     * {@code i}, podemos usá-lo tanto para ler quanto para alterar o
     * valor de cada posição, além de sabermos exatamente "em que
     * posição" estamos a cada passo.</p>
     */
    public void percorrerComForTradicional() {
        System.out.println("\n--- Percorrer com for tradicional (com índice) ---");

        // i começa em 0 (primeira posição do vetor) e vai até
        // numeros.length - 1 (última posição válida). numeros.length é
        // o TAMANHO do vetor (quantidade de posições), não o último
        // índice — por isso a condição é "i < numeros.length" e não
        // "i <= numeros.length".
        for (int i = 0; i < numeros.length; i++) {
            // Como temos o índice i, podemos mostrar tanto a posição
            // quanto o valor guardado nela.
            System.out.println("Posição " + i + " -> valor " + numeros[i]);
        }
    }

    /**
     * Percorre o vetor usando o {@code for-each} (for aprimorado),
     * disponível a partir do Java 5.
     *
     * <p>Essa forma é mais simples de ler quando não precisamos saber a
     * posição (índice) do elemento, apenas o seu valor. Por baixo dos
     * panos, o Java ainda percorre o vetor posição por posição — a
     * complexidade continua sendo O(n), só a sintaxe muda.</p>
     */
    public void percorrerComForEach() {
        System.out.println("\n--- Percorrer com for-each (sem índice) ---");

        // "int numero : numeros" lê-se "para cada 'numero' dentro de
        // 'numeros'". A cada volta do laço, a variável "numero" recebe
        // uma CÓPIA do valor da posição atual do vetor — por isso não é
        // possível usar o for-each para alterar o conteúdo original do
        // vetor (alterar "numero" aqui não muda "numeros").
        for (int numero : numeros) {
            System.out.println("Valor: " + numero);
        }
    }

    /**
     * Percorre o vetor usando um laço {@code while}, controlando o
     * índice manualmente.
     *
     * <p>Faz o mesmo trabalho do {@code for} tradicional, mas separa a
     * inicialização, a condição e o incremento em linhas diferentes.
     * Útil para reforçar que o {@code for} nada mais é do que um
     * {@code while} com essas três partes organizadas em uma única
     * linha.</p>
     */
    public void percorrerComWhile() {
        System.out.println("\n--- Percorrer com while ---");

        // Inicialização do índice, feita ANTES do laço (equivalente à
        // primeira parte do "for (int i = 0; ...)").
        int i = 0;

        // Condição de parada: o laço continua enquanto i for um índice
        // válido do vetor (equivalente à segunda parte do for).
        while (i < numeros.length) {
            System.out.println("Posição " + i + " -> valor " + numeros[i]);

            // Incremento manual do índice — se esquecêssemos esta
            // linha, o laço nunca terminaria (loop infinito), pois i
            // nunca deixaria de ser menor que numeros.length.
            i++;
        }
    }

    /**
     * Executa, em sequência, as três formas de percorrer o vetor
     * demonstradas nesta classe.
     */
    public void demonstrarTodos() {
        percorrerComForTradicional();
        percorrerComForEach();
        percorrerComWhile();
    }
}