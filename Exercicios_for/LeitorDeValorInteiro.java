package Exercicios_for;

import java.util.Scanner;

public class LeitorDeValorInteiro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        System.out.println("\n**********************************");
        System.out.println("*                                *");
        System.out.println("*    LEITOR DE VALOR INTEIRO     *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        
        System.out.print("\nDigite um numero inteiro: ");
        int numero = ler.nextInt();

        for ( i = 1 ; i <= numero; i ++){
            if ( i % 2 != 0) {
                System.out.println(i);
                
            }
                
        }
        
        ler.close();

    }
}
