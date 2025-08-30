package Exercicio_while;

import java.util.Scanner;

public class ContadorSimples {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n***************************");  
        System.out.println("*                         *");
        System.out.println("*     CONTADOR SIMPLES    *");
        System.out.println("*                         *");
        System.out.println("***************************");

        System.out.print("\nDigite um numero inteiro positivo: ");
        int numero = ler.nextInt();

        while (numero > 1 ) { 
            numero --;
             System.out.println(numero);
        }
        ler.close();
    }
}
