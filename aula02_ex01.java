/*crie um algoritmo que verifica se um numero e par ou impar*/
package app;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite um numero: ");
        x = sc.nextDouble();
        if (x % 2 == 0) {
            System.out.printf("o numero %.2f e par", x);
        } else{
            System.out.printf("o numero %.2f e impar", x);
        }
    }
}
