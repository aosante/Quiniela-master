
package gestores;

import cl.Usuario;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class GestorUsuario extends Gestor{
    
    public GestorUsuario() {
        
    }
    
    public boolean registrarUsuarios(String nombre, String apellidos, String correo, String nombreUsuario, String equipoFavorito, String clave, ImageIcon avatar) {
        Usuario usuario = new Usuario(nombre, apellidos, correo, nombreUsuario, equipoFavorito, clave, avatar);
        return logica.registrarUsuarios(usuario);
    }
    
    public String[] listarUsuarios() throws IOException {
        return logica.listarUsuarios();
    }
    
    public Usuario buscarUsuario(String pNombreUsuario) {
        return logica.buscarUsuario(pNombreUsuario);
    }
    
    public void eliminarUsuario(String pNombreUsuario) {
        logica.elminarUsuario(pNombreUsuario);
    }
    
    public ArrayList listaUsuarios() {
        return logica.getListaUsuarios();
    }
}
