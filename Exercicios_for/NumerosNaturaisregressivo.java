package Exercicios_for;

import java.util.Scanner;

public class NumerosNaturaisregressivo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("\n**********************************");
        System.out.println("*                                *");
        System.out.println("*   LEITOR DE VALOR REGRESSIVO   *");
        System.out.println("*                                *");
        System.out.println("**********************************");
        
        System.out.print("\nDigite um valor natural: ");
        int numero = ler.nextInt();

        for (int i = numero ; i>=1  ; i --){
        System.out.println(i);
        ler.close();
    }
} 
        
}
