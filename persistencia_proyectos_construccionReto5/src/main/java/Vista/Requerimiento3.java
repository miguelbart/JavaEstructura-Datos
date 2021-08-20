package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.BorderLayout;

import Controlador.ControladorDeRequerimientos;
import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame {

    public Requerimiento3() throws SQLException{
        initUI();
    }
    private void initUI() throws SQLException{

        setLayout(new BorderLayout());
        String[]nombres = {"Proveedor", "Pagado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public String[][] mostrar() throws SQLException{
        ControladorDeRequerimientos controlador = new ControladorDeRequerimientos();
        ArrayList<Requerimiento_3> lista1 = new ArrayList<Requerimiento_3>();
         
        lista1 = controlador.consultarRequerimiento3();
        String matriz[][] = new String[lista1.size()][5];
        for(int i = 0; i<lista1.size(); i++){
            matriz[i][0]=String.valueOf(lista1.get(i).getProveedor());
            matriz[i][1]=String.valueOf(lista1.get(i).getPagado());
            matriz[i][2]=String.valueOf(lista1.get(i).getConstructora());
        }
         return matriz;
    }
}

