/*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
faça uma função que calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.(1SM=R$788,00)*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       double salmin = 788.00;
       System.out.println("qual o seu salario: ");
       double salario = scanner.nextDouble();
       double qnts = salario/salmin;
       System.out.printf("seu salario possui %.1f salarios minimos", qnts);
       scanner.close();
   }
}

