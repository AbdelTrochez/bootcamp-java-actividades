import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Precio original del producto");
        Double precioOriginal = scanner.nextDouble();

        System.out.println("Porcentaje de descuento que se aplica: ");
        Double descuento = scanner.nextDouble();

        Double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final es: " + precioFinal);
    }
}
