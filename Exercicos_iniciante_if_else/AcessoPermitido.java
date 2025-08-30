
import java.util.Scanner;

public class AcessoPermitido {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("PROMAGRA ACESSO");

        System.out.println("Digite seu acesso:");
        String acesso = ler.nextLine();

        System.out.println("Digite sua senha:");
        String senha = ler.nextLine();

        if (acesso.equals("admin") && senha.equals("1234")) {
            System.out.println("ACESSO PERMITIDO");
        } 
        else {
            System.out.println("ACESSO NEGADO TENTE NOVAMENTE");
        }

        ler.close();
        
    }
}