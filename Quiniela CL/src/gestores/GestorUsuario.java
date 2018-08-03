
package gestores;

import cl.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import multis.MultiUsuario;

public class GestorUsuario extends Gestor{
    
    public GestorUsuario() {
        
    }
    
    public void registrarUsuarios(String nombre, String apellidos, String correo, String nombreUsuario, String codEquipo, String clave, byte[] avatar) throws Exception {
       (new MultiUsuario()).registrarUsuario(nombre, apellidos, correo, nombreUsuario, codEquipo, clave, avatar);
    }
    
    public String[] listarUsuarios() throws IOException {
        return logica.listarUsuarios();
    }
    
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
    
    public void eliminarUsuario(String pNombreUsuario) {
        logica.elminarUsuario(pNombreUsuario);
    }
    
    public ArrayList listaUsuarios() {
        return logica.getListaUsuarios();
    }
}
