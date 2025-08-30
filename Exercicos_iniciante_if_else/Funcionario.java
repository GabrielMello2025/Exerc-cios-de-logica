import java.util.Locale;
import java.util.Scanner;

public class Funcionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPROGRAMA CALCULO FUNCIONARIO");

        System.out.print("\nDigite o numero do funcionario:");
        int numero = ler.nextInt();

        System.out.print("\nDigite suas horas trabalhadas:");
        double horasTrabalhadas = ler.nextDouble();

        System.out.print("\nDigite o valor por horas trabalhadas: ");
        double valorHorasTrabalhadas = ler.nextDouble();

        double salario = horasTrabalhadas * valorHorasTrabalhadas;

        System.out.println("\nNUMBER = " + numero);

        System.out.printf("\nSALARY = u$ %.2f%n", salario);

        ler.close();
    }
}
