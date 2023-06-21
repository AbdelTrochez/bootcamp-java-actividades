package abdel.com.springBootClase8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Random;

@RestController
public class MainController {

    @GetMapping("/generar-password/{longPassword}")
    public String generarPassword(@PathVariable int longPassword){
        char[] arreglo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', '!', '@', '#', '$', '%', '&', '_'};

        Random random = new Random();

        String password="";

        for (int i=0; i<longPassword; i++){
            password += arreglo[random.nextInt(arreglo.length)];
        }

        return "Password: " + password;
    }


    @GetMapping("/piedra-papel-tijera/{opcionUsuario}")
    public String piedraPapelTijera(@PathVariable int opcionUsuario) {
        Random random  = new Random();

        String pc = seleccionarOpcion(random.nextInt(3)+1);
        String usuario = seleccionarOpcion(opcionUsuario);

        return "Usuario Elige "+usuario+" --- PC Elige "+pc+" --- "+detectarGanador(usuario, pc);
    }

    private String seleccionarOpcion(int opcion){
        //Opciones de Juego y posibles combinaciones
        String[] opciones = {"Piedra", "Papel", "Tijera"};

        String seleccion = opciones[opcion-1];

        return seleccion;
    }

    private String detectarGanador(String usuario, String pc){

       String[][] COMBINACIONES = {
                {"Piedra", "Tijera"},
                {"Papel", "Piedra"},
                {"Tijera", "Papel"}
        };

        String[] resultado = {usuario, pc};
        String jugadaUsuario = resultado[0];
        String jugadaPC = resultado[1];
        String ganador = "";

        for (int i = 0; i < COMBINACIONES.length; i++) {
            String[] combinacion = COMBINACIONES[i];
            if (combinacion[0].equalsIgnoreCase(jugadaUsuario) && combinacion[1].equalsIgnoreCase(jugadaPC)) {
                ganador = "El ganador es Usuario";
            } else if (combinacion[0].equalsIgnoreCase(jugadaPC) && combinacion[1].equalsIgnoreCase(jugadaUsuario)) {
                ganador = "El ganador es PC";
            }
        }

        //Caso de empate
        if(ganador=="")  ganador = "Ha Sido un Empate!";

        return ganador;
    }
}