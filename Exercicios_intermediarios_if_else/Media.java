package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String mensagem = "";
        String situacao = "";
        double mediaFinal = 0.0;

        System.out.println("\n*******************************");
        System.out.println("*                             *");
        System.out.println("*        CALCULO MEDIA        *");
        System.out.println("*                             *");
        System.out.println("*******************************\n");

        System.out.print("Digite a primeira nota: ");
        double nota1 = ler.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = ler.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = ler.nextDouble();

        mediaFinal = (nota1 + nota2 + nota3) / 3;

        if (mediaFinal >= 8) { // aprovado com sucesso
              mensagem = "\nA MEDIA DO ALUNO É: " + mediaFinal;
            situacao = "SITUAÇÃO: Aprovado com sucesso";
        } 
        else if (mediaFinal >= 6) { // aprovado
            mensagem = "\nA MEDIA DO ALUNO É: " + mediaFinal;
            situacao = "SITUAÇÃO: Aprovado";
        } 
        else if (mediaFinal >= 3) { // recuperação
            mensagem = "\nA MEDIA DO ALUNO É: " + mediaFinal;
            situacao = "SITUAÇÃO: Recuperação";
        } 
        else if (mediaFinal == 0) { // desistencia
            mensagem = "\nA MEDIA DO ALUNO É: " + mediaFinal;
            situacao = "SITUAÇÃO: Desistencia";
        } 
        else {

        }
        System.out.println(mensagem);
        System.out.println(situacao);
        ler.close();
    }
}
