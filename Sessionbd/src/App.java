import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        
        String url = "jdbc:sqlite:/C:\\Users\\miguel.barragan\\Documents\\DB\\hr.db";
        String user = "";
        String password = "";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url); // realizo la con
            stmt = conn.createStatement();  //  permite realizar comandos

            rs = stmt.executeQuery("SELECT salary, salary+300 as salario FROM employees");
            
            while (rs.next()) {
                
                int id = rs.getInt("salario");
                int id1 = rs.getInt("salary");
                //String nombre = rs.getString("first_name");
                //String apellido = rs.getString("last_name");
//System.out.println(id+" "+nombre+" "+apellido);
//System.out.println(id);
System.out.println(id+" "+id1);              
            }
            rs.close();
            
        } catch (SQLException e) {
            // Manejo de los errores
            System.out.println(e);
        }     
    }
}

