
package gestores;

import cl.Grupo;
import cl.Mundial;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestorMundial extends Gestor {
    
    public GestorMundial() {
        
    }
    
    public boolean registrarMundiales(String paisSede, LocalDate anio, ArrayList<Grupo> listaGrupo) {
        boolean existe = false;
        Mundial mundial = new Mundial();
        existe = logica.registrarMundiales(mundial);
        return existe;
    }
    
    public String[] listarMundiales() throws IOException {
        return logica.listarMundiales();
    }
    
    public Mundial buscarMundial(String pPaisSede) {
        return logica.buscarMundial(pPaisSede);
    }
    
    public void eliminarMundial(String pPaisSede) {
        logica.elminarMundial(pPaisSede);
    }
}
