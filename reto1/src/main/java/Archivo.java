import java.io.*;
import java.io.FileReader;

public class Archivo {
    public static void main(String[] args) {

        File archivo = new File("C:\\Users\\miguel.barragan\\Documents\\grupo64.txt");

        System.out.println("canRead():" + archivo.canRead());
        System.out.println("canWrite():" +archivo.canWrite());
        System.out.println("exists():" +archivo.exists());
        System.out.println("getName():" +archivo.getName());
        System.out.println("getParent():" +archivo.getParent());
        System.out.println("isDirectory():" +archivo.isDirectory());
        System.out.println("isFile():" + archivo.isFile());
        System.out.println("length():" +archivo.length());
    }
}

