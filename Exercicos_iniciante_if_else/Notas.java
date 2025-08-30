import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nCLASSIFICAÇÃO DE NOTAS");

        System.out.print("\nDigite seu nome:");
        String nome = ler.nextLine();

        System.out.print("Digite sua nota:");
        double nota = ler.nextDouble();

        if (nota < 5.0) {
            System.out.printf("\n%s você está reprovado!\n", nome);
        } else if (nota < 7.0) {
            System.out.printf("\n%s Você está de recuperação!\n", nome);
        }
        else {
            System.out.printf("\n%S VOCE ESTA APROVADO!\n", nome);
        }
        ler.close();
    }

}
