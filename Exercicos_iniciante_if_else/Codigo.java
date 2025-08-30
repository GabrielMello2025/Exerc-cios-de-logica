import java.util.Locale;
import java.util.Scanner;

public class Codigo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner ler = new Scanner(System.in);

    System.out.println("==== PROGRAMA CODIGO ====");

    System.out.print("\nDigite o codigo da peça 1: ");
    int Codigo1 = ler.nextInt();

    System.out.print("\nDigite a quantidade de peças 1: ");
    int quantidade1 = ler.nextInt();

    System.out.print("\nDigite o valor da peça 1: ");
    double preco1 = ler.nextDouble();

    System.out.println("\nPeça 2 ");

    System.out.print("\nDigite o codigo da peça 2: ");
    int Codigo2 = ler.nextInt();

    System.out.print("\nDigite a quantidade de peças 2: ");
    int quantidade2 = ler.nextInt();

    System.out.print("\nDigite o valor da peça 2: ");
    double preco2 = ler.nextDouble();

    double calculo = (quantidade1 * preco1) + (quantidade2 * preco2);

    System.out.printf("\nValor a pagar: R$ %.2f%n", calculo);

    ler.close();

  }

}