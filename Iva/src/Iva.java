public class Iva {
    public static void main(String[] args) {

        double precio = 100.99;

        System.out.println(iva(precio));
    }

    private static double iva(double precio) {
        return precio * 1.19;
    }
}