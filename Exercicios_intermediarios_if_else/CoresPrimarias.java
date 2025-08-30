package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class CoresPrimarias {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String mensagem = "";

        System.out.println("\n******************************");
        System.out.println("*                            *");
        System.out.println("*       CORES PRIMARIAS      *");
        System.out.println("*                            *");
        System.out.println("******************************");

        System.out.println("Neste programa iremos fazer uma combinação de  duas cores primarias");
        System.out.println("E por fim iremos mostrar a cor resultante da junsão das duas cores.");
        System.out.println("Precione ENTER para indicar as cores ");
        ler.nextLine();

        System.out.println("Digite as cores");
        
        System.out.println();
        String cor1 = ler.nextLine();
        
        System.out.println();
        String cor2 = ler.nextLine();

        if (cor1.equals("Vermelho") && cor2.equals("Azul")) {
            mensagem = "A combinação das cores é: Roxo";
        }
        else if (cor1.equals("Vermelho") && cor2.equals("Amarelo")) {
            mensagem = "A combinação de cores é: Amarelo";
        }
        else if (cor1.equals("Amarelo") && cor2.equals("Azul")) {
            mensagem = "A combinação de cores é: Verde";
        }
        else {
            mensagem = "A combinação das cores é: Apenas cores primárias são aceitas";
        }
        
        System.out.println(mensagem);
        ler.close();
    }

