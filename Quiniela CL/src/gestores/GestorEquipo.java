/**
 * Esta clase se encarga de gestionar datos entre la interfaz gráfica
 * y la base de datos. Maneja datos relacionados a los equipos.
 */
package gestores;

import cl.Equipo;
import java.util.ArrayList;
import multis.MultiEquipo;

public class GestorEquipo extends Gestor{
    
    
    public GestorEquipo() {
        
    }
    /**
     * 
     * @param nombrePais nombre del país
     * @param codigoISO del país
     * @param ranking FIFA del país
     * @throws Exception excepcion
     */
    public void registrarEquipo(String nombrePais, String codigoISO, int ranking) throws Exception  {
        Equipo equipo = new Equipo(nombrePais, codigoISO, ranking, null);
        (new MultiEquipo()).registrarEquipo(equipo);
    }
    
    /**
     * 
     * @return arraylist de string con los equipos registrados
     * @throws Exception excepcion
     */
    public ArrayList<String> listarEquipos() throws Exception {
        return (new MultiEquipo()).listarEquipos();
    }
    

    
    /**
     * 
     * @param nombre del equipo a eliminar
     * @throws Exception excepcion
     */
    public void eliminarEquipo(String nombre) throws Exception  {
       (new MultiEquipo()).eliminarEquipo(nombre);
    }
}
