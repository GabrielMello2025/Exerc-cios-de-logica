package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Clasificacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nCLASIFICAÇÃO POR IDADE!");
      
        System.out.print("\nDigite sua idade:");
        int idade = ler.nextInt();
        String categoria = "";
       
         if (idade < 5) {
            categoria = "Idade invalida para competição";
        }
        else if (idade <= 7){
            categoria = "Infantil A";
        }
        else if (idade <= 10){
            categoria = "Infantil B";
        }
        else if (idade <= 13){
            categoria = "Juvenil A";
        }
        else if (idade <= 17){
            categoria = "Infantil B";
        }
        else if (idade >= 18){
            categoria = "Adulto";
        }
        else{    
        }

        System.out.println(categoria);    

        ler.close();
    }
}

