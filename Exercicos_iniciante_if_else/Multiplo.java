import java.util.Scanner;;

public class Multiplo {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("====  PROGRAMA MULTIPLO DE 3  ====");

        System.out.print("\nDigite o valor A: ");
        int A = ler.nextInt();

        System.out.print("\nDigite o valor B: ");
        int B = ler.nextInt();

        if (A % 2 == 0 && B % 2 == 0) {
            System.out.println("É MULTIPLO\n");
        } 
        else {
            System.out.println("NÃO É MULTIPLO\n");
        }

        ler.close();

    }
}