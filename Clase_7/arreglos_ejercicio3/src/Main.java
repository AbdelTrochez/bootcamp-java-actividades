import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[5];

        for (int i=0; i<5 ; i++){
            System.out.println("Ingresa un numero");
            numeros[i] = scanner.nextInt();
        }

        Integer suma=0;
        for (int i=0; i<5 ; i++){
            //Aprovecha este bucle para la sumatoria de los valores
            suma += numeros[i];
            System.out.println(numeros[i] + " ");
        }

        Float promedio = (float) suma/ numeros.length;

        //Ordena el arreglo de menor a mayor
        Arrays.sort(numeros);
        Integer menor = numeros[0];
        Integer mayor = numeros[numeros.length-1];

        System.out.println("El Numero mayor es: " + mayor);
        System.out.println("El Numero menor es: " + menor);
        System.out.println("El promedio de los valores del arreglo es: " + promedio);
    }
}
