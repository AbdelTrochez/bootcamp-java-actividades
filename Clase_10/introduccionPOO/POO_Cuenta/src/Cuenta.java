public class Cuenta {
    private String Titular;
    private double Cantidad;

    public String getTitular(){
        return Titular;
    }
    public double getCantidad(){
        return Cantidad;
    }
    public void setTitular(String nombreTitular){
        Titular = nombreTitular;
    }
    private void setCantidad(double cantidad){
        Cantidad = cantidad;
    }

    public Cuenta(){
        this.Cantidad=0.0;
    }

    public void mostrar(){
        System.out.println("Datos de la Cuenta");
        System.out.println("Titular de la Cuenta: " +Titular);
        System.out.println("Cuenta: " + Cantidad);
    }

    public void ingresar(double cantidad){
        if(cantidad>0) setCantidad(cantidad);
    }

    public void retirar(double cantidad){
        setCantidad(getCantidad()-cantidad);
    }
}