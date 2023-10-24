/*Escreva um algoritmo que solicita ao usuário dois operandos e um código
de operação (1 - Soma, 2 - Subtração, 3 - Divisão ou 4 - Multiplicação) e
realiza a operação correspondente sobre os operandos fornecidos pelo usuário:*/

package monitoria;
import java.util.Scanner;
public class aula2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite um numero: ");
        double x = scanner.nextDouble();
        System.out.print("digite outro numero: ");
        double y = scanner.nextDouble();

        double sub = x - y;
        double div = x / y;
        double mult = x * y;
        double soma = x + y;

        System.out.println("============MENU==========");
        System.out.println("|    1 - soma            |");
        System.out.println("|    2 - subtracao       |");
        System.out.println("|    3 - multiplicacao   |");
        System.out.println("|    4 - divisao         |");
        System.out.println("==========================");

        System.out.print("escolha uma opcao: ");
        int op = scanner.nextInt();

        if (op == 1){
            System.out.printf("a soma dos numeros digitados e: %.2f%n ", soma);
        } else if (op == 2){
            System.out.printf("a subtracao dos numeros digitados e: %.2f%n ", sub);
        } else if(op == 3){
            System.out.printf("a multiplicacao dos numeros digitados e: %.2f%n ", mult);
        } else if (op == 4){
            System.out.printf("a divisao dos numeros digitados e: %.2f%n ", div);
        } else {
            System.out.print("opcao invalida");
        }
        scanner.close();
    }

}
