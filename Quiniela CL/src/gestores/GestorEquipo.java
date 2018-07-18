
package gestores;

import cl.Equipo;
import java.io.IOException;
import javax.swing.ImageIcon;

public class GestorEquipo extends Gestor{
    
    
    public GestorEquipo() {
        
    }
    
    public boolean registrarEquipos(String nombrePais, String codigoISO, int ranking, ImageIcon bandera) {
        boolean existe = false;
        Equipo equipo = new Equipo(nombrePais, codigoISO, ranking, bandera);
        existe = logica.registrarEquipos(equipo);
        return existe;
    }
    
    public String[] listarEquipos() throws IOException {
        return logica.listarEquipos();
    }
    
    public Equipo buscarEquipo(String pCodigoISO) {
        return logica.buscarEquipos(pCodigoISO);
    }
    
    public void eliminarEquipo(String pCodigoISO) {
        logica.elminarEquipo(pCodigoISO);
    }
}
