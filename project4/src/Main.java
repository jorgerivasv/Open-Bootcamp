public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 28;
        cliente.nombre = "Jorge Rivas";
        cliente.telefono = 979590724;
        cliente.credito = 10000;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi teléfono es " + cliente.telefono +
                " y mi crédito disponible es: " + cliente.credito + "€");

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 28;
        trabajador.nombre = "Jorge Rivas";
        trabajador.telefono = 979590724;
        trabajador.salario = 10000;

        System.out.println("Soy " + cliente.nombre + ", tengo " + cliente.edad + " años, mi teléfono es " + cliente.telefono +
                " y mi salario es: " + cliente.credito + "€");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
