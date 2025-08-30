package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class ViagemBaseTempo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nCLASSIFICAÇÃO COM BASE NO TEMPO");
       
        String mensagem = "";
       
        System.out.print("\nDigite quantas horas sera a viagem:");
        double horas = ler.nextDouble();

       if (horas <= 00.00) {
        mensagem = "TEMPO INVALIDO";
       }

        else if (horas <= 01.00) {
            mensagem = "VIAGEM CURTA";
        }
        else if (horas <= 04.00) {
            mensagem = "VIAGEM MEDIA";
        }
        else if (horas <= 08.00) {
            mensagem = "VIAGEM LONGA";
        }
        else{
            mensagem = "VIAGEM MUITO LONGA";
        }
        System.out.println(mensagem);
        ler.close();
    }
}
