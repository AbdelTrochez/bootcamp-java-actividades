import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Calculadora edad de perros

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad: ");
        Integer edad = scanner.nextInt();

        Integer edadPerro = edad * 7;

        System.out.println("Tu edad en años perro es: " + edadPerro);
    }
}