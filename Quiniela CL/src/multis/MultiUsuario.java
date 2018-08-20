/**
 * Esta clase se encarga de registrar y de buscar los usuario regsitrados
 */
package multis;

import acceso.Conector;
import cl.Usuario;
import java.sql.ResultSet;

/**
 *
 * @author andresosante
 */
public class MultiUsuario {
    
    
    
    
    /**
     * 
     * @param nombre del usuario
     * @param apellido del usuario
     * @param correo del usuario
     * @param nombreUsuario nombre del usuario para la aplicacion
     * @param nombreEquipo nombre del equipo favorito del usuario
     * @param clave del usuario
     * @param avatar del usuario
     * @throws java.sql.SQLException excepcion de sql en caso de que el nombre de usuario ya exista
     * @throws Exception excepcion 
     */
    public void registrarUsuario(String nombre, String apellido, String correo, String nombreUsuario, String nombreEquipo, String clave, byte[] avatar)
    throws java.sql.SQLException, Exception {
        String sql;
        sql = "INSERT INTO USUARIO (nombre, apellido, correo, nombreUsuario, nombreEquipo, clave, puntaje, avatar) "
                + "VALUES ('" + nombre + "', '" + apellido + "', '" + correo + "', '" + nombreUsuario + "', '" + nombreEquipo + "', '" + clave + "', " + 100 + ", " + null + ");";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception ("Ya existe un usuario con el mismo nombre de usuario");
        }
    }
    
    //CAMBIAR EQUIPO Y AVATAR
    /**
     * 
     * @param nombreUsuario nombre del usuario
     * @return usuario registrado bajo ese nombre
     * @throws java.sql.SQLException excepcion de SQL en caso de que no exista un usuairo registrado bajo ese nombre de usuario 
     * @throws Exception excepcion 
     */
    public Usuario buscarUsuario(String nombreUsuario) throws java.sql.SQLException, Exception {
        String sql;
        sql = "SELECT nombre, apellido, correo, nombreUsuario, nombreEquipo, clave, puntaje, avatar "
                + "FROM USUARIO WHERE nombreUsuario= '" + nombreUsuario + "';";
        Usuario user = null;
        ResultSet rs = null;
        rs = Conector.getConector().ejecutarSQL(sql, true);
        if(rs.next()) {
            user = new Usuario(rs.getString("nombre"), rs.getString("apellido"), rs.getString("correo"), rs.getString("nombreUsuario"), null, rs.getString("clave"), rs.getInt("puntaje"), null );
        } else {
            throw new Exception("El usuario no está registrado en el sistema");
        }
        return user;
    }
    
    
}
