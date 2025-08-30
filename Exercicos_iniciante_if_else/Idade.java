import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("\n#### VERIFICADOR DE IDADE ####");

        System.out.print("\nDigite sua idade:");
        int idade = ler.nextInt();

        if (idade < 18) {
            System.out.println("Você é menor de idade!!");
        } 
        else {
            System.out.println("Você e maior de idade!!");
        }

ler.close();

    }
}
