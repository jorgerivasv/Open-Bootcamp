public class Main {
    public static void main(String[] args) {
        suma( 10 , 20, 30);

        Coche miCoche = new Coche();
        miCoche.incrementaPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println(resultado);

        return resultado;
    }
}

class Coche {
    public int puertas = 0;

    public void incrementaPuerta() {
        this.puertas++;
    }
}