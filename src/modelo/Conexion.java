
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author umg
 */
public class Conexion {
      Connection conectar=null;
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            conectar=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/tienda", "root", "");
            JOptionPane.showMessageDialog(null, "Se ha conectado");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar" +" "+ e.getMessage());
        }
        return conectar;
    } 
    
}
