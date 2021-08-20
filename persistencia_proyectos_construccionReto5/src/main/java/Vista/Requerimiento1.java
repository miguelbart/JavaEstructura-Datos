package Vista;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import java.awt.BorderLayout;

import Controlador.ControladorDeRequerimientos;
import Modelo.vo.Requerimiento_1;

public class Requerimiento1 extends JFrame {

    public Requerimiento1() throws SQLException{
        initUI();
    }
    private void initUI() throws SQLException{
        setLayout(new BorderLayout());
        String[]nombres = {"Ciudad", "Acabados", "Clasificación", "Banco_vinculado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres);
        JScrollPane scrollPanel = new JScrollPane(tabla);
        getContentPane().add(scrollPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);        
    }


    public String[][] mostrar() throws SQLException{
        ControladorDeRequerimientos controlador = new ControladorDeRequerimientos();
        ArrayList<Requerimiento_1> lista1 = new ArrayList<Requerimiento_1>();
         
        lista1 = controlador.consultarRequerimiento1();
        String matriz[][] = new String[lista1.size()][5];
        for(int i = 0; i<lista1.size(); i++){
            matriz[i][0]=String.valueOf(lista1.get(i).getCiudad());
            matriz[i][1]=String.valueOf(lista1.get(i).getAcabados());
            matriz[i][2]=String.valueOf(lista1.get(i).getClasificacion());
            matriz[i][3]=String.valueOf(lista1.get(i).getBanco_Vinculado());
            matriz[i][4]=String.valueOf(lista1.get(i).getConstructora());
        }
         return matriz;
    }
}
