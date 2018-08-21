/**
 * Esta clase se encarga de gestionar los datos de la interfaz
 * hacia y desde la base de datos
 */
package gestores;

import cl.Mundial;
import java.io.IOException;
import java.util.ArrayList;
import multis.MultiMundial;

public class GestorMundial extends Gestor {
    
    public GestorMundial() {
        
    }
    /**
     * 
     * @param paisSede del mundial
     * @param anio año del mundial
     * @throws Exception excepcion
     */
    public void registrarMundial(String paisSede, int anio) throws Exception{
        Mundial mund = new Mundial(paisSede, anio);
        (new MultiMundial()).registrarMundial(mund);
    }
    /**
     * 
     * @return arryalist de strings con los paises registrados 
     * @throws Exception excepcion
     */
    public ArrayList<String> listaPaises() throws Exception {
        return (new MultiMundial()).listaPaises();
    }
    /**
     * 
     * @return arraylisy de entero con los años registrados
     * @throws Exception excepcion
     */
    public ArrayList<Integer> listaAnios() throws Exception {
        return (new MultiMundial()).listaAnios();
    }
    /**
     * 
     * @return arraylist de string con los mundiales registrados (año y pais)
     * @throws Exception excepcion 
     */
    public ArrayList<String> listarMundiales() throws Exception {
        return (new MultiMundial()).listarMundiales();
    }
    /**
     * 
     * @param anio año del mundial a activar
     * @throws Exception excepcion
     */
    public void activarMundial(String anio) throws Exception {
        (new MultiMundial()).activarMundial(anio);
    }
    /**
     * 
     * @return String con el mundial activado
     * @throws Exception excepcion
     */
    public String seleccionarMundialActivado() throws Exception {
        return (new MultiMundial()).seleccionarMundialActivo();
    }
    
    /**
     * 
     * @param anio año del mundial a eliminar
     * @throws Exception excepcion
     */
    public void eliminarMundial(String anio) throws Exception{
        (new MultiMundial()).eliminarMundial(anio);
    }
}
