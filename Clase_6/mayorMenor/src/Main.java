import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Mayor y Menor de 3
        Scanner scanner =new Scanner(System.in);

        System.out.println("Ingresa el primer valor");
        Integer v1 = scanner.nextInt();

        System.out.println("Ingresa el segundo valor");
        Integer v2 = scanner.nextInt();

        System.out.println("Ingresa el tercer valor");
        Integer v3 = scanner.nextInt();

        Integer mayor = v1;
        Integer menor = v1;

        mayor = v2>mayor ? mayor=v2 : mayor;
        mayor = v3>mayor ? mayor=v3 : mayor;

        menor = v2<menor ? menor=v2 : menor;
        menor = v3<menor ? menor=v3 : menor;

        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
}
