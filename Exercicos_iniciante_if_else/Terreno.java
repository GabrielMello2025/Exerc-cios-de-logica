import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        System.out.println("\nPROGRAMA DE LEITURA DE TERRENO");

        double largura, comprimento, metroQuadrado, area, preco;

        System.out.print("\nDigite a largura do terreno: ");
        largura = ler.nextDouble();

        System.out.print("\nDigite o comprimento do terreno: ");
        comprimento = ler.nextDouble();

        System.out.print("\nDigite o valor do metro quadrado do terreno:");
        metroQuadrado = ler.nextDouble();

        area = largura * comprimento;
        preco = area * metroQuadrado;

        System.out.printf("\nA area é: %.2f%n", area);
        System.out.printf("\nO preço é: %.2f%n", preco);
        ler.close();
    }
}
