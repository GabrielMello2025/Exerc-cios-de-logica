import java.util.Scanner;

public class MaiorDeDois {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nPROGRAMA MAIOR DE DOIS OU IGUAL");

        System.out.print("Digite o primeiro valor:");
        int valor1 = ler.nextInt();

        System.out.print("\nDigite o segundo valor:");
        int valor2 = ler.nextInt();

        if (valor1 < valor2) {
            System.out.printf("\n%d é o maior valor", valor2);
        } 
         else if (valor1 > valor2) {
            System.out.printf("\n%d é o maior valor", valor1);
        } 
        else if (valor1 == valor2) {
            System.out.printf("\nO valor:%d é igaul ao valor:%d", valor1, valor2);
        }
         else {
        }

        ler.close();
    }
}
