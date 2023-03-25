import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.*;

public class Sesion7 {
    public Sesion7() {
    }

    public static void demoStrings() {
        String cadena = "Esto es una cadena";
        int cadenaLen = cadena.length();
        System.out.println(cadenaLen);
        String cadenaMinus = cadena.toLowerCase();
        System.out.println(cadenaMinus);
        String cadenaMayus = cadena.toUpperCase();
        System.out.println(cadenaMayus);
        if (cadena.startsWith("Es")) {
            System.out.println("La cadena empieza por \"Es\"");
        }

        if (cadena.startsWith("hola")) {
            System.out.println("La cadena empieza por \"hola\"");
        }

        if (cadena.endsWith("cadena")) {
            System.out.println("La cadena finaliza por \"cadena\"");
        }

        if (cadena.endsWith("adios")) {
            System.out.println("La cadena finaliza por \"adios\"");
        }

        for(int i = 0; i < cadena.length(); ++i) {
            char caracter = cadena.charAt(i);
            System.out.println("Caracter: " + caracter);
        }

    }

    public static void demoArrays() {
        int[] arrayUno = new int[]{1, 2, 3, 4, 5};
        String[] arrayDos = new String[]{"Naranja", "Limon", "Pomelo"};

        for(int i = 0; i < arrayUno.length; ++i) {
            System.out.println("Posicion del array " + i + " contiene el valor " + arrayUno[i]);
        }

        String[] var7 = arrayDos;
        int i = arrayDos.length;

        for(int k = 0; k < i; ++k) {
            String citrico = var7[k];
            System.out.println("Cítrico actual " + citrico);
        }

        int[][] arrayBidiUno = new int[2][4];
        arrayBidiUno[0][0] = 1;
        arrayBidiUno[0][1] = 2;
        arrayBidiUno[0][2] = 3;
        arrayBidiUno[0][3] = 4;
        arrayBidiUno[1][0] = 10;
        arrayBidiUno[1][1] = 20;
        arrayBidiUno[1][2] = 30;
        arrayBidiUno[1][3] = 40;

        for(i = 0; i < arrayBidiUno.length; ++i) {
            for(int j = 0; j < arrayBidiUno[i].length; ++j) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiUno[i][j]);
            }
        }

        int[][] arrayBidiDos = new int[][]{{1, 2, 3, 4}, {10, 20, 30, 40}};

        for(i = 0; i < arrayBidiDos.length; ++i) {
            for(int j = 0; j < arrayBidiDos[i].length; ++j) {
                System.out.println("Posición: [" + i + "][" + j + "] y contiene el valor " + arrayBidiDos[i][j]);
            }
        }

        i = arrayUno.length * 2;
        int[] nuevoArray = new int[i];

        for(int j = 0; j < arrayUno.length; ++j) {
            nuevoArray[j] = arrayUno[j];
        }

        System.arraycopy(arrayUno, 0, nuevoArray, 5, arrayUno.length);
    }

    public static void demoVector() {
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Contenido del vector: " + vector);
        vector.remove(1);
        System.out.println("Contenido del vector: " + vector);
        PrintStream var10000 = System.out;
        int var10001 = vector.size();
        var10000.println("Tamaño: " + var10001 + " - Capacidad: " + vector.capacity());
        vector.trimToSize();
        var10000 = System.out;
        var10001 = vector.size();
        var10000.println("Tamaño: " + var10001 + " - Capacidad: " + vector.capacity());
        vector.add(9);
        var10000 = System.out;
        var10001 = vector.size();
        var10000.println("Tamaño: " + var10001 + " - Capacidad: " + vector.capacity());

        for(int i = 0; i < vector.size(); ++i) {
            System.out.println("Valor en la posicion " + i + " del vector: " + vector.get(i));
        }

        Iterator var3 = vector.iterator();

        while(var3.hasNext()) {
            int i = (Integer)var3.next();
            System.out.println("Valor actual del vector: " + i);
        }

        Vector<Integer> vector2 = new Vector();
        vector2.add(1);
        vector2.add(3);
        vector2.add(9);
        if (vector.equals(vector2)) {
            System.out.println("Los dos vectores son equivalentes");
            System.out.println("    -> vector: " + vector);
            System.out.println("    -> vector2: " + vector2);
        }

    }

    public static void demoList() {
        ArrayList<String> lista = new ArrayList();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        System.out.println("Contenido de la lista: " + lista);
        lista.remove("Dos");
        System.out.println("Contenido de la lista: " + lista);
        System.out.println("Tamaño: " + lista.size());

        for(int i = 0; i < lista.size(); ++i) {
            System.out.println("Valor en la posicion " + i + " de la lista: " + (String)lista.get(i));
        }

        Iterator var7 = lista.iterator();

        while(var7.hasNext()) {
            String e = (String)var7.next();
            System.out.println("Valor actual de la lista: " + e);
        }

        ArrayList<String> lista2 = new ArrayList();
        lista2.add("Uno");
        lista2.add("Tres");
        if (lista.equals(lista2)) {
            System.out.println("Las dos listas son equivalentes");
            System.out.println("    -> lista: " + lista);
            System.out.println("    -> lista2: " + lista2);
        }

        String[] array = new String[lista.size()];

        for(int i = 0; i < lista.size(); ++i) {
            array[i] = (String)lista.get(i);
        }

        String[] var10 = array;
        int var4 = array.length;

        int var5;
        String elemento;
        for(var5 = 0; var5 < var4; ++var5) {
            elemento = var10[var5];
            System.out.println("Elemento de la lista convertida en array es: " + elemento);
        }

        Object[] var11 = lista.toArray();
        var4 = var11.length;

        for(var5 = 0; var5 < var4; ++var5) {
            Object arrayObjeto = var11[var5];
            System.out.println("Elemento de la lista convertida en array es: " + arrayObjeto.toString());
        }

        LinkedList<String> listaEnlazada = new LinkedList();
        listaEnlazada.add("Hola");
        System.out.println((String)listaEnlazada.get(0));
        listaEnlazada.remove("Hola");
        LinkedList<String> listaEnlazadaDos = new LinkedList(lista);
        Iterator var14 = listaEnlazadaDos.iterator();

        while(var14.hasNext()) {
            elemento = (String)var14.next();
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
        }

    }

    public static void demoMap() {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 1);
        mapa.put("clave2", 2);
        mapa.put("clave3", 3);
        System.out.println("Valor de \"clave2\": " + mapa.get("clave2"));
        mapa.remove("clave2");
        mapa.put("clave3", 4);
        System.out.println("Valor de \"clave3\": " + mapa.get("clave3"));
        mapa.replace("clave3", 100);
        Iterator var1 = mapa.entrySet().iterator();

        while(var1.hasNext()) {
            Map.Entry<String, Integer> elemento = (Map.Entry)var1.next();
            PrintStream var10000 = System.out;
            String var10001 = (String)elemento.getKey();
            var10000.println("Clave: " + var10001 + " - Valor: " + elemento.getValue());
        }

    }

    public static void demoMath() {
        double valorInicial = 3.140000104904175;
        BigDecimal valorA = BigDecimal.valueOf(valorInicial);
        double valorSecundario = 3.1500000953674316;
        BigDecimal valorB = BigDecimal.valueOf(valorSecundario);
        BigDecimal resultado = valorA.add(valorB);
        System.out.println(resultado);
    }
}