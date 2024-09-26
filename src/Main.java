import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        System.out.println("Bem vindo ao calculado PAR OU ÍMPAR");

        //
        Scanner parImpar = new Scanner(System.in);

        // FAZENDO O USUÁRIO ESCOLHER O VALOR
        System.out.println("Informe um número[INTEIRO]: ");
        int numero = parImpar.nextInt();

        // CALCULANDO A PARIDADE DO NÚMERO, ATRAVÉS DA PROPRIEDADE MÓDULO
        int calculo = numero % 2;

        if (calculo == 0){
            System.out.println("O número " + numero + " é par!");
        } else {
            System.out.println("O número " + numero + " é impar!");
        }
    }
}
