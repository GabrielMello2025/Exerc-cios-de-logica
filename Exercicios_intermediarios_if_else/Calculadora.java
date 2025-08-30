package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double calculo = 0.0;
        String mensagem = "";

        System.out.println("\n******************************");
        System.out.println("*                            *");
        System.out.println("*         CALCULADORA        *");
        System.out.println("*                            *");
        System.out.println("******************************");

        System.out.println("olá usuario, a calculadora suporta apenas as operações abaixo");
        System.out.println("Sendo elas: (Soma / Subtracao / multiplicacao / Divisao / Resto Da Divisao / Potencia)");
        System.out.println("Precione ENTER para dar inicio á operação");
        ler.nextLine();
        System.out.println("Digite os dois valores:");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.print("");
        double valor2 = ler.nextDouble();
        ler.nextLine();

        System.out.println("\nDigite qual operação:");
        String operacao = ler.nextLine();

        if (operacao.equalsIgnoreCase("soma")) {
            calculo = valor1 + valor2;
            mensagem = "Resultado é: " + calculo;
        } else if (operacao.equalsIgnoreCase("Subtracao")) {
            calculo = valor1 - valor2;
            mensagem = "Resultado é: " + calculo;
        } else if (operacao.equalsIgnoreCase("Multiplicacao")) {
            calculo = valor1 * valor2;
            mensagem = "Resultado é: " + calculo;
        } else if (operacao.equalsIgnoreCase("Divisao")) {
            calculo = valor1 / valor2;
            mensagem = "Resultado é: " + calculo;
        } else if (operacao.equalsIgnoreCase("Resto da divisao")) {
            calculo = valor1 % valor2;
            mensagem = "Resultado é: " + calculo;
        } else if (operacao.equalsIgnoreCase("Potencia")) {                                                                  
            calculo = Math.pow(valor1, valor2);
            mensagem = "Resultado é: " + calculo;
        } else {
            mensagem = "Operação nao suportada";
        }

        System.out.println(mensagem);
        ler.close();

    }
}
