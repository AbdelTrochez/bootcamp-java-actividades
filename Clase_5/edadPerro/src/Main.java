import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculadora edad de perros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la edad de tu perro: ");
        Integer edad = scanner.nextInt();

        Integer edadPerro = edad * 7;

        System.out.println("La edad en años perrunos es: " + edadPerro);
    }
}