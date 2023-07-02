import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static List<Participante> participantes = new ArrayList<>();

    public static void main(String[] args) {
        // Ingresar nombres de participantes
        // Cada participante se sienta en la pc, escribe su nombre y recibe indicacion de a quien darle regalo
        // Limpiar la consola

        System.out.println("************** Amigo Invisible **************");

        ingresarParticipantes();
        asignarAmigo();

        boolean continuar = false;
        String respuesta = "";
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(verAmigo());
            System.out.println("Continuar? S/N");
            respuesta = scanner.next();

            if(respuesta.equalsIgnoreCase("S")) {
              continuar = true;

                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }else{
                continuar = false;
            }
        }while (continuar);

    }

    private static void ingresarParticipantes() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar Participantes:");
        String respuesta;

        do{
            Participante participante = new Participante();

            System.out.println("Ingresa tu nombre: ");
            participante.setNombre(scanner.nextLine());

            participantes.add(participante);

            System.out.println("Ingresar otro participante? S/N");
            respuesta = scanner.next();

            scanner.nextLine();

        }while(respuesta.equalsIgnoreCase("S"));
    }

    private static void asignarAmigo(){
        Random random = new Random();
        int indice;

        for (int i = 0; i< participantes.size(); i++){
            indice = random.nextInt(participantes.size());

            boolean esAmigo = participantes.get(indice).getEsAmigo();
            String amigo = participantes.get(indice).getNombre();
            String participante = participantes.get(i).getNombre();

            boolean asignado = false;
            do{
                if(!esAmigo && !amigo.equalsIgnoreCase(participante)){
                    participantes.get(i).setAmigo(amigo);
                    participantes.get(indice).setEsAmigo(true);

                    asignado=true;
                }else{
                    indice = random.nextInt(participantes.size());

                    esAmigo = participantes.get(indice).getEsAmigo();
                    amigo = participantes.get(indice).getNombre();
                }
            }while(!asignado);
        }
    }

    private static String verAmigo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre para ver tu amigo: ");
        String nombre = scanner.nextLine();

        for (Participante participante : participantes){
            if(participante.getNombre().equalsIgnoreCase(nombre)){
                return nombre + " tu amigo es: " + participante.getAmigo();
            }
        }

        return "Nombre No Encontrado";
    }
}
