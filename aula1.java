
package main;

public class aula1_monitoria {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "mesa de escritorio";
        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medida = 53.234567;

        System.out.printf("%s cujo o preco e %2f%n",produto1,preco1);
        System.out.printf("%s cujo o preco e %2f%n",produto2,preco2);
        System.out.printf("Registro: %d, codigo: %d, e genero: %c%n",idade, codigo, genero);
        System.out.printf("medida com 8 casas decimais: %.8f%n", medida);
        System.out.printf("medida com 2 casas decimais: %.2f%n", medida);
    }
}
