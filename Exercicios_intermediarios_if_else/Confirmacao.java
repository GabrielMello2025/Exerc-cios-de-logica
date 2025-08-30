package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Confirmacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String mensagem = "";

        System.out.print("Digite o dia da confirmação do envio: ");
        int dia = ler.nextInt();
        System.out.print("Digite qual dia da semana:");
        int diaSemana = ler.nextInt();
        System.out.print("Digite o mês do envio:");
        int mes = ler.nextInt();
        System.out.print("Digite o ano do envio: ");
        int ano = ler.nextInt();

        if (diaSemana == 0 && mes == 1) {
            mensagem = "Enviado domingo, " + dia + " de janeiro de " + ano;
        }
        else {
            mensagem = "teste";
        }
        System.out.println(mensagem);
        ler.close();
    
    
    
    }
}
