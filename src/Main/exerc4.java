package Main;

import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        int[][] matrizA = new int[3][4];
        int[][] matrizB = new int[3][4];
        int[][] matrizSubtracao = new int[3][4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores da matriz A: ");
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 4; c++){
                System.out.println("Elemento [" + l + "][" + c + "]: ");
                matrizA[l][c] = scanner.nextInt();
            }
        }
        System.out.println("Digite os valores da matriz B: ");
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 4; c++){
                System.out.println("Elemento [" + l + "][" + c + "]: ");
                matrizB[l][c] = scanner.nextInt();
            }
        }
        // subtração das matrizes
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 4; c++){
                matrizSubtracao[l][c] = matrizA[l][c] - matrizB[l][c];
            }
        }
        System.out.println("Resultado da subtração das matrizes: ");
        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 4; c++){
                System.out.print(matrizSubtracao[l][c] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
