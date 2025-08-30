package Exercicio_while;

import java.util.Scanner;

public class SenhaCorreta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int senha = 0;

        System.out.println("\n***********************************");
        System.out.println("*                                 *");
        System.out.println("*        VALIDADOR DE SENHA       *");
        System.out.println("*                                 *");
        System.out.println("***********************************");

        while (senha != 2002) {

            System.out.print("\nDigite uma senha numerica de ate quatro digitos: ");
            senha = ler.nextInt();
            if (senha != 2002) {
                System.out.println("semha invalida");
            }
        }

        System.out.println("ACESSO PERMITIDO");
        ler.close();
    }
}