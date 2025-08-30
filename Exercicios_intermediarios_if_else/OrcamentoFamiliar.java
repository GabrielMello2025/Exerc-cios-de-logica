package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class OrcamentoFamiliar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double ganhos = 0.0;
        double gastos = 0.0;
        String mensagem = "";

        System.out.println("\n****************************");
        System.out.println("*                          *");
        System.out.println("*    ORÇAMENTO FAMILIAR    *");
        System.out.println("*                          *");
        System.out.println("****************************\n");

       System.out.print("Digite o valor de seus ganhos: ");
       ganhos = ler.nextDouble();
       System.out.print("Digite o valor de seus gastos: ");
       gastos = ler.nextDouble();

        if (ganhos >= gastos) {
            mensagem = "Você está dentro do orçamento!";
        }
     
        else {
             mensagem = "Você está fora do orçamento! não gaste mais!";
        }
        System.out.println(mensagem);
        ler.close();
    }
}
