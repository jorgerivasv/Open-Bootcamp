import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sesion7.demoStrings();
        String inicio = "hola mundo";
        String resultado= reverse(inicio);
        System.out.println("ejercicio 0: Aplicar función reverse");
        System.out.println(resultado);

        System.out.println("");
        System.out.println("ejercicio 1: recorrer un array unidimensional de String");
        String[] s = new String[]{"hola","chao","buenas tardes"};
        for (int i=0; i<s.length; i++){
            System.out.println("valor del string \"s\" en posición "+i+": "+ s[i]);
        }

        System.out.println("");
        System.out.println("ejercicio 2: recorrer un array bidimensioanl de enteros");
        int[][] entero = new int[][] {{1,2,3,4},{10,20,30,40}};
        for (int i = 0; i<entero.length; i++){
            for(int j=0; j<entero[i].length; j++){
                System.out.println("valor del string \"entero\" en posición "+i+","+j+": "+ entero[i][j]);
            }
        }

        System.out.println("");
        System.out.println("ejercicio 3: Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.");
        Vector<String> v = new Vector();
        v.add("manzana");
        v.add("pera");
        v.add("naranja");
        v.add("melon");
        v.add("sandia");
        System.out.println("Contenido del vector: " + v);
        v.remove(1);
        v.remove(1);
        System.out.println("Contenido del vector: " + v);

        System.out.println("");
        System.out.println("Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.");
        System.out.println("Solución: el vector va a estar gastando memoria en ir creciendo y copiando info. Es mucho mejor iniciarlo con el valor estimado");

        System.out.println("");
        System.out.println("Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.");
        ArrayList<String> arraylist = new ArrayList();
        arraylist.add("pala");
        arraylist.add("pelota");
        arraylist.add("cancha");
        arraylist.add("red");
        LinkedList<String> listaEnlazada = new LinkedList(arraylist);
        Iterator var = listaEnlazada.iterator();
        Iterator var2 = arraylist.iterator();

        while(var.hasNext()) {
            String elemento = (String) var.next();
            String elemento2 = (String) var2.next();
            System.out.println("Elemento actual en la lista enlazada: " + elemento);
            System.out.println("Elemento actual en el array: " + elemento2);
        }

        System.out.println("");
        System.out.println("Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. ");
        System.out.println("A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a recorrerlo y muestra el ArrayList final.");

        ArrayList<Integer> array1 = new ArrayList();
        for(int i = 0; i<10; i++){
            array1.add(i+1);
        }
        // int var1 = array1.size();
        for(int i = 0; i<array1.size(); i++){
            array1.remove(i+1);
            System.out.println("array number: "+ array1.get(i));
        }
        System.out.println(array1);

        System.out.println("");
        System.out.println("Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", por ejemplo).");
        System.out.println("Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". Finalmente, mostraremos en cualquier caso: \"Demo de código\".");

        try{
            divide(4,0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");

        System.out.println("");
        System.out.println("Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\".");
        System.out.println("La tarea de la función será realizar la copia del fichero dado en el parámetro \"fileIn\" al fichero dado en \"fileOut\".");

        // path("C:/Users/Jorge/test.txt","destino.txt");

        System.out.println("");
        System.out.println("Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.");

        Programa.go();

    }

    public static void path(String x, String y) throws RuntimeException {
        try{
            InputStream in = new FileInputStream(x);
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(y);
            out.write(datos);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exceptción "+ e.getMessage()); //throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Exceptción "+ e.getMessage()); //throw new RuntimeException(e);
        }
    }

    public static int divide(int a,int b) throws ArithmeticException {
        int resultado1;
        try {
            resultado1 = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        }
        return resultado1;
    }

    public static String reverse(String texto) {

        String texto2 = "";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            texto2 =caracter + texto2;
        }
        return texto2;
    }


}