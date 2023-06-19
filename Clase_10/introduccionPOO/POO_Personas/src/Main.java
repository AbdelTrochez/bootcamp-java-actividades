public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setId(1);
        persona1.setNombre("Abdel Trochez");
        persona1.setEdad(12);
        persona1.setFechaNacimiento(23,11,1991);
        persona1.setDNI("1601199100833");

        persona1.mostrar();

        if(persona1.esMayorDeEdad(persona1.getEdad())) {
            System.out.println("Mayor de Edad");
        }else{
            System.out.println("Menor de Edad");
        }
    }
}
