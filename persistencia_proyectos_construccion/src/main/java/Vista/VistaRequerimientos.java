package Vista;

import java.util.ArrayList;

import Controlador.ControladorDeRequerimientos;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorDeRequerimientos CONTROLADOR = new ControladorDeRequerimientos();

    public static void requerimiento1(){
        
        try {
            // Su código
            ArrayList<Requerimiento_1> lista1 =CONTROLADOR.consultarRequerimiento1();

            for(Requerimiento_1 reque : lista1){
                System.out.printf("%s | %s | %s | %s | %s | %s |%n",
                    reque.getCiudad(),
                    reque.getAcabados(),
                    reque.getClasificacion(),
                    reque.getClasificacion(),
                    reque.getBanco_Vinculado(),
                    reque.getConstructora());

            }

        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento2(){
        
        try {
            // Su código
            ArrayList<Requerimiento_2> lista2 = CONTROLADOR.consultarRequerimiento2();

            for (Requerimiento_2 requerimiento_2 : lista2) {
                System.out.printf("%s | %s | %s | %s | %s |%n",
                    requerimiento_2.getNombre(),
                    requerimiento_2.getPrimer_Apellido(),
                    requerimiento_2.getCiudad_Residencia(),
                    requerimiento_2.getCargo(),
                    requerimiento_2.getSalario());
            }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un error!"+e.getMessage());
        }
    }

    public static void requerimiento3(){
        try {
           // Su código
           ArrayList<Requerimiento_3> lista3 = CONTROLADOR.consultarRequerimiento3();
           for (Requerimiento_3 requerimiento_3 : lista3) {
            System.out.printf("%s | %s | %s |%n",
            requerimiento_3.getProveedor(),
            requerimiento_3.getPagado(),
            requerimiento_3.getConstructora());
           }
        } catch (Exception e) {
            System.err.println("Ha ocurrido un e!"+e.getMessage());
        }
    }
}
