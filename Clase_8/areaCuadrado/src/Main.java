import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcular Area de Cuadrado");
        System.out.println("Ingrese la medida del lado: ");
        int lado = scanner.nextInt();

        int area = calcularArea(lado);

        System.out.println("Area del cuadrado: " + area);
    }

    public static int calcularArea(int lado){
        return lado*lado;
    }
}
