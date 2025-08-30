package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class FaixaDeIdadeVoto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("==== FAIXA ETÁRIA PARA VOTO ====");

        String mensagem = "";
        
        System.out.println("Digite sua idade:");
        int idade = ler.nextInt();

        if (idade <= 0 ) {
            mensagem = "Idade invalida!";
        }
        else if (idade < 16) {
            mensagem = "Não vota!";
        }
        else if (idade <= 17 || idade > 70) {
            mensagem= "Voto facultativo!";
        }
        else if (idade <= 70) {
            mensagem = "Voto obrigatorio!";
        }
        else{

        }
        System.out.println(mensagem);
        ler.close();
    }
}
