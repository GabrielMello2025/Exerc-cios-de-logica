package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String mensagem = "";

        System.out.println("\n******************************");
        System.out.println("*                            *");
        System.out.println("*      TIPO DE TRIANGULO     *");
        System.out.println("*                            *");
        System.out.println("******************************");

        System.out.println("\nIremos verificar o tipo de triangulo");
        System.out.println("Se ele é Escaleno , Esquilátero ou Isósceles");
        System.out.println("Precione ENTER para informar abaixo os três numeros inteiros");
        ler.nextLine();
        System.out.println("Digite os valores ");

        System.out.println();
        int valor1 = ler.nextInt();
        System.out.println();
        int valor2 = ler.nextInt();
        System.out.println();
        int valor3 = ler.nextInt();

        if (valor1 == valor2 && valor1 == valor3) {
            mensagem = "É equilatero";
        } 
        else if (valor1 == valor2 && valor1 != valor3 ||
                valor1 == valor3 && valor1 != valor2 ||
                valor2 == valor3 && valor2 != valor1) {
            mensagem = "É isósceles";
        } 
        else {
            mensagem = "É escaleno";
        }
        System.out.println(mensagem);
        ler.close();

    }
}
