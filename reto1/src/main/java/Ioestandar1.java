import java.io.IOException;

import javax.swing.text.StyledEditorKit.StyledTextAction;

public class Ioestandar1 {
    
    public static void main(String[] args) {
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto: ");

        try{
            do{
                System.out.println("->");
                caracter = (char) System.in.read();
                System.out.println(caracter);
                numBytes++;
            } while (caracter != '\n');
            System.err.printf("%d bytes leidos %n", numBytes);
        }catch (IOException e){
            System.err.println(e);
        }
    }
}
