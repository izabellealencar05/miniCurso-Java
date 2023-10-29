/*Criem um programa que recebe o número X e imprime se o número é maior que dois , menor que dois ou igual a dois*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor de X: ");
        int x = scanner.nextInt();

        if (x < 2){
            System.out.printf("%d e menor que 2", x);
        } else if (x > 2){
            System.out.printf("%d e maior que 2", x);
        } else if (x == 2){
            System.out.printf("%d e igual a 2", x);
        }
        scanner.close();
        }
    }

