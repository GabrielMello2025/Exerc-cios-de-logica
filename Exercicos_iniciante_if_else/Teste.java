import java.util.Scanner;
import java.util.Locale;


class Teste {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        double x = 10.35784;

        
        System.out.println(x);

        System.out.printf("%.2f%n" , x); 
        // o %.2f é para delimitar que eu quero só duas casa decimais e tenho que usar f no print ficando prinf
        // já o %n no fila e para quebra de linha de que pode ser tbm \n \\
        
        System.out.printf("%.4f%n" , x);
        
        Locale.setDefault( Locale.US);
        // me permite configurar a localização do programa 
        // nao preciso usar o import java.util.Locale; posso usar o import java.util.*; que ja importa tudo da biblioteca java \\
        System.out.println (" RESULTADO = " + x + " METROS" );
        System.out.printf("RESULTADO = %.2f metros%n" , x);
        System.out.printf(" %s tem %d anos e ganha R$ %.3f reais%n", nome, idade, renda);
    }
}