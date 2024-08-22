package Main;

import java.util.Scanner;

public class exerc2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas (n): ");
        int n = scanner.nextInt();
        System.out.print("Digite o número de colunas (m): ");
        int m = scanner.nextInt();

        int[][] matriz = new int[n][m];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        if (n == m) {
            if (isSimetrica(matriz)) {
                System.out.println("A matriz é simétrica.");
            } else {
                System.out.println("A matriz não é simétrica.");
            }

            if (isIdentidade(matriz)) {
                System.out.println("A matriz é identidade.");
            } else {
                System.out.println("A matriz não é identidade.");
            }
        } else {
            System.out.println("A matriz não é quadrada, portanto não pode ser simétrica nem identidade.");
        }

        System.out.println("Matriz Transposta:");
        int[][] transposta = calcularTransposta(matriz);
        imprimirMatriz(transposta);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isSimetrica(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isIdentidade(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                } else if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] calcularTransposta(int[][] matriz) {
        int[][] transposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        return transposta;
    }
}

