import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Sesion9 {
    public Sesion9() {
    }

    public static void leerTodo() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datos = fichero.readAllBytes();
                byte[] var2 = datos;
                int var3 = datos.length;

                for(int var4 = 0; var4 < var3; ++var4) {
                    byte dato = var2[var4];
                    System.out.print((char)dato);
                }

                fichero.close();
            } catch (IOException var6) {
                System.out.println("No puedo leerlo: " + var6.getMessage());
            }
        } catch (FileNotFoundException var7) {
            System.out.println("Fichero no encontrado: " + var7.getMessage());
        }

    }

    public static void leerByteAByte() {
        try {
            InputStream fichero = new FileInputStream("/etc/passwd");

            try {
                byte[] datos = new byte[5];

                for(int data = fichero.read(datos); data != -1; data = fichero.read()) {
                    System.out.println("Leido: '" + (char)data + "' que es el código " + data);
                }
            } catch (IOException var3) {
                System.out.println("Error al leer: " + var3.getMessage());
            }
        } catch (FileNotFoundException var4) {
            System.out.println("Error al abrir fichero: " + var4.getMessage());
        }

    }
}
