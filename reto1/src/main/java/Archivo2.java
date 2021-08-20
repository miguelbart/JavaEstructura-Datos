import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Archivo2 {
    public static void main(String[] args) {
        leer_fichero leer = new leer_fichero();
        //leer.lee();
        leer.escribir();
    }
    
}

class leer_fichero{

    public void lee(){
        File texto = new File("C:\\Users\\miguel.barragan\\Documents\\grupo64.txt");
      
        try{
            FileReader archivo= new FileReader(texto);
            int c = 0;
            while(c!=-1){
                c = archivo.read();
                System.out.print((char)c);
            }
            archivo.close();
            //System.out.println("length():" +texto.length());
        }catch(IOException e){
            System.out.println("no se encuentra el archivo");
        }
    }

    public void escribir(){
        String frase = " Y tambien Dylan es muy cansocito y Esteban no hace las tareas   ";

        try {
            FileWriter escritura = new FileWriter("C:\\Users\\miguel.barragan\\Documents\\grupo64.txt", true );
            for (int i=0; i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
