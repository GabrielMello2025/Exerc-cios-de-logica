import java.util.Scanner;

public class HorasJogo {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("PROGRAMA CONTADOR DE HORAS JOGADAS");
      
        int soma ;
      
        System.out.print("\nEm que horas o jogo começou:");
        int HoraInicial = ler.nextInt();

        System.out.print("\nEm que horas o jogo Terminou:");
        int HoraFinal = ler.nextInt();

        if (HoraFinal > HoraInicial) {
             soma = HoraFinal - HoraInicial;
            System.out.printf("O JOGO DUROU %d Hora(S)" , soma);
       
        } else if (HoraFinal < HoraInicial) {
             soma = (24 - HoraInicial) + HoraFinal;
         System.out.printf("O JOGO DUROU %d Hora(S)" , soma);
        }

        else {

        }
        ler.close();

    }
}
