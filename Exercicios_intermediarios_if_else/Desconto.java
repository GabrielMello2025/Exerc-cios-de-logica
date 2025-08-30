package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n************************************************");
        System.out.println("*                                                *");
        System.out.println("*  SISTEMA DE DESCONTO POR CATEGORIA DE CLIENTE  *");
        System.out.println("*                                                *");
        System.out.println("**************************************************");
    
        System.out.print("\nDigite seu nome:");
        String nome = ler.nextLine();

        System.out.print("Digite qual sua categoria (Bronze, Prata, Ouro, Diamante):");
        String categoria = ler.nextLine();

        System.out.print("Digite o valor da compra:");
        double valorCompra = ler.nextDouble();

        boolean categoriaValida = false;
        double calculo = 0.0;
        String mensagem = "Categoria invalida";

        if (categoria.equalsIgnoreCase("Bronze")) {
            calculo = valorCompra - 5;
            categoriaValida = true;
        }
        else if (categoria.equalsIgnoreCase("Prata")) {
            calculo = valorCompra - 10;
            categoriaValida = true;            
        }
        else if (categoria.equalsIgnoreCase("Ouro")) {
            calculo = valorCompra - 15;
            categoriaValida = true;
        }
        else if (categoria.equalsIgnoreCase("Diamante")) {
            calculo = valorCompra - 20;
            categoriaValida = true;
        }
        else  {
        System.out.println(mensagem);
            
        }
        if (categoriaValida) {
          System.out.printf("%s O valode final com desconto é de : %.2f%n ",nome, calculo  );

        }  
         
        ler.close();
    }
}
