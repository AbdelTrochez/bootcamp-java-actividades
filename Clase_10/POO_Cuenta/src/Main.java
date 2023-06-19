public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();

        cuenta1.setTitular("Abdel Trochez");

        cuenta1.ingresar(100);
        cuenta1.retirar(10);
        cuenta1.mostrar();
    }
}