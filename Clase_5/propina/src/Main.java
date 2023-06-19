import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calcular propina

        Scanner scanner = new Scanner(System.in);

        System.out.println("Total de la cuenta: ");
        Double totalCuenta = scanner.nextDouble();

        System.out.println("Porcentaje de propina que deja: ");
        Double porcentajePropina = scanner.nextDouble();

        Double propina = totalCuenta * porcentajePropina / 100;

        System.out.println("La propina que deja es de: " + propina);
    }
}
