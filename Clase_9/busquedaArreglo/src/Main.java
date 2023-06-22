import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personas = {"Lucas Moy", "Abdel Trochez", "Julia Gomez"};

        System.out.println("Ingrese su busqueda: ");
        String busqueda = scanner.nextLine();

        String resultado = buscarPersona(busqueda, personas);

        if(resultado.isEmpty()){
            System.out.println("Lo siento, No se ha encontrado el registro que buscas.");
        }else{
            System.out.println("La persona "+resultado+" se encuentra registrada.");
        }
    }

    public static String buscarPersona(String busqueda, String[] arrPersonas){
        String respuesta = "";

        /*
        for (int i=0; i<arrPersonas.length;i++){
            if (busqueda.equalsIgnoreCase(arrPersonas[i])) respuesta = arrPersonas[i];
        }*/

        //Usando foreach
        for (String persona : arrPersonas) {
            if (persona.toUpperCase().contains(busqueda.toUpperCase())) respuesta = persona;
        }

        return respuesta;
    }
}
