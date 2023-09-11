
import Controlador.Controlador;
import Modelo.Modelo;
import vistas.frmPrincipal;


public class main {

    public static void main(String[] args) {
        
        frmPrincipal VistaPrincipal = new frmPrincipal();
        Modelo ModeloEmpleados = new Modelo();
        
        Controlador ControladorEmpleados = new Controlador(VistaPrincipal,ModeloEmpleados);
    
    }
    
}
