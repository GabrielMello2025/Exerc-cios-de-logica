import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("CALENDARIO");

        System.out.println("Digite um numero de 1 a 12:");
        int calendario = ler.nextInt();
        String mes = "";

        if (calendario == 1) {
            mes = "JANEIRO";
        } else if (calendario == 2) {
            mes = "FEVEREIO";
        } else if (calendario == 3) {
            mes = "MARÇO";
        } else if (calendario == 4) {
            mes = "ABRIL";
        } else if (calendario == 5) {
            mes = "MAIO";
        } else if (calendario == 6) {
            mes = "JUNHO";
        } else if (calendario == 7) {
            mes = "JULHO";
        } else if (calendario == 8) {
            mes = "AGOSTO";
        } else if (calendario == 9) {
            mes = "SETEMBRO";
        } else if (calendario == 10) {
            mes = "OUTUBRO";
        } else if (calendario == 11) {
            mes = "NOVEMBRO";
        } else if (calendario == 12) {
            mes = "DEZEMBRO";
        }
         else {
            mes = "MES INVALIDO";
        }
             System.out.println(mes); 
        
        ler.close();
    }

}
