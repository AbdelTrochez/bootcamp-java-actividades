import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Millas a KM

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una distancia en milas: ");
        Double millas = scanner.nextDouble();

        Double Km = millas * 1.60934;

        System.out.println("La distancia en KM es: " + Km);
    }
}
