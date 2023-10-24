/*Fazer um programa que leia três valores com ponto flutuante de dupla
precisão: A, B e C. Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159).
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */
package main;
import java.util.Scanner;

public class aula1_monitoria {
    public static void main(String[] args) {
        double a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de c: ");
        c = sc.nextDouble();

        double triangulo = (a * c) / 2.0;
        double circulo = 3.14159 * (c * c);
        double trapezio = ((a + b) * c) / 2.0;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("A area do triangulo e: %.2f%n", triangulo);
        System.out.printf("A area do circulo e: %.2f%n", circulo);
        System.out.printf("A area do trapezio e: %.2f%n", trapezio);
        System.out.printf("A area do quadrado e: %.2f%n", quadrado);
        System.out.printf("A area do retangulo e: %.2f%n", retangulo);

        sc.close();
    }
}
