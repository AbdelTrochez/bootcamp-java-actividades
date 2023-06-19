import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random  = new Random();

        //Se genera seleccion aleatoria de la pc
        Integer opcionComputadora = random.nextInt(3);

        //Opciones de Juego y posibles combinaciones
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        String[] ganaPiedra = {"Piedra", "Tijera"};
        String[] ganaPapel = {"Papel", "Piedra"};
        String[] ganaTijera = {"Tijera", "Papel"};

        //Usuario escoge opcion de juego
        System.out.println("1) Piedra, 2) Papel o 3) Tijera");
        System.out.println("Ingresa el numero de la opcion que quieres");
        Integer opcionUsuario = scanner.nextInt();

        //Se crea un arreglo con la opcion del usuario y de la pc y se muestran
        String[] resultado = {opciones[opcionUsuario-1],opciones[opcionComputadora]};
        String[] resultadoInvertido = {opciones[opcionComputadora],opciones[opcionUsuario-1]};

        System.out.println("Usuario elige: " + resultado[0]);
        System.out.println("Computadora elige: " + resultado[1]);

        //Compara arreglos resultantes de las opciones elegidas, contra los arreglos de posibilidades
        String mensaje = "";

        //Gana Usuario
        if (Arrays.equals(ganaPiedra, resultado)) mensaje = "Ganaste, opcion Piedra";
        if (Arrays.equals(ganaPapel, resultado)) mensaje = "Ganaste, opcion Papel";
        if (Arrays.equals(ganaTijera, resultado)) mensaje = "Ganaste, opcion Tijera";

        //Gana PC
        if (Arrays.equals(ganaPiedra, resultadoInvertido)) mensaje = "Perdiste, gana Piedra";
        if (Arrays.equals(ganaPapel, resultadoInvertido)) mensaje = "Perdiste, gana Papel";
        if (Arrays.equals(ganaTijera, resultadoInvertido)) mensaje = "Perdiste, gana Tijera";

        //Empate
        if(mensaje=="") mensaje = "Ha Sido un Empate!";

        System.out.println(mensaje);
    }
}
