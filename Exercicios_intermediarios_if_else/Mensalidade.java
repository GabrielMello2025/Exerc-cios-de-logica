package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class Mensalidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double si = 550;
        double ads = 750;
        double cs = 1150;
        double ec = 1300;
        double es = 950;
        boolean insento = false ;
        int desconto = 0;
        String siglaCurso = "";
        double valorComDesconto = 0.0;

        System.out.println("\n******************************");
        System.out.println("*                            *");
        System.out.println("*         MENSALIDADE        *");
        System.out.println("*                            *");
        System.out.println("******************************");
        System.out.println("\nLEIA AS INSTRUÇÕES ABAIXO:");
        System.out.println("\nInforme Consecutivamente A Sigla Da Faculdade, Sendo Elas");
        System.out.println("(si / ads / cs / ec / es)");
        System.out.println("Após, Informe Se É Isento Usando (false Ou true)");
        System.out.println("E Por Fim O Valor Que Possui De Desconto");
        System.out.print("Aperte a tecla ENTER para dar inicio:");
        ler.nextLine();
        System.out.println("Iniciado");
        System.out.println();
        siglaCurso = ler.nextLine();
        System.out.println();
        insento = ler.nextBoolean();
        System.out.println();
        desconto =ler.nextInt();
        
        if ( insento == true) {
            valorComDesconto = 0.00;    
        }
        else {
            if (desconto > 0) {
                valorComDesconto = (550 * desconto ) / 100;
            }
            else if (siglaCurso.equalsIgnoreCase("ads")) {
                valorComDesconto = (750 * desconto ) / 100;
            }
            else if (siglaCurso.equalsIgnoreCase("cs")) {
                valorComDesconto = (1150 * desconto) / 100;
            }
            else if (siglaCurso.equalsIgnoreCase("ec")) {
                valorComDesconto = (1300 * desconto) / 100;
            }
            else if (siglaCurso.equalsIgnoreCase("es")) {
                valorComDesconto = (950 * desconto) / 100;
            }
            else if (valorComDesconto == 0) {
                System.out.println();
                    
                }
            }{
                
            }
        }
    
        System.out.println(valorComDesconto);
        ler.close();
    }
}



