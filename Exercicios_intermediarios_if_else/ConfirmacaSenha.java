package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class ConfirmacaSenha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

         System.out.println("\n*********************************");
        System.out.println("*                                  *");
        System.out.println("*  SISTEMA DE CONFIRMAÇÃO DE SENHA *");
        System.out.println("*                                  *");
        System.out.println("************************************");

        System.out.println("Digite uma senha:");
        String senha = ler.nextLine();

        System.out.println("Confirme sua senha:");
        String confirmacaoSenha = ler.nextLine(); 
 
       
        String mensagem = "";

        if (senha.length() >=6 && confirmacaoSenha.length() >= 6 && senha.equals(confirmacaoSenha)) {
            mensagem = "SENHA CRIADA COM SUCESSO!";
        
        }
        else if (senha.length() < 6 && confirmacaoSenha.length() <6) {
           mensagem = "senha muito curta";
        
        }
        else {
            mensagem = "As senhas não coicidem!";
     
        }
        System.out.println(mensagem);
        ler.close();
    }
}
