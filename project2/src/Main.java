public class Main {
    public static void main(String[] args) {

        var numeroIf = -10;

        if (numeroIf > 0) {
            System.out.println("la variable es positiva");
        } else if (numeroIf < 0) {
            System.out.println("la variable es negativa");
        } else {
            System.out.println("la variable es 0");
        }

        var numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        while (numeroWhile < 3);

        var numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

    var estacion = "otra";

        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            default:
                System.out.println("variable NO es una estacion");
            }
    }
}