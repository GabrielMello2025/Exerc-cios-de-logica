import java.util.Scanner;

public class Negativo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("====  PROGRAMA NEGATIVO  ====");

        int Numero;

        System.out.print("\nDigite um numero:");
        Numero = ler.nextInt();

        if (Numero < 0) {
            System.out.println("Negativo");

        } 
        else {
            System.out.println("Nao negativo");
        }

        ler.close();

    }
}
