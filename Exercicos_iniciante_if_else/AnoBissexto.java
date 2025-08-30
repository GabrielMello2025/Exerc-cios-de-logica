import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("ANO BISSEXTO");

        System.out.println("Digite um ano:");
        int ano = ler.nextInt();

        if (ano % 4 == 0 || ano % 400 == 0) {
            System.out.println("O ano é bissexto");
        } 
        else {
         System.out.println("não é um ano bissexto");
        }
   
        ler.close();
    }


}