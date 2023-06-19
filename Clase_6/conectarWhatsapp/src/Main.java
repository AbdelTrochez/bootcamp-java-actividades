import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese numero telefonico, sin espacios, incluye numero de area: ");
        String numeroTel = scanner.next();

        String URL = "https://api.whatsapp.com/send?phone=" + numeroTel.trim();

        System.out.println("URL: " + URL);
    }
}
