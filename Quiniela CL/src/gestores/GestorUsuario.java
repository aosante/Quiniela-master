/**
 * esta clase se encarga de gestionar datos entre la interfaz de usuario 
 * y la base de datos
 */
package gestores;

import cl.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import multis.MultiUsuario;

public class GestorUsuario extends Gestor{
    
    public GestorUsuario() {
        
    }
    /**
     * 
     * @param nombre del usuario
     * @param apellidos del usuario
     * @param correo del usuario
     * @param nombreUsuario del usuario
     * @param codEquipo del equipo favorito del usuario
     * @param clave del usuario
     * @param avatar del usuario
     * @throws Exception excepcion
     */
    public void registrarUsuarios(String nombre, String apellidos, String correo, String nombreUsuario, String codEquipo, String clave, byte[] avatar) throws Exception {
       (new MultiUsuario()).registrarUsuario(nombre, apellidos, correo, nombreUsuario, codEquipo, clave, avatar);
    }
    
  
    /**
     * 
     * @param pNombreUsuario nombre de usuario a buscar
     * @return treemap con los datos del usuario encontrado
     * @throws Exception excepcion
     */
    public TreeMap buscarUsuario(String pNombreUsuario) throws Exception {
        TreeMap datos = null;
        Usuario user = null;
        String nombre;
        datos = new TreeMap();
        user = (new MultiUsuario().buscarUsuario(pNombreUsuario));
        datos.put("nombreUsuario", user.getNombreUsuario());
        datos.put("clave", user.getClave());
        return datos;
    }
    
    
}
