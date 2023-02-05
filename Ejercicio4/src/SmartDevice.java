public class SmartDevice {
    String diseno;
    String color;
    double peso;

    public SmartDevice(){}

    public SmartDevice(String diseno, String color, double peso) {
        this.diseno = diseno;
        this.color = color;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "diseno='" + diseno + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}

class SmarthPhone extends SmartDevice {

    String marca;

    public SmarthPhone(){}

    public SmarthPhone(String diseno, String color, double peso, String marca) {
        super(diseno, color, peso);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SmarthPhone{" +
                "marca='" + marca + '\'' +
                ", diseno='" + diseno + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}

class SmartWatch extends SmartDevice {

    double largo;

    public SmartWatch(){}

    public SmartWatch(String diseno, String color, double peso, double largo) {
        super(diseno, color, peso);
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "largo=" + largo +
                ", diseno='" + diseno + '\'' +
                ", color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
