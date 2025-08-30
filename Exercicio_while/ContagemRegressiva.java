package Exercicio_while;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("\n***********************************");
        System.out.println("*                                 *");
        System.out.println("*        CONTAGEM REGRESSIVA      *");
        System.out.println("*                                 *");
        System.out.println("***********************************");

        System.out.print("\nDigite um numero inteiro positivo: ");
        int numero = ler.nextInt();

        while (numero > 0) {
            numero --;
            System.out.println(numero);            
        }
        ler.close();
    }
}
