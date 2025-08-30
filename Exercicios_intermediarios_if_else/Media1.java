package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double mediaFinal = 0.0;
        String mensagem = "";

        System.out.println("\n******************************");
        System.out.println("*                            *");
        System.out.println("*        CLASSIFICAÇÃO       *");
        System.out.println("*                            *");
        System.out.println("******************************");

        System.out.println("Aperte a tecla ENTER para informar as 3 notas e o numeros de faltas consecutivamente");
        ler.nextLine();
        System.out.println("Digite as 3 notas e por ultimo as faltas");
        double nota1 = ler.nextDouble();
        System.out.println();
        double nota2 = ler.nextDouble();
        System.out.println();
        double nota3 = ler.nextDouble();
        System.out.println();
        int faltas = ler.nextInt();

        mediaFinal = (nota1 + nota2 + nota3) / 3;

        if (faltas > 30) {
            mensagem = " Situação do aluno: Reprovado";
        } else {
             if (mediaFinal == 0) {
                mensagem = "Situação do Aluno: Desistente";
            } else if (mediaFinal >= 8) {
                mensagem = "Situação do Aluno: Aprovado com Sucesso";
            } else if (mediaFinal >= 6) {
                mensagem = "Situação do Aluno: Aprovado";
            } else if (mediaFinal >= 3) {
                mensagem = "Situação do Aluno: Recuperação";
            } else {
                mensagem = "Situação do Aluno: Reprovado";
            }
        }
        System.out.println(mensagem);
        ler.close();
    }

}
