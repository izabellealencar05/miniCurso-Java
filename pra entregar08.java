/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível
abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado
um novo código (até que seja válido). O programa será encerrado quando o código informado
for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
que abasteceram cada tipo de combustível, conforme exemplo.*/
package monitoria;
import java.util.Scanner;
import java.util.Locale;
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (escolha != 4) {
            System.out.println("===========Posto de Combustivel============");
            System.out.println("|   1 - Alcool                            |");
            System.out.println("|   2 - Gasolina                          |");
            System.out.println("|   3 - Diesel                            |");
            System.out.println("|   4 - sair                              |");
            System.out.println("===========================================");
            System.out.println("escolha uma opcao: ");
            escolha = scanner.nextInt();

            if (escolha < 1 || escolha > 4) {
                System.out.println("codigo invalido");
                continue;
            }

            switch (escolha){
                case 1:
                        alcool ++;
                        break;
                case 2:
                        gasolina++;
                        break;
                case 3:
                        diesel++;
                        break;
                case 4:
                    System.out.printf("foram %d clientes que abasteceram com alcool\n", alcool);
                    System.out.printf("foram %d clientes que abasteceram com gasolina\n", gasolina);
                    System.out.printf("foram %d clientes que abasteceram com diesel\n",  diesel);
                    System.out.println("muito obrigado!");
                    break;
            }
        }
        scanner.close();
    }
}

