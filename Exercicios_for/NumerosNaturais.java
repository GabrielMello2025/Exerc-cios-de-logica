package Exercicios_for;

import java.util.Scanner;

public class NumerosNaturais {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        System.out.println("\n**********************************");
        System.out.println("*                                *");
        System.out.println("*    LEITOR DE VALOR INTEIRO     *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        
        System.out.print("\nDigite um numero natural: ");
        int numero = ler.nextInt();

        for (int  i = 1 ; numero >= i ; i ++){
            System.out.println(i);
        }
        ler.close();
    }
}
