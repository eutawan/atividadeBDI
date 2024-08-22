package Main;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();

        System.out.println("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("Digite os valores da matriz: ");
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                System.out.print("Valor para a posição [" + l + "][" + c + "]: ");
                matriz[l][c] = scanner.nextInt();
            }
        }
        int[][] transposta = new int[colunas][linhas];
        for (int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                transposta[c][l] = matriz[l][c];
            }
        }
        System.out.println("Matriz transposta:");
        for (int l = 0; l < colunas; l++){
            for (int c = 0; c < linhas; c++){
                System.out.print(transposta[l][c] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
