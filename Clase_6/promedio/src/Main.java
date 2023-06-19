import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Promedio de 3
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingresa el primer valor");
        Integer v1 = scanner.nextInt();

        System.out.println("Ingresa el segundo valor");
        Integer v2 = scanner.nextInt();

        System.out.println("Ingresa el tercer valor");
        Integer v3 = scanner.nextInt();

        Float prom = (float) (v1+v2+v3)/3;

        System.out.println("El promedio es: " + prom);
    }
}
