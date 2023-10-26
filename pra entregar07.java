/*Elabore uma função que receba três notas de um aluno como parâmetro
e uma letra. Se a letra for ‘A’ / ‘a’, a função deve calcular a média
aritmética das notas do aluno; se a letra for ‘P’ / ‘p’, deverá calcular
a média ponderada, com pesos 5, 3 e 2, respectivamente com as notas 1, 2, 3.
Retorne a média calculada para o programa principal.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static double  aritmetica (double n1, double n2, double n3){
        return (n1 + n2 + n3)/3;
    }
    public static double ponderada (double n1, double n2, double n3){
        return (n1 * 5 + n2 * 3 + n3 * 2)/10;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("digite a nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("digite a nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("digite a nota 3: ");
        double n3 = scanner.nextDouble();
        System.out.print("digite 'a'/'A' para media aritmetica ou 'p'/'P' para media ponderada: ");
        char escolha =  scanner.next().charAt(0);

        if(escolha == 'a' || escolha == 'A'){
            System.out.printf("a media aritmetica das notas e: %.2f", aritmetica(n1, n2, n3));
        } else if(escolha == 'p' || escolha == 'P'){
            System.out.printf(" a media ponderada das notas e: %.2f", ponderada(n1, n2, n3));
        } else{
            System.out.println("opcao invalida");
        }
        scanner.close();
    }
}
