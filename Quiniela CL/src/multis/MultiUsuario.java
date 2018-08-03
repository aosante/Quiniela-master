/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    
    
    
    
    public void registrarUsuario(String nombre, String apellido, String correo, String nombreUsuario, String codEquipo, String clave, byte[] avatar)
    throws java.sql.SQLException, Exception {
        String sql;
        sql = "INSERT INTO USUARIO (nombre, apellido, correo, nombreUsuario, codEquipo, clave, puntaje, avatar) "
                + "VALUES ('" + nombre + "', '" + apellido + "', '" + correo + "', '" + nombreUsuario + "', '" + codEquipo + "', '" + clave + "', " + 100 + ", " + null + ");";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception ("Ya existe un usuario con el mismo nombre de usuario");
        }
    }
    
    //CAMBIAR EQUIPO Y AVATAR
    public Usuario buscarUsuario(String nombreUsuario) throws java.sql.SQLException, Exception {
        String sql;
        sql = "SELECT nombre, apellido, correo, nombreUsuario, codEquipo, clave, puntaje, avatar "
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
