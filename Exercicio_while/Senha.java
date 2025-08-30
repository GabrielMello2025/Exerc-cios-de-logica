package Exercicio_while;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("\n***********************************");
        System.out.println("*                                 *");
        System.out.println("*            SENHA CORRETA        *");
        System.out.println("*                                 *");
        System.out.println("***********************************");
       
        System.out.print("\nCadastre uma senha numerica: ");
        int senhaCadastrada = ler.nextInt();
       
       System.out.print("Digite A senha:");
       int senha = ler.nextInt();
       
       while (senha != senhaCadastrada) {
        System.out.print("Senha Incorreta, Digite Novamente: ");
        senha = ler.nextInt();
       }
       System.out.println("Acesso Permitido");
       ler.close();
    }
}