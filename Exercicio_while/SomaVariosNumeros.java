package Exercicio_while;

import java.util.Scanner;

public class SomaVariosNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int soma = 0;
        System.out.println("\n***********************************");
        System.out.println("*                                 *");
        System.out.println("*       SOMA DE VARIOS NUMEROS    *");
        System.out.println("*                                 *");
        System.out.println("***********************************");

        System.out.print("\nDigite um numero inteiro: ");
        int numero = ler.nextInt();

        while (numero != 0) {
            soma = soma + numero;
            System.out.print("");
            numero = ler.nextInt();
        }
        System.out.println("A soma dos numeros informados é : " +soma);
        ler.close();
    }
}
