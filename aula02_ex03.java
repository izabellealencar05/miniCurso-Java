/*Criem um programa que recebe o número X e se o número não for  10 ele vai transformá lo em 10*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor de X: ");
        int x = scanner.nextInt();
        if (x != 10){
            x = 10;
            System.out.printf("%d", x);
        } else {
            System.out.print("o numero e 10");
        }
        scanner.close();
        }
    }

