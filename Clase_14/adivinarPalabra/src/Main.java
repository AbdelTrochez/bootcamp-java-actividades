import java.util.Random;
import java.util.Scanner;

public class Main {
    static Palabra[] palabras = new Palabra[20];

    static{
        palabras[0] = new Palabra("Elefante", "Es un animal muy grande, con trompa.");
        palabras[1] = new Palabra("Casa", "Es un lugar donde vives.");
        palabras[2] = new Palabra("Perro", "Es un animal doméstico y leal.");
        palabras[3] = new Palabra("Montaña", "Es una elevación natural de terreno.");
        palabras[4] = new Palabra("Sol", "Es una estrella que brilla en el cielo durante el día.");
        palabras[5] = new Palabra("Libro", "Es una colección de hojas escritas o impresas.");
        palabras[6] = new Palabra("Jardín", "Es un espacio al aire libre con plantas y flores.");
        palabras[7] = new Palabra("Avión", "Es un medio de transporte que vuela.");
        palabras[8] = new Palabra("Fiesta", "Es una celebración con música, baile y diversión.");
        palabras[9] = new Palabra("Chocolate", "Es un dulce hecho con cacao y azúcar.");
        palabras[10] = new Palabra("Playa", "Es una zona de la costa con arena y mar.");
        palabras[11] = new Palabra("Arcoíris", "Es un fenómeno óptico que forma un arco de colores en el cielo.");
        palabras[12] = new Palabra("Luna", "Es el satélite natural de la Tierra.");
        palabras[13] = new Palabra("Bicicleta", "Es un medio de transporte de dos ruedas que se pedalea.");
        palabras[14] = new Palabra("Cielo", "Es la bóveda celeste que se ve sobre la Tierra.");
        palabras[15] = new Palabra("Computadora", "Es una máquina que procesa información.");
        palabras[16] = new Palabra("Piano", "Es un instrumento musical de cuerdas.");
        palabras[17] = new Palabra("Futbol", "Es un deporte que se juega con una pelota.");
        palabras[18] = new Palabra("Lápiz", "Es un instrumento de escritura o dibujo.");
        palabras[19] = new Palabra("Invierno", "Es una de las estaciones del año, caracterizada por el frío.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("********* ADIVINA LA PALABRA *********");
        System.out.println();

        int indicePalabra = random.nextInt(palabras.length);

        System.out.println("Aquí tienes una pista: ");
        System.out.println(palabras[indicePalabra].getPista());


        boolean haAdivinado = false;
        int contadorIntentos = 1;

        do {
            System.out.print("¿Qué palabra es? : ");
            String respuesta = scanner.nextLine();

            if (palabras[indicePalabra].getPalabra().equalsIgnoreCase(respuesta)){
                System.out.println("Adivinaste la Palabra");
                System.out.println("Te ha tomado "+contadorIntentos+" intentos.");
                haAdivinado = true;
            }else{
                System.out.println("Intentalo de nuevo...");
            }
            contadorIntentos++;
        }while(!haAdivinado);

    }
}
