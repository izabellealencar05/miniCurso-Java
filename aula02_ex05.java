/*O professor aplicou a avaliação em sua turma e deseja mostrar se o aluno foi aprovado (nota maior ou igual a 5) ou reprovado(nota 
 *menor que 5). Desenvolva o programa que leia a nota do aluno e gere a tela de saída com as informações solicitadas.*/

package aula;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("digite sua nota: ");
		double nota = scanner.nextDouble();
		
		if (nota >= 5 && nota < 10) {
			System.out.print("voce foi aprovado!");
		} else if (nota < 5 && nota > 0) {
			System.out.print("vode foi reprovado");
		} else {
			System.out.print("nota invalida");
		}
		scanner.close();
	}
}
