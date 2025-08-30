package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Farol {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String farol = "";
        String mensagem = "";

        System.out.println("\n****************************");
        System.out.println("*                          *");
        System.out.println("*          FAROL           *");
        System.out.println("*                          *");
        System.out.println("****************************\n");
        
        System.out.print("Digite qual a cor do farol: ");
        farol = ler.nextLine();

        if (farol.equals("vermelho")) {
            mensagem = "Espere!";
        }
        else if (farol.equals("verde")) {
            mensagem = "Atravesse";
        }
        else {
            mensagem = "Farol inoperante";
        }
        System.out.println(mensagem);
        ler.close();
    }
}
