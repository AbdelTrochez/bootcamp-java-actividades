import java.time.LocalDate;

public class Persona {
    private int Id;
    private String Nombre;
    private int Edad;
    private LocalDate FechaNacimiento;
    private String DNI;

    public int getId() {
        return Id;
    }
    public String getNombre() {
        return Nombre;
    }
    public int getEdad() {
        return Edad;
    }
    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }
    public String getDNI() {
        return DNI;
    }

    public void setId(int id) {
        Id = id;
    }
    public void setNombre(String nombre){
        Nombre = nombre;
    }
    public void setEdad(int edad){
        Edad = edad;
    }
    public void setFechaNacimiento(int dia, int mes, int anio){
        FechaNacimiento = LocalDate.of(anio,mes,dia);
    }
    public void setDNI (String dni){
        DNI = dni;
    }
    public Persona(){}

    public void mostrar(){
        System.out.println("Datos de la persona");
        System.out.println("ID: " +Id);
        System.out.println("Nombre: " +Nombre);
        System.out.println("Edad: " +Edad);
        System.out.println("Fecha de Nacimiento: " +FechaNacimiento);
        System.out.println("DNI: " +DNI);
    }

    public boolean esMayorDeEdad(Integer edad){
        return edad>=18 ? true : false;
    }
}
