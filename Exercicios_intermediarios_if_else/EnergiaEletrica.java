package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class EnergiaEletrica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n***********************************");
        System.out.println("*                                 *");
        System.out.println("*  SIMULADOR DE ENERGIA ELETRICA  *");
        System.out.println("*                                 *");
        System.out.println("***********************************");

        double calculo = 0.0;
       

        System.out.print("\nDigite qual tipo de cliente voce é (Residencial , comercial , industrial):");
        String cliente = ler.nextLine();
        
        System.out.print("Digite a quantidade de KWh consumidos:");
        double quantidade = ler.nextDouble();

        if (cliente.equals("residencial") ) {
             calculo = quantidade * 0.60;
        }
        else if (cliente.equals("comercial")) {
            calculo = quantidade * 0.48;
        }
        else if (cliente.equals("industrial")) {
            calculo = quantidade * 1.29;
        }
        System.out.printf("O TOTAL DA CONTA É DE: R$ ", calculo);
        ler.close();
    }
}
