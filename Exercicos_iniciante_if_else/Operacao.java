import java.util.Scanner;

public class Operacao {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("\nCALCULADORA\n");

        System.out.print("escolha uma operação ( + , - , * , /)");
        String operador = ler.nextLine();

        System.out.print("Digite o primeiro numero:");
        Integer numero1 = ler.nextInt();

        System.out.print("Digite o segundo valor:");
        Integer numero2 = ler.nextInt();
       
double soma ;

        if (operador.equals("+") ) {
           soma = numero1 + numero2;
           System.out.println("R:" + soma);
        }
        else if (operador.equals("-") ) {
             soma = numero1 - numero2;
             System.out.println("R:" + soma);
        } 
        else if (operador.equals("*")) {
            soma = numero1 * numero2;
            System.out.println("R:" + soma);
        }
         else if (operador.equals("/") ) {
           soma = numero1 / numero2;
           System.out.println("R:" + soma);
        }
        else{
          
        }
      
       
        ler.close();
    
    }
}
