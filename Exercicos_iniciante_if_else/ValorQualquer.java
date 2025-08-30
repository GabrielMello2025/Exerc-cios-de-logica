import java.util.Locale;
import java.util.Scanner;

public class ValorQualquer {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        System.out.println("\nPROGRAMA INTERVALO");

        System.out.print("\nDigite o valor:");
            double valor = ler.nextDouble();

        if (valor < 0) {
            System.out.println("Fora de intervalo");
        }
        else if (valor <= 25) {
            System.out.print("\nIntervalo [0,25]");
        } 
        else if (valor  <= 50) {
            System.out.print("\nIntervalo [25,50]");
        }
        else if (valor <= 75) {
            System.out.print("\nIntervalo [50,75]");
        } 
        else if (valor <= 100) {
            System.out.print("\nIntervalo [75,100]");
        } 
        else  {
        }
       
        ler.close();
    }
}
