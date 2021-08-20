import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EntradaSalida1 {
    public static void main(String arg[]) {
        String línea=null;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter salida = new PrintWriter(System.out, true);
        salida.println("\nEscribe el texto: ");
        try {

        línea = entrada.readLine();

        } catch (Exception e) {
        System.err.println(e);
        }
        salida.println("\nLa línea escrita es: ");
        salida.println(línea);
        }
}
