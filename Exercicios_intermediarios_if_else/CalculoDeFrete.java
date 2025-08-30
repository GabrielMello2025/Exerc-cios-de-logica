package Exercicios_intermediarios_if_else;

import java.util.Scanner;

public class CalculoDeFrete {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n==== CALCULO DE FRETE ====");

        String mensagem = "";

        System.out.print("\nDigite a distancia (Em km):");
        double distancia = ler.nextDouble();

        System.out.print("Digite o peso do pacote (Em kg):");
        double peso = ler.nextDouble();

        if (distancia <= 100.00 && peso <= 10.00) {
            mensagem = "O FRETE É DE R$ 20,00";
        }
        else if (distancia > 100.00 && peso > 10.00) {
            mensagem = "O FRETE É DE R$ 40,00";
        }
        else if (peso > 30.00) {
            mensagem = "PACOTE NÃO ACEITO POR ULTRAPASSAR O LIMITE DE PESO!";
        } 
        else {

        }

        System.out.println(mensagem);
        ler.close();
    }
}
