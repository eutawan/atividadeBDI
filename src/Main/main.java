package Main;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        preencherMatriz(matriz);
        imprimirMatriz(matriz);
        int soma = calcularSoma(matriz);
        System.out.println("Soma de todos os elementos: " + soma);
        int[] maiorEMenorDiagonal = encontrarMaiorEMenorDiagonal(matriz);
        System.out.println("Maior valor na diagonal principal: " + maiorEMenorDiagonal[0]);
        System.out.println("Menor valor na diagonal principal: " + maiorEMenorDiagonal[1]);
    }

    public static void preencherMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }

    public static int[] encontrarMaiorEMenorDiagonal(int[][] matriz) {
        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] > maior) {
                maior = matriz[i][i];
            }
            if (matriz[i][i] < menor) {
                menor = matriz[i][i];
            }
        }
        return new int[]{maior, menor};
    }
}





