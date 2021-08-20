package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class ControladorDeRequerimientos {
    
    private final Requerimiento_1Dao REQUIRIMIENTO_1Dao;
    private final Requerimiento_2Dao REQUIRIMIENTO_2Dao;
    private final Requerimiento_3Dao REQUIRIMIENTO_3Dao;

    public ControladorDeRequerimientos(){
        this.REQUIRIMIENTO_1Dao= new Requerimiento_1Dao();
        this.REQUIRIMIENTO_2Dao= new Requerimiento_2Dao();
        this.REQUIRIMIENTO_3Dao= new Requerimiento_3Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código
            return  this.REQUIRIMIENTO_1Dao. requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            return this.REQUIRIMIENTO_2Dao.requerimiento2();
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            return this.REQUIRIMIENTO_3Dao.requerimiento3();
        } 

}
