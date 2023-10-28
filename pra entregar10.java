/*Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
Fórmula: = 9C / 5 + 32*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        char escolha;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("quer transformar a temperatura em Celsius ou Fahrenheit?(c/f): ");
            char temp = scanner.next().charAt(0);
            if (temp == 'c' || temp == 'C') {
                System.out.print("digite a temperatura em celsius: ");
                double celsius = scanner.nextDouble();
                System.out.printf("a conversao para fahrenheit e: %.1f\n", (celsius * 1.8) + 32);
            } else if (temp == 'f' || temp == 'F') {
                System.out.print("digite a temperatura em fahrenheit: ");
                double fah = scanner.nextDouble();
                System.out.printf("a conversao para celsius e: %.1f\n", (fah - 32) / 1.8);
            }
            System.out.print("deseja continuar convertendo?(s/n): ");
            escolha = scanner.next().charAt(0);
        } while (escolha == 's' || escolha == 'S');

            scanner.close();
        }
    }

