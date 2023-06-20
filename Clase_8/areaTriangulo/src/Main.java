import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcular Area de Triangulo");
        System.out.println("Ingrese la medida de la Base: ");
        int base = scanner.nextInt();
        System.out.println("Ingrese la medida de la Altura: ");
        int altura = scanner.nextInt();

        float area = calcularArea(base,altura);

        System.out.println("Area del triangulo: " + area);
    }

    public static float calcularArea(int base, int altura){
        return (float)base*altura/2;
    }
}
