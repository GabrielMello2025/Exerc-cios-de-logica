import java.util.Locale;
import java.util.Scanner;

public class TresValore {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("==== LEITOR DE TRES VALORES ====");

        System.out.print("\ndigite o primeiro valor A:");
        double A = ler.nextDouble();

        System.out.print("\nDigite o segundo valor B: ");
        double B = ler.nextDouble();

        System.out.print("\nDigite o terceiro valor C: ");
        double C = ler.nextDouble();

        double areaTriangulo = (A * C) / 2;
        System.out.printf("\ntriangulo: %.3f%n", areaTriangulo);

        double areaRaio = C * C * 3.14159;
        System.out.printf("\nCirculo: %.3f%n", areaRaio);

        double areaTrapezio = ((A + B) * C) / 2;
        System.out.printf("\nTrapezio: %.3f%n", areaTrapezio);

        double areaQuadrado = B * B;
        System.out.printf("\nQuadrado: %.3f%n", areaQuadrado);

        double areaRetangulo = A * B;
        System.out.printf("\nRetangulo: %.3f%n", areaRetangulo);

        ler.close();
    }

}
