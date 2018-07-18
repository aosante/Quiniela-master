
package gestores;

import cl.Usuario;
import java.io.IOException;
import javax.swing.ImageIcon;

public class GestorUsuario extends Gestor{
    
    public GestorUsuario() {
        
    }
    
    public boolean registrarUsuarios(String nombre, String apellidos, String correo, String nombreUsuario, String equipoFavorito, String clave, ImageIcon avatar) {
        boolean existe = false;
        Usuario usuario = new Usuario();
        existe = logica.registrarUsuarios(usuario);
        return existe;
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
}
