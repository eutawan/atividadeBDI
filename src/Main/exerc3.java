package Main;

import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        int[][] matrizA = new int[5][5];
        int[][] matrizB = new int[5][5];
        int[][] matrizSoma = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz A: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Digite os valores da matriz B: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }
        // soma das matrizes
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < 5; j ++){
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Resultado da soma das matrizes A e B: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
