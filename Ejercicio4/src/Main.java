public class Main {
    public static void main(String[] args) {

        SmartDevice device1 = new SmartDevice("compacto","negro",10.1);
        SmarthPhone device2 = new SmarthPhone("compacto","blanco",20.1, "iOS");
        SmartWatch device3 = new SmartWatch("compacto","verde",1.1,40.0);

        System.out.println(device1.toString());
        System.out.println(device2.toString());
        System.out.println(device3.toString());

    }
}