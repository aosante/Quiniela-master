
package cl;

import java.util.Objects;
import javax.swing.ImageIcon;

public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String nombreUsuario;
    private String equipoFavorito;
    private String clave;
    private ImageIcon avatar;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String correo, String nombreUsuario, String equipoFavorito, String clave, ImageIcon avatar) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.equipoFavorito = equipoFavorito;
        this.clave = clave;
        this.avatar = avatar;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEquipoFavorito() {
        return equipoFavorito;
    }

    public String getClave() {
        return clave;
    }

    public ImageIcon getAvatar() {
        return avatar;
    }

    @Override
    public String toString() {
        return "Usuario{" 
                + "nombre=" + nombre 
                + ", apellidos=" + apellidos 
                + ", correo=" + correo 
                + ", nombreUsuario=" + nombreUsuario 
                + ", equipoFavorito=" + equipoFavorito 
                + ", clave=" + clave 
                + ", avatar=" + avatar 
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nombreUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombreUsuario, other.nombreUsuario)) {
            return false;
        }
        return true;
    }
    
    

}
