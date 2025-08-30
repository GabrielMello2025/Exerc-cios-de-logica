package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String mensagem = "";
        System.out.println("\n*****************************");
        System.out.println("*                           *");
        System.out.println("*        TEMPERATURA        *");
        System.out.println("*                           *");
        System.out.println("*****************************\n");

        System.out.print("Digite a sua temperatura: ");
        double temperatura = ler.nextDouble();

        if (temperatura < 36) {
            mensagem = "A Situação para sua temperatura é Hipotermia";
        }
        else if (temperatura <= 37.5) {
            mensagem = "A situação para sua temperatura é Normal";
        }
        else if (temperatura <= 39.5) {
            mensagem = "A situação para sua temperatura é Febre";
        }
        else if (temperatura <= 40) {
            mensagem = "A situação para sua temperatura é Febre Alta";
        }
        else {
            mensagem = "A situação para sua temperatura é Hipertermia";
        }
        System.out.println(mensagem);
        ler.close();
    }

}
