public class Main {
    public static void main(String[] args) {
        
        String[] nombres = {"giuseppe", "martin", "silvana"};

        String concat = "nombres: ";

        for (int i = 0; i < nombres.length; i++){
            concat += nombres[i] + "; ";
        }

        System.out.println(concat);

    }
}