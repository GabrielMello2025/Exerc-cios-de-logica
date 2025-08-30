package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n==== CALCULADORE DE IMC ====");
    
        String mensagem = "";    
        
        System.out.print("Digite seu peso:");
         double peso = ler.nextDouble();
        
        System.out.print("Digite sua altura:");
         double altura = ler.nextDouble();
        
        double calculo = peso / (altura * altura);

        if (calculo < 18.5) {
            mensagem = "ABAIXO DO PESO!";
        }
        else if (calculo <= 24.9){
            mensagem = "PESO NORMAL: ";
        }
        else if (calculo <= 29.9) {
            mensagem = "SOBREPESO: ";
        }
        else {
            mensagem = "OBESIDADE: ";
        }
        System.out.printf(mensagem +  "%.2f\n" , calculo);
        ler.close();
    }

}
