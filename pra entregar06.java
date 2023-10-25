/*Fazer um programa que solicite 2 números e informe (usando função):
 a) A soma dos números;
 b) O produto do primeiro número pelo quadrado do segundo;
 c) O quadrado do primeiro número;
 f) O módulo do primeiro número.*/

package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static int soma(int x, int y) {
        return x +y;
    }
    public static int produto(int x, int y){
        return x * (y * y);
    }
    public static int quadrado(int x){
        return x * x;
    }
    public static int modulo(int x){
        if(x < 0){
            return -x;
        } else{
            return x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite o X: ");
        int x = scanner.nextInt();
        System.out.print("digite o Y: ");
        int y = scanner.nextInt();
        System.out.printf("a soma de %d com o %d e: %d\n", x, y,soma(x, y));
        System.out.printf("o produto de %d pelo quadrado de %d e : %d\n", x, y, produto(x, y));
        System.out.printf("o quadrado de %d e: %d\n",x, quadrado(x));
        System.out.printf("o modulo de %d e: %d\n", x, modulo(x));
        scanner.close();
        }
}
