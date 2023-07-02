import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Alumno> alumnos = new ArrayList<>();
        String respuesta = "S";

        do {
            alumnos.add(agregarAlumno());
            System.out.println("Agregar nuevo alumno? S/N");
            respuesta = scanner.next();
        }while(respuesta.equalsIgnoreCase("S"));

        for(Alumno alumno : alumnos){
            System.out.println(alumno.toString());
        }
    }

    public static Alumno agregarAlumno(){
        Scanner scanner = new Scanner(System.in);

        Alumno alumno = new Alumno();
        System.out.println("************* Registro de Alumno *************");
        System.out.print("Nombre: ");
        alumno.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        alumno.setApellido(scanner.nextLine());
        System.out.print("e-mail: ");
        alumno.setEmail(scanner.nextLine());
        System.out.print("Teléfono: ");
        alumno.setTelefono(scanner.nextLine());

        System.out.println("********** Calificaciones del Alumno **********");
        int[] calificaciones = new int[5];

        System.out.println("Ingresa 5 Notas");

        for(int i=0;i<calificaciones.length;i++){
            System.out.print("Nota "+(i+1)+": ");
            calificaciones[i] = scanner.nextInt();
        }
        alumno.setCalificaciones(calificaciones);

        return alumno;
    }
}
