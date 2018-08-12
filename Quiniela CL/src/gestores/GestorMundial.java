
package gestores;

import cl.Mundial;
import java.io.IOException;
import java.util.ArrayList;
import multis.MultiMundial;

public class GestorMundial extends Gestor {
    
    public GestorMundial() {
        
    }
    
    public void registrarMundial(String paisSede, int anio) throws Exception{
        (new MultiMundial()).registrarMundial(paisSede, anio);
    }
    
    public ArrayList<String> listaPaises() throws Exception {
        return (new MultiMundial()).listaPaises();
    }
    
    public ArrayList<Integer> listaAnios() throws Exception {
        return (new MultiMundial()).listaAnios();
    }
    
    public ArrayList<String> listarMundiales() throws Exception {
        return (new MultiMundial()).listarMundiales();
    }
    
    public Mundial buscarMundial(String pPaisSede) {
        return logica.buscarMundial(pPaisSede);
    }
    
    public void eliminarMundial(String pPaisSede) {
        logica.elminarMundial(pPaisSede);
    }
}
