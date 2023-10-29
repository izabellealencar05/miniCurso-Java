/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número
e o salário do funcionário, com duas casas decimais.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("qual o numero do funcionario? ");
        int num = scanner.nextInt();
        System.out.print("quantas horas trabalha? ");
        int horas = scanner.nextInt();
        System.out.print("quanto ganha por hora? ");
        double valor = scanner.nextDouble();
        System.out.println("funcionario: " + num);
        System.out.printf("salario: %.2f", horas * valor);
        scanner.close();
        }
    }

