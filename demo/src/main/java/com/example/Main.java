package com.example;

public class Main {
    public static void main(String[] args) {
        AnaliseComplexidade analise = new AnaliseComplexidade();
        analise.demonstrarTodos();
        
        DeclaracaoVetores declaracaoVetores = new DeclaracaoVetores();
        declaracaoVetores.demonstrarTodos();

        PercorrerVetores percorrerVetores = new PercorrerVetores();
        percorrerVetores.demonstrarTodos();

        TiposDeVetores tiposDeVetores = new TiposDeVetores();
        tiposDeVetores.demonstrarTodos();

        RegrasVetores regrasVetores = new RegrasVetores();
        regrasVetores.demonstrarTodos();

        ArrayPratico arrayPratico = new ArrayPratico();
        arrayPratico.executar();
    }
}