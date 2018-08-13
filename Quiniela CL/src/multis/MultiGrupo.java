
package multis;

import acceso.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author andresosante
 */
public class MultiGrupo {
    
    public void registrarGrupo(String nombre) throws SQLException, Exception {
        /*Aqui debo de permitir registrar solo si el rowcount de los grupos con
        el anioMundial del mundial activo es menor que 8*/
        String sql;
        sql = "INSERT INTO GRUPO (nombre) VALUES ('" + nombre + "');";       
        String sqlActualizarIdMundial;
        //esta sentencia se ejecuta en donde el nombre sea igual Y EL ANIOMUNDIAL SE 
        sqlActualizarIdMundial = "UPDATE GRUPO SET anioMundial = ( SELECT anio FROM MUNDIAL WHERE estado = 'activo' ) WHERE nombre =  '" + nombre + "' AND anioMundial IS NULL;";
        try {
            Conector.getConector().ejecutarSQL(sql);
            Conector.getConector().ejecutarSQL(sqlActualizarIdMundial);
        } catch(Exception e) {
            throw new Exception("Ya existe un grupo registrado bajo ese nombre o código");
        }
    }
    
    public ArrayList<String>  listaGrupos() throws SQLException, Exception {   
        ArrayList<String> listaGrupos = new ArrayList();
        String sql;
        sql = "SELECT * FROM GRUPO where anioMundial = (SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            ResultSet rs = null;
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while (rs.next()) {
                listaGrupos.add(rs.getString("nombre"));
            }
        } catch(Exception e) {
            throw new Exception("No hay grupos registrados");
            
        }
    return listaGrupos;
}
    
    //modificar para que se elimine donde tenga el anioMundial activo
    public void eliminarGrupo(String nombre) throws SQLException, Exception {
        String sql;
        sql = "DELETE FROM GRUPO WHERE nombre = '" + nombre + "' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo'));";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception("No se pudo eliminar el grupo");
        }
    }
    
}
