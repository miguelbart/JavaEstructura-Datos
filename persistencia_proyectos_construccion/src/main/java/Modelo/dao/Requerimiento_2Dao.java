package Modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import Util.JDBCUtilities;

import Modelo.vo.Requerimiento_2;

public class Requerimiento_2Dao {
    //Obtener los 10 proyectos rankeados según las compras
    public ArrayList<Requerimiento_2> requerimiento2()  throws SQLException {
        // Su código
        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();
        // Su código
        try{
            String consulta =   "Select Nombre, Primer_Apellido, Ciudad_Residencia, Cargo, Salario as 'Ingreso mensual'"+
                                "From Lider "+
                                "Where (Cargo = 'Asesor' OR Cargo = 'Coordinador') AND Salario <= 250000; ";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            ResultSet resultSet = statement.executeQuery();

            while(resultSet.next()){
                Requerimiento_2 requerimiento_2 = new Requerimiento_2();
                requerimiento_2.setNombre(resultSet.getString("Nombre"));
                requerimiento_2.setPrimer_Apellido(resultSet.getString("Primer_Apellido"));
                requerimiento_2.setCiudad_Residencia(resultSet.getString("Ciudad_Residencia"));
                requerimiento_2.setCargo(resultSet.getString("Cargo"));
                requerimiento_2.setSalario(resultSet.getString("Ingreso mensual"));

                respuesta.add(requerimiento_2);
            }
            resultSet.close();
            statement.close();
        }catch(SQLException e){
            System.out.println("Error consultando " + e);
        }finally{
            if(conexion != null){
                conexion.close();
            }
        }
        return respuesta;
    }

}
