package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class CompraDeIngressos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String ingresso = "";
        double valorFinal = 0;
        int quantidade = 0;

        System.out.println("****************************");
        System.out.println("*                          *");
        System.out.println("*   INGRESSOS DE CINEMA    *");
        System.out.println("*                          *");
        System.out.println("****************************");

        System.out.print("Digite qual sera o ingresso (inteira ou meia): ");
        ingresso = ler.nextLine();

        System.out.print("Digite a quantidade de ingressos: ");
        quantidade = ler.nextInt();

        if (ingresso.equals("inteira")) {
            valorFinal = quantidade * 28.50;
            System.out.printf("o total a pagar é : R$ %.2f%n", valorFinal);
        } else if (ingresso.equals("meia")) {
            valorFinal = quantidade * 14.25;
            System.out.printf("o total a pagar é : R$ %.2f%n ", valorFinal);
        } 
        else{

        }

        ler.close();
    }
}
