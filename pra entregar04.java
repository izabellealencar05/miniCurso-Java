/*Leia 2 valores com uma casa decimal (x e y), que devem representar as
coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence
o ponto, ou se está sobre um dos eixos cartesianos ou na origem  (x = y = 0). Se o ponto estiver
na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos eixos escreva “Eixo X”
ou “Eixo Y”, conforme for a situação.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.printf("digite o x: ");
        double x = scanner.nextDouble();
        System.out.printf("digite o y: ");
        double y = scanner.nextDouble();

        if (x == 0 && y == 0){
            System.out.println("origem");
        } else if (x > 0 && y > 0){
            System.out.println("quadrante 1");
        } else if (x < 0 && y > 0){
            System.out.println("quadrante 2");
        } else if (x < 0 && y < 0){
            System.out.println("quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("quadrante 4");
        } else if (x == 0){
            System.out.println("eixo Y");
        } else if (y == 0){
            System.out.println("eixo X");
        }
        scanner.close();
    }
}
