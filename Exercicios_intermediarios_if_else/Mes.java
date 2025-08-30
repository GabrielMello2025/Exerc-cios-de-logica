package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Mes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String mensagem = "";

        System.out.println("\n****************************");
        System.out.println("*                          *");
        System.out.println("*        CALENDARIO        *");
        System.out.println("*                          *");
        System.out.println("****************************\n");

        System.out.print("Digite o mes: ");
        int mes = ler.nextInt();

        if (mes == 1) {
            mensagem = "Janeiro";
        }
        else if (mes == 2) {
            mensagem = "Fevereiro";
        }
        else if (mes == 3) {
            mensagem = "Março";
        }
        else if (mes == 4) {
            mensagem = "Abril";
        }
        else if (mes == 5) {
            mensagem = "Maio";
        }
        else if (mes == 6) {
            mensagem = "Junho";
        }
        else if (mes == 7) {
            mensagem = "Julho";
        }
        else if (mes == 8) {
            mensagem = "Agosto";
        }
        else if (mes == 9) {
            mensagem = "Setembro";
        }
        else if (mes == 10) {
            mensagem = "Outubro";
        }
        else if (mes == 11) {
            mensagem = "Novembro";
        }
        else if (mes == 12) {
            mensagem = "Dezembro";
        }
        else{
            mensagem = "Mensagem invalida";
        }
        System.out.println(mensagem);
        ler.close();

    }
}
