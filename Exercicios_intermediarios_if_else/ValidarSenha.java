package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nVALIDAR SENHA\n");
        
        String resposta = "";

        System.out.print("Digite uma senha:");
        String senha = ler.nextLine();
        

        if (senha.length() >= 8 && senha.matches(".*\\d.*")) {
            resposta = "SENHA VALIDA!";
        } 
        else {
            resposta = "SENHA INVALIDA";
        }
        
        System.out.println(resposta);
        
        ler.close();
    }
}
