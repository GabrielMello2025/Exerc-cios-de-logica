import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("PROGRAMA DE DIFERENÇA");

        System.out.print("\nDigite o primeiro valor: ");
        int A = ler.nextInt();

        System.out.print("\nDigite o segundo valor: ");
        int B = ler.nextInt();

        System.out.print("\nDigite o terceiro valor: ");
        int C = ler.nextInt();

        System.out.print("\nDigite o quarto valor: ");
        int D = ler.nextInt();

        int Diferenca = (A * B - C * D);

        System.out.println("Diferença = " + Diferenca);

        ler.close();
    }
}
