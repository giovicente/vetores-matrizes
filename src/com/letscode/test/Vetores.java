package com.letscode.test;

import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        System.out.println("*** PERCORRENDO COM FOR EACH ***");

        String[] disciplinas = {"POO", "Spring", "Algoritmos", "TDD"};

        for (String disciplina : disciplinas) {
            System.out.println(disciplina);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** INICIANDO TRATAMENTOS COM VETORES ***");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine(); // "Giovanni"

        char[] caracteresNome = nome.toCharArray(); // {'G', 'i','o'...}

        // Giovanni -> GOAN

        System.out.println("*** PALAVRA ESTILIZADA ***");

        String palavraEstilizada = "";

        for (int i = 0; i < caracteresNome.length; i++) {

            if (i % 2 == 0) {
                palavraEstilizada += Character.toUpperCase(caracteresNome[i]);
            }
        }

        System.out.println(palavraEstilizada);

        System.out.println("*** PALÍNDROMOS ***");

        String palavraAoContrario =  "";
        for (int i = caracteresNome.length - 1; i >= 0; i--) {
            palavraAoContrario += caracteresNome[i];
        }

        if (nome.equalsIgnoreCase(palavraAoContrario)) {
            System.out.printf("A palavra %s É um palíndromo!%n", nome);
        } else {
            System.out.printf("A palavra %s NÃO É um palíndromo!%n", nome);
        }
    }
}
