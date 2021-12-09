package com.letscode.test;

public class Matrizes {

    public static void main(String[] args) {

        System.out.println("*-----------------------------------------------*");

        // Atribuindo valores manualmente na matriz
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.print("\n");
        }

        System.out.println("*-----------------------------------------------*");

        /**
         * @Author: Welder Askowiks Fagundes --- Obrigado pela ajuda! ---
         *
         * Atribuindo valores na matriz conforme vamos percorrendo-a
         * No primeiro for, percorremos a quantidade de linhas de matriz
         * No segundo for, percorremos a quantidade de colunas
         * Para cada iteração, atribuímos a soma da linha atual + coluna atual nas coordenadas da matriz
         * */
        int[][] matriz = new int[8][5];

        System.out.println("Quantidade de linhas da matriz: " + matriz.length);
        System.out.println("Quantidade de colunas da matriz: " + matriz[0].length);

        System.out.println("*-----------------------------------------------*");

        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz[linha][coluna] = coluna + linha; //valor a ser atribuido dentro de cada posição da Matriz
                System.out.print("|" + matriz[linha][coluna]);
            }
            System.out.print("|\n");
        }

        System.out.println("*-----------------------------------------------*");

        // Montando um tabuleiro de jogo da velha utilizando for each (operador : )
        char[][] tabuleiro = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };

        for (char[] linha : tabuleiro) {
            for (char posicao : linha) {
                System.out.print(posicao);
            }

            System.out.println();
        }

        System.out.println("*-----------------------------------------------*");
    }
}
