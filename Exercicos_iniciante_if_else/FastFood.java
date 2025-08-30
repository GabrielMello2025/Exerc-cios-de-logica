import java.util.Locale;
import java.util.Scanner;

public class FastFood {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("====  FAST FOOD ====\n");

        System.out.print("\nDigite o codigo do iten:");
        int codigo = ler.nextInt();

        System.out.print("\nDigite a quantidade de itens:");
        int quantidade = ler.nextInt();

        if (codigo == 1 ) {
           double ValorTotal = 4.00 * quantidade;
             System.out.printf("\nTotal: R$ %.2f%n", ValorTotal);
       
        } else if (codigo == 2) {
           double ValorTotal = 4.50 * quantidade;
             System.out.printf("\nTotal: R$ %.2f%n", ValorTotal);
       
        } else if (codigo == 3) {
           double ValorTotal = 5.00 * quantidade;
              System.out.printf("\nTotal: R$ %.2f%n", ValorTotal);
      
        } else if (codigo == 4) {
          double  ValorTotal = 2.00 * quantidade;
             System.out.printf("\nTotal: R$ %.2f%n", ValorTotal);
     
        } else if (codigo == 5) {
          double  ValorTotal = 1.50 * quantidade;
             System.out.printf("\nTotal: R$ %.2f%n", ValorTotal);
      
        } 
        else {
            System.out.print("ATENÇÃO, CODIGO OU QUANTIDADES ERRADAS\n");
        }

        ler.close();
    }
}
