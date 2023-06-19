import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numeros = new Integer[5];

        for (int i=0; i<5 ; i++){
            System.out.println("Ingresa un numero");
            numeros[i] = scanner.nextInt();
        }

        for (int i=0; i<5 ; i++){
            System.out.println(numeros[i] + " ");
        }
    }
}
