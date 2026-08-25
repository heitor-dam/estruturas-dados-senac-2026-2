package com.example;

/**
 * Exercício prático simples que junta os conceitos revisados nas
 * classes anteriores ({@link DeclaracaoVetores}, {@link PercorrerVetores}
 * e {@link TiposDeVetores}): declarar um vetor pequeno, preenchê-lo,
 * percorrê-lo e extrair uma informação simples dele.
 *
 * Cenário: um vetor com as notas de 5 alunos. O programa mostra cada
 * nota com sua posição e conta quantos alunos foram aprovados
 * (nota maior ou igual a 6.0).
 *
 */
public class ArrayPratico {

    /**
     * Nota mínima para ser considerado aprovado neste exercício.
     */
    private static final double NOTA_DE_CORTE = 6.0;

    /**
     * Declara, preenche, percorre e resume um pequeno vetor de notas.
     */
    public void executar() {
        System.out.println("\n--- Arrayzinho: notas de 5 alunos ---");

        // Declaração + preenchimento em uma única linha, na forma
        // resumida (revisada em DeclaracaoVetores). O vetor tem
        // exatamente 5 posições, uma para cada aluno.
        double[] notas = {7.5, 4.0, 6.0, 9.8, 5.5};

        // contadorAprovados guarda quantos elementos do vetor
        // satisfazem a condição "nota >= NOTA_DE_CORTE". Começa em 0 e
        // vai sendo incrementado durante o percurso do vetor.
        int contadorAprovados = 0;

        // Percorremos o vetor com o for tradicional (revisado em
        // PercorrerVetores) porque, além do valor, também queremos
        // mostrar a posição (o "aluno número i") de cada nota.
        for (int i = 0; i < notas.length; i++) {
            double notaAtual = notas[i];

            // aprovado é true quando a nota do aluno atual atinge a
            // nota de corte; usamos esse booleano só para deixar a
            // mensagem impressa mais clara.
            boolean aprovado = notaAtual >= NOTA_DE_CORTE;

            System.out.println("Aluno " + i + " -> nota " + notaAtual
                    + (aprovado ? " (aprovado)" : " (reprovado)"));

            if (aprovado) {
                contadorAprovados++;
            }
        }

        System.out.println("Total de alunos: " + notas.length);
        System.out.println("Total de aprovados: " + contadorAprovados);
    }
}