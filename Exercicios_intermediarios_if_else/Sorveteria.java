package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Sorveteria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double total = 0.0;

        System.out.println("\n****************************");
        System.out.println("*                          *");
        System.out.println("*        SORVETERIA        *");
        System.out.println("*                          *");
        System.out.println("****************************\n");

        System.out.println("Digite a quantidade de sorvete que você deseja: ");
        double quantidade = ler.nextDouble();

        if (quantidade <= 0) {
            System.out.println("Peso invalido");
        } 
        else if (quantidade >= 1000) {
            total = (quantidade * 3.0) / 100;
            System.out.printf("O total a pagar é: R$ %.2f%n", total);
        }
         else {
            total = (quantidade * 3.50) / 100;
            System.out.printf("O total a pagar é: R$ %.2f%n", total);
        }

        ler.close();
    }
}
