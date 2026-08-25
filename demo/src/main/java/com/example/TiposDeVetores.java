package com.example;

public class TiposDeVetores {

    /**
     * Demonstra um vetor de {@code int} (tipo primitivo numérico
     * inteiro). Valor padrão de cada posição não preenchida: {@code 0}.
     */
    public void vetorDeInteiros() {
        System.out.println("\n--- Vetor de int ---");

        // Vetor de 3 posições, sem valores explícitos: cada posição
        // recebe o valor padrão do tipo int, que é 0.
        int[] idades = new int[3];
        System.out.println("Antes de preencher: idades[0] = " + idades[0]);

        // Preenchendo manualmente, posição por posição.
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 42;

        for (int i = 0; i < idades.length; i++) {
            System.out.println("idades[" + i + "] = " + idades[i]);
        }
    }

    /**
     * Demonstra um vetor de {@code double} (tipo primitivo numérico
     * decimal). Valor padrão de cada posição não preenchida:
     * {@code 0.0}.
     */
    public void vetorDeDecimais() {
        System.out.println("\n--- Vetor de double ---");

        double[] precos = {9.90, 19.99, 100.0};

        for (int i = 0; i < precos.length; i++) {
            System.out.println("precos[" + i + "] = " + precos[i]);
        }
    }

    /**
     * Demonstra um vetor de {@code boolean} (tipo primitivo lógico).
     * Valor padrão de cada posição não preenchida: {@code false}.
     */
    public void vetorDeBooleanos() {
        System.out.println("\n--- Vetor de boolean ---");

        // Vetor de 4 posições sem valores explícitos: todas começam
        // como "false", o valor padrão do tipo boolean.
        boolean[] presencas = new boolean[4];
        System.out.println("Antes de preencher: presencas[0] = " + presencas[0]);

        presencas[0] = true;
        presencas[1] = false;
        presencas[2] = true;
        presencas[3] = true;

        for (int i = 0; i < presencas.length; i++) {
            System.out.println("presencas[" + i + "] = " + presencas[i]);
        }
    }

    /**
     * Demonstra um vetor de {@code char} (tipo primitivo de caractere
     * único). Valor padrão de cada posição não preenchida: o caractere
     * nulo {@code ''} (invisível ao imprimir).
     */
    public void vetorDeCaracteres() {
        System.out.println("\n--- Vetor de char ---");

        char[] letras = {'j', 'a', 'v', 'a'};

        for (int i = 0; i < letras.length; i++) {
            System.out.println("letras[" + i + "] = " + letras[i]);
        }
    }

    /**
     * Demonstra um vetor de {@code String}. Diferente dos tipos
     * primitivos, {@code String} é um tipo referência (objeto); por
     * isso o valor padrão de cada posição não preenchida é {@code null}
     * (ausência de objeto), e não uma string vazia {@code ""}.
     */
    public void vetorDeTextos() {
        System.out.println("\n--- Vetor de String ---");

        // Vetor de 2 posições sem valores explícitos: como String é um
        // tipo referência, o valor padrão é null, não "" (string vazia).
        String[] nomesVazios = new String[2];
        System.out.println("Antes de preencher: nomesVazios[0] = " + nomesVazios[0]);

        String[] nomes = {"Ana", "Bruno", "Carla"};

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nomes[" + i + "] = " + nomes[i]);
        }
    }

    /**
     * Executa, em sequência, todas as demonstrações de tipos de vetores
     * desta classe.
     */
    public void demonstrarTodos() {
        vetorDeInteiros();
        vetorDeDecimais();
        vetorDeBooleanos();
        vetorDeCaracteres();
        vetorDeTextos();
    }
}