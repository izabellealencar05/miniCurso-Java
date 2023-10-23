/*Faça um código que calcule a área de um trapézio e mostre o resultado
com duas casas decimais. */
package main;

public class aula1_monitoria {
    public static void main(String[] args) {
        double basemenor = 4.9;
        double basemaior = 7.5;
        double altura = 6.2;
        double area = ((basemenor + basemaior) * altura)/2;
        System.out.printf("a area do trapezio e: %.2f%n", area);

    }
}
