import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("********* Calculadora de Cambio *********");

        System.out.println("Precio del producto");
        float precio = scanner.nextFloat();
        System.out.println("Cantidad de dinero: ");
        float dinero = scanner.nextFloat();

        if(dinero<precio){
            float faltante = precio - dinero;
            System.out.println("Falta abonar " + faltante);
        } else if (dinero == precio) {
            System.out.println("Pago exacto");
        }else{
            float cambio = dinero - precio;
            System.out.println("Tu cambio es $" + cambio);

            System.out.println(desglosarCambio(cambio));
        }
    }

    private static String desglosarCambio(float cambio) {

        int billetes500 = 0;
        float restante500 = cambio;
        if (restante500 >= 500) {
            billetes500 = (int) (restante500 / 500);
            restante500 = restante500 % 500;
        }

        int billetes200 = 0;
        float restante200 = restante500;
        if (restante200 >= 200) {
            billetes200 = (int) (restante200 / 200);
            restante200 = restante200 % 200;
        }

        int billetes100 = 0;
        float restante100 = restante200;
        if (restante100 >= 100) {
            billetes100 = (int) (restante100 / 100);
            restante100 = restante100 % 100;
        }

        int billetes50 = 0;
        float restante50 = restante100;
        if (restante50 >= 50) {
            billetes50 = (int) (restante50 / 50);
            restante50 = restante50 % 50;
        }

        int billetes20 = 0;
        float restante20 = restante50;
        if (restante20 >= 20) {
            billetes20 = (int) (restante20 / 20);
            restante20 = restante20 % 20;
        }

        int billetes10 = 0;
        float restante10 = restante20;
        if (restante10 >= 10) {
            billetes10 = (int) (restante10 / 10);
            restante10 = restante10 % 10;
        }

        int billetes5 = 0;
        float restante5 = restante10;
        if (restante5 >= 5) {
            billetes5 = (int) (restante5 / 5);
            restante5 = restante5 % 5;
        }

        int billetes2 = 0;
        float restante2 = restante5;
        if (restante2 >= 2) {
            billetes2 = (int) (restante2 / 2);
            restante2 = restante2 % 2;
        }

        int billetes1 = 0;
        float centavos = cambio-(int)cambio;
        if (restante2 >= 1) {
            billetes1 = 1;
        }

        return  "Billetes de 500: " + billetes500 +
                " \nBilletes de 200: " + billetes200 +
                " \nBilletes de 100: " + billetes100 +
                " \nBilletes de 50: " + billetes50 +
                " \nBilletes de 20: " + billetes20 +
                " \nBilletes de 10: " + billetes10 +
                " \nBilletes de 5: " + billetes5 +
                " \nBilletes de 2: " + billetes2 +
                " \nBilletes de 1: " + billetes1 +
                " \nCentavos: " + centavos;
    }

}
