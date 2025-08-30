import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nPROGRAMA POSITIVO OU NEGATIVO");

        System.out.print("\nDigite um numero:");
        int numero = ler.nextInt();

        if (numero < 0) {
            System.out.print("\nR: Este numero é negativo\n");
        } else if (numero == 0) {
            System.out.print("\nR: Este numero é zero\n");
        } else {
            System.out.print("\nR: Este numero é positivo\n");
        }
        ler.close();
    }
}
