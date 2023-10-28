/*Escreva um programa que receba uma string e remova todas as vogais. Informe ao usuário o resultado.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite uma palavra: ");
        String string = scanner.nextLine();
        string = string.replaceAll("[aeiouAEIOU]", "");
        System.out.printf("removendo as vogais: %s",string);

        scanner.close();
    }
}
