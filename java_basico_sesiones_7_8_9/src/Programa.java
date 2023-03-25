import java.io.*;
import java.util.*;

public class Programa {
    public static void go() {
        Scanner scanner;
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        boolean ok = false;
        HashMap<String, String> mapa = new HashMap<>();
        do {
            scanner = new Scanner(System.in);
            System.out.println("Mete cuatro palabras: ");
            try {
                mapa.put("palabra1", scanner.next());
                mapa.put("palabra2", scanner.next());
                mapa.put("palabra3", scanner.next());
                mapa.put("palabra4", scanner.next());
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("números inválidos");
            }
        } while (!ok);

        Iterator var1 = mapa.entrySet().iterator();
        ArrayList<String> str = new ArrayList();
        int s = 0;
        while(var1.hasNext()) {
            Map.Entry<String, String> elemento = (Map.Entry) var1.next();
            String key = (String) elemento.getKey();
            System.out.println("Clave: " + key + " - Valor: " + elemento.getValue());
            str.add(elemento.getValue());
            s++;
        }

        Iterator var2 = str.iterator();
        int j = 0;
        while(var2. hasNext()) {
            String elemento2 = (String)var2.next();
            System.out.println("palabras " + j + " ingresada: " + elemento2);
            j++;
        }

        try {
            Writer wr = new FileWriter("output.txt");
            wr.write(a + " " + b + " " + c + " " + d);
            wr.close();
        } catch (Exception e){
            System.out.println("problema" + e.getMessage());
        }
    }
}
