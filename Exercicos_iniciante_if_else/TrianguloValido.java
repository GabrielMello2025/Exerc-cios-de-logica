import java.util.Scanner;

public class TrianguloValido {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\nTRIANGULO VALIDO");

        System.out.print("\nDigite o valor de A:");
        int a = ler.nextInt();

        System.out.print("Digite o valor de B:");
        int b = ler.nextInt();

        System.out.print("Digite o valor de C:");
        int c = ler.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("\nÉ UM TRIANGULO!");
        } 
        else {
            System.out.println("\nNÃO É UM TRIANGULO!");
        }

        ler.close();

    }
}
