import java.util.Locale;

class Exercicio {
    public static void main(String[] args) {

        String product1 = "computer";
        String product2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'f';

        double prince1 = 2100.0;
        double prince2 = 650.50;
        double measure = 53.234567;

        System.out.printf(
                "Productes:%n %s, which prince is %.2f%n %s, which prince is $ %.2f%n %nRecord: %d years old, code %d and gender: %s%n %nmeasue wiht eight decimal places: %.8f%n rouded (theree decimal places): %.3f%n US decimal point: %.3f%n ",
                product1, prince1, product2, prince2, age, code, gender, measure, measure, measure);
    }
}