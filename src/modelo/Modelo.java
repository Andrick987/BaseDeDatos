package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

public class Modelo {
    Statement statement= null;
    
    Connection conex;
    ResultSet resultSet;
    
   public void CrearUsuario(String usuario, String contraseña)
    {
        try
            {
                Conexion connection = new Conexion();
                conex = connection.Conectar();
                statement = conex.createStatement();

                String sqlQuery = "CREATE USER '"+usuario+"'@'localhost' IDENTIFIED BY '"+ contraseña+ "'";
                statement.executeUpdate(sqlQuery);
                JOptionPane.showMessageDialog(null, "Usuario creado");

            
            
            }
            catch(SQLException ex)
            {
              JOptionPane.showMessageDialog(null, "No se pudo Guardar..."+ex.getMessage());
            }  
    }
   public void Insertar(String usuario)
   {
        try
        {
            Conexion connection = new Conexion();
            conex = connection.Conectar();
            statement = conex.createStatement();
            String sqlQuery ="GRANT INSERT ON tienda.* TO '"+usuario+"'@'localhost'";
            statement.executeUpdate(sqlQuery);
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "No se pudo Guardar..."+ex.getMessage());
        }  
    }
   
   public void Editar(String usuario)
   {
        try
        {
            Conexion connection = new Conexion();
            conex = connection.Conectar();
            statement = conex.createStatement();
            String sqlQuery ="GRANT UPDATE ON tienda.* TO '"+usuario+"'@'localhost'";
            statement.executeUpdate(sqlQuery);
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "No se pudo Guardar..."+ex.getMessage());
        }  
    }
   public void Eliminar(String usuario)
   {
        try
        {
            Conexion connection = new Conexion();
            conex = connection.Conectar();
            statement = conex.createStatement();
            String sqlQuery ="GRANT DELETE ON tienda.* TO '"+usuario+"'@'localhost'";
            statement.executeUpdate(sqlQuery);
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "No se pudo Guardar..."+ex.getMessage());
        }  
    }
    public void AllPrivilegios(String usuario)
   {
        try
        {
            Conexion connection = new Conexion();
            conex = connection.Conectar();
            statement = conex.createStatement();
            String sqlQuery ="GRANT ALL PRIVILEGES ON tienda.* TO '"+usuario+"'@'localhost'";
            statement.executeUpdate(sqlQuery);
            JOptionPane.showMessageDialog(null, "Permisos Concedidos");
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "No se pudo Guardar..."+ex.getMessage());
        }  
    }
      
}

