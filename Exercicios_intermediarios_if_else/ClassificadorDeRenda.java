package Exercicios_intermediarios_if_else;

import java.util.Locale;
import java.util.Scanner;

public class ClassificadorDeRenda {
    public static void main(String[] args) {
      
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);
      
        
        System.out.println("\n==== CLASSIFICADOR DE RENDA ====");
        
        String mensagem = "";
        
        System.out.print("\nDigite sua renda mensal:");
        double renda = ler.nextDouble();

        if (renda <= 00.00) {
            mensagem = "Valor invalido";
        }
        else if (renda <= 1.320) {
            mensagem = "Classe baixa";
        }
        else if (renda <= 3.000) {
            mensagem = "Classe media baixa";
        }
        else if (renda <= 7.000) {
            mensagem = "Classe media";
        }
      else if (renda > 7.000) {
      
        mensagem = "classe alta";
      }
      
      else{
        
      } 
      
      System.out.println(mensagem);
        ler.close();
    }

}
