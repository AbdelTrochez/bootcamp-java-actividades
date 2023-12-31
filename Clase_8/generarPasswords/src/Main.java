import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Generador de Contraseñas");
        System.out.println("¿Qué longitud deseas que tenga tu contraseña?");
        int longPassword = scanner.nextInt();

        String password = generarPassword(longPassword);

        System.out.println(password);
    }

    public static String generarPassword(int longPassword){
        char[] arreglo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '_'};

        Random random = new Random();

        String password="";

        for (int i=0; i<longPassword; i++){
            password += arreglo[random.nextInt(arreglo.length)];
        }

        return password;
    }

}
