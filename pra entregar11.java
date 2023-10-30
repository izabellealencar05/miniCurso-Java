/*Crie uma matriz 3x3 de inteiros, preencha a matriz e verifique se a matriz é um
quadrado mágico. Diz-se que uma matriz é um quadrado mágico quando a soma de todas
as suas linhas, todas as suas colunas, sua diagonal principal e sua diagonal secundária
resultam no mesmo valor.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][]matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite um número: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
        boolean quadradoMagico = verificaQuadradoMagico(matriz);
        if (quadradoMagico) {
            System.out.println("A matriz é um quadrado mágico!");
        } else {
            System.out.println("A matriz não é um quadrado mágico.");
        }
        scanner.close();
        }
    public static boolean verificaQuadradoMagico(int[][] matriz) {
        int somaReferencia = 0;
        for (int i = 0; i < 3; i++) {
            somaReferencia += matriz[0][i];
        }

        for (int i = 1; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            if (somaLinha != somaReferencia) {
                return false;
            }
        }

        for (int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna != somaReferencia) {
                return false;
            }
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        if (somaDiagonalPrincipal != somaReferencia) {
            return false;
        }

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }
        if (somaDiagonalSecundaria != somaReferencia) {
            return false;
        }

        return true;
    }
}

