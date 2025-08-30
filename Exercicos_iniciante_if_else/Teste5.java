import java.util.Scanner;

public class Teste5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("PROGRAMA TESTE UDEMY");

        int Horas;

        System.out.println("\nQue horas são?:");
        Horas = ler.nextInt();

        if (Horas < 12) {
            System.out.println("\nBom dia");
        }

        else if (Horas < 18) {
            System.out.println("Boa tarde");
        }

        else {

            System.out.println("Boa noite");

        }
        ler.close();
    }
}
