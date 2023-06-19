import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el nombre de una celebridad: ");
        String celebridad = scanner.nextLine();

        //No importa si escribe varias palabras ejemplo: Luis Miguel --> luismiguel
        String URL = "https://twitter.com/search?q=" + celebridad.toLowerCase().replaceAll("\\s","");

        System.out.println("Ver Tweets: " + URL);
    }
}
