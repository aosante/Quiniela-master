/**
 * Esta clase se encarga de registrar, listar, y eliminar equipos
 */
package multis;

import acceso.Conector;
import cl.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author andresosante
 */
public class MultiEquipo {
    
    public void registrarEquipo(Equipo team) throws SQLException, Exception {
        String sql;
        sql = "INSERT INTO EQUIPO VALUES( '" + team.getNombrePais() + "', '" + team.getCodigoISO() + "', " + team.getRanking() + " );";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }catch(Exception e) {
            throw new Exception("Ya hay un equipo registrado bajo ese código ISO");
        }
    }
    
    public ArrayList<String> listarEquipos() throws SQLException, Exception {
        ArrayList<String> listaEquipos = new ArrayList();
        String sql;
        sql = "SELECT * FROM EQUIPO";
        ResultSet rs = null;
        try {
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while(rs.next()) {
                listaEquipos.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
            }
        }catch(Exception e) {
            throw new Exception("No hay equipos registrados");
        }
        rs.close();
        return listaEquipos;
    }
    
    public void eliminarEquipo(String nombre) throws SQLException, Exception {
        String sql;
        sql = "DELETE FROM EQUIPO WHERE nombrePais = '" + nombre + "';";
        try {
            Conector.getConector().ejecutarSQL(sql);
        }catch(Exception e) {
            throw new Exception("No se pudo eliminar el equipo");
        }
        
    }
    
}
