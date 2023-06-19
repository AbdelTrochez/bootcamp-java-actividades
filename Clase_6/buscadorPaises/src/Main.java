import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un Pais: ");
        String pais = scanner.next();

        String URL = "https://www.google.com/maps/search/" + pais.toLowerCase().trim();

        System.out.println("URL: " + URL);
    }
}
