import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Adivina Numero

        Scanner scanner = new Scanner(System.in);

        //Este codigo genera un aleatorio entero entre 1 y 100
        Random random = new Random();
        Integer numeroAleatorio = random.nextInt(100) + 1 ;

        /*
        //Forma basica

        System.out.println("Adivina el numero del 1 al 100, ingresa tu respuesta: ");
        Integer numeroUsuario = scanner.nextInt();

        if (numeroAleatorio==numeroUsuario){
            System.out.println("Adivinaste!!");
        }else{
            System.out.println("No acertaste, el número era: " + numeroAleatorio);
        }
        */

        Boolean adivinado = false;
        boolean seRinde = false;

        while (adivinado == false && seRinde == false){
            System.out.println("Adivina el numero del 1 al 100, ingresa tu respuesta: ");
            Integer numeroUsuario = scanner.nextInt();

            if (numeroAleatorio==numeroUsuario){
                System.out.println("Adivinaste!!");
                adivinado = true;
            }else{
                System.out.println("No acertaste, para rendirte ingresa 1, si no ingresa otro numero" );
                Integer respuesta = scanner.nextInt();

                if (respuesta == 1){
                    seRinde = true;
                    System.out.println("Te has rendido, el numero es " + numeroAleatorio );
                }
            }
        }

    }
}
