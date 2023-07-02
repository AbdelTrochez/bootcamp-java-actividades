import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el Capital Inicial: ");
        float inicial = scanner.nextFloat();
        System.out.println("Ingrese la Adición Anual: ");
        float adicionAnual = scanner.nextFloat();
        System.out.println("Ingrese la Cantidad de Años");
        int cantAnios = scanner.nextInt();
        System.out.println("Ingrese la Tasa de interés (%)");
        float interes = scanner.nextFloat();

        float cantidadFinal = inicial;

        for(int i=0; i<cantAnios; i++){
            cantidadFinal += adicionAnual;
            cantidadFinal += cantidadFinal * interes / 100;
        }

        System.out.println("Al finalizar vas a tener: $" + cantidadFinal);
    }
}
