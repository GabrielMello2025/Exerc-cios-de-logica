import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("====  PROGRAMA IMPAR PAR  ====");

        int Numero;

        System.out.print("\nDigite o numero:");
        Numero = ler.nextInt();

        if (Numero % 2 == 0) {
            System.out.print("Par\n");
        } else {
            System.out.print("Impar\n");
        }

        ler.close();

    }
}