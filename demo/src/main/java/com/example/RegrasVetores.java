package com.example;

public class RegrasVetores {

    /**
     * Demonstra a regra da homogeneidade: todos os elementos de um vetor
     * devem ser do mesmo tipo declarado.
     */
    public void regraDoTipoUnico() {
        System.out.println("\n--- Regra 1: um vetor só aceita um tipo ---");

        // Válido: todos os elementos são int.
        int[] idades = {15, 20, 42};
        System.out.println("Vetor válido (só int): idades[0] = " + idades[0]);

        // INVÁLIDO — não compila. Deixado como comentário de propósito:
        // int[] misturado = {15, "vinte", 42}; // erro de compilação:
        // "vinte" é String, não int. O compilador exige que TODO
        // elemento entre as chaves seja compatível com o tipo do vetor.
        //
        // O motivo é de baixo nível: um vetor é um bloco de memória
        // contíguo onde cada posição ocupa sempre o MESMO número de
        // bytes (ex.: 4 bytes para cada int). Se pudéssemos misturar
        // tipos, o Java não saberia quantos bytes reservar para cada
        // posição nem como interpretar o valor armazenado nela.

        System.out.println("Tentar misturar tipos no mesmo vetor primitivo " +
                "gera erro de compilação (veja o comentário no código-fonte).");
    }

    /**
     * Demonstra a "exceção aparente" à regra de tipo único: um vetor de
     * {@code Object} pode guardar qualquer tipo de objeto, mas isso NÃO
     * quebra a regra de homogeneidade — o tipo declarado do vetor
     * continua sendo único ({@code Object}), só que agora "Object" é um
     * tipo genérico que qualquer objeto satisfaz.
     */
    public void excecaoAparenteComObject() {
        System.out.println("\n--- Vetor de Object: mistura aparente, mas com custo ---");

        // Isto compila: um vetor de Object aceita qualquer tipo de
        // objeto, pois em Java todo tipo referência "é um" Object.
        Object[] misturado = {10, "vinte", 3.14, true};

        for (int i = 0; i < misturado.length; i++) {
            System.out.println("misturado[" + i + "] = " + misturado[i]
                    + " (tipo real: " + misturado[i].getClass().getSimpleName() + ")");
        }

        // O custo dessa flexibilidade: para USAR o valor com o tipo
        // original, é preciso fazer um "cast" explícito, e se o tipo
        // estiver errado, o programa quebra em tempo de EXECUÇÃO (e não
        // em tempo de compilação, que seria mais seguro):
        //
        //     String texto = (String) misturado[0]; // ClassCastException!
        //     (misturado[0] é um Integer, não um String)
        //
        // Por isso, para iniciantes, a recomendação é sempre usar
        // vetores do tipo específico (int[], String[], etc.) e evitar
        // Object[] até entender bem sobre herança e polimorfismo.
    }

    /**
     * Demonstra a regra do tamanho fixo: depois de criado, um vetor não
     * pode crescer nem encolher.
     */
    public void regraDoTamanhoFixo() {
        System.out.println("\n--- Regra 2: o tamanho do vetor é fixo ---");

        int[] numeros = new int[3];
        System.out.println("Vetor criado com tamanho fixo: " + numeros.length);

        // INVÁLIDO — não existe, em Java, uma forma de "adicionar" uma
        // quarta posição a este mesmo vetor. O comando abaixo não
        // existe na linguagem:
        //
        //     numeros.add(40); // erro: vetores não têm método add()
        //
        // A única forma de "crescer" é criar um vetor NOVO, maior, e
        // copiar os valores antigos para dentro dele — é exatamente
        // isso que estruturas como o ArrayList fazem por baixo dos
        // panos, de forma automática.
        int[] numerosMaior = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            numerosMaior[i] = numeros[i];
        }
        numerosMaior[3] = 40;

        System.out.println("Vetor \"antigo\" continua com tamanho: " + numeros.length);
        System.out.println("Vetor NOVO, criado por cópia, tem tamanho: " + numerosMaior.length);
    }

    /**
     * Executa, em sequência, todas as demonstrações de regras desta
     * classe.
     */
    public void demonstrarTodos() {
        regraDoTipoUnico();
        excecaoAparenteComObject();
        regraDoTamanhoFixo();
    }
}