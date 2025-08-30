import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nPROGRAMA DE SOMA");

        System.out.print("\nDigite o primeiro valor: ");
        int valor1 = ler.nextInt();

        System.out.print("\nDigite o segundo valor: ");
        int valor2 = ler.nextInt();

        int soma = valor1 + valor2;
        System.out.println("Soma = " + soma);

        ler.close();

    }
}
