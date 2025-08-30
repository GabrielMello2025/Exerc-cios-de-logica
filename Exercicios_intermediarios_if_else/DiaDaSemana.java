package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dia = 0;
        String mensagem = "";
        System.out.println("\n****************************");
        System.out.println("*                          *");
        System.out.println("*       DIA DA SEMANA      *");
        System.out.println("*                          *");
        System.out.println("****************************\n");

       System.out.println("Digite o numero do dia: ");
       dia = ler.nextInt();
       
        if (dia == 0) {
            mensagem = "Domingo";
        }
        else if (dia == 1) {
            mensagem = "Sengunda";
        }
        else if (dia == 2) {
            mensagem = "Terça feira";
        }
        else if (dia == 3) {
            mensagem = "Quarta feira";
        }
        else if (dia == 4 ) {
            mensagem = "Quinta feira";
        }
        else if (dia == 5 ) {
            mensagem = "Sexta feira";
        }
        else if (dia == 6) {
            mensagem = "Sábado";
        }
        else{
            mensagem = "Dia da semana invalido";
        }
        System.out.println(mensagem);
        ler.close();
    }
}
