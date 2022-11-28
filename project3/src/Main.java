public class Main {
    public static void main(String[] args) {

    Persona miPerson = new Persona();

    miPerson.setEdad(28);
    miPerson.setNombre("Jorge Rivas");
    miPerson.setTelefono("+56979590724");

    System.out.println(miPerson.getEdad());
    System.out.println(miPerson.getNombre());
    System.out.println(miPerson.getTelefono());

    }
}

class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad () {
        return this.edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre () {
        return this.nombre;
    }
    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono () {
        return this.telefono;
    }
}