public class Main {
    public static void main(String[] args){
        Cliente cliente=new Cliente();
        cliente.setNombre("Juan");
        cliente.setEdad(27);
        cliente.setTelefono("3126589658");
        cliente.setCredito(5000000);
        System.out.println(cliente.getNombre()+" Tiene "+cliente.getEdad()+" años, su celular es "+ cliente.getTelefono()+" y tiene un crétido de $"+cliente.getCredito());
    }
}

class Cliente extends Persona{
    double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}