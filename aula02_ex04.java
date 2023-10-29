/*Cria um Algoritmo que verifica se um número é PAR ou IMPAR:*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o valor de X: ");
        int x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.print("o numero e par");
        } else {
            System.out.print("o numero e impar");
        }
        scanner.close();
        }
    }

