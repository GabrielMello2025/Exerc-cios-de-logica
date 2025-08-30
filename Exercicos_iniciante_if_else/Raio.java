import java.util.Locale;
import java.util.Scanner;

public class Raio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("PROGRAMA RAIO");

        double R, A, pi = 3.14159;

        System.out.println("\ndigite o valor de raio:");
        R = ler.nextDouble();

        A = pi * R * R;

        System.out.printf("A=%.4f%n", A);

        ler.close();
    }
}