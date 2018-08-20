/**
 * Esta clase se encarga de registrar, listar, eliminar y activar mundiales
 */
package multis;

import acceso.Conector;
import cl.Mundial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author andresosante
 */
public class MultiMundial {
    
    /**
     * 
     * @param mund mundial a registrar
     * @throws SQLException excepcion si el query de SQL no se puede ejecutar
     * @throws Exception excepcion 
     */
    public void registrarMundial(Mundial mund) throws SQLException, Exception {
        String sql;
        sql = "INSERT INTO MUNDIAL (paisSede, anio) VALUES ( '" + mund.getPaisSede() + "', " + mund.getAnio() + ");";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception("Ya existe un mundial registrado para el año seleccionado");
        }
    }
    
    /**
     * 
     * @return arraylist de string con los paises registrados
     * @throws SQLException excepcion de SQL si no hay paises registrados
     * @throws Exception excepcion 
     */
    public ArrayList<String> listaPaises() throws SQLException, Exception {
        ArrayList<String> listaPaises = new ArrayList();
        String sql;
        sql = "SELECT paisSede FROM MUNDIAL";
        try {
            ResultSet rs = null;
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while(rs.next()) {
                listaPaises.add(rs.getString("paisSede"));
            }
            rs.close();
        } catch(Exception e) {
            throw new Exception ("No existen paises sede registrados");
        }
        return listaPaises;
    }
    
    
    /**
     * 
     * @return arraylist de enteros que lista todos los años de mundiales registrados 
     * @throws SQLException excepcion de SQL si no hay ningun año de mundial registrado
     * @throws Exception excepcion 
     */
    public ArrayList<Integer> listaAnios() throws SQLException, Exception {
        ArrayList<Integer> listaAnios = new ArrayList();
        String sql;
        sql = "SELECT anio FROM MUNDIAL";
        try {
            ResultSet rs = null;
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while(rs.next()) {
                listaAnios.add(rs.getInt("anio"));
            }
            rs.close();
        } catch(Exception e) {
            throw new Exception("No existen años registrados");
        }
        return listaAnios;
    }
    
    
    /**
     * 
     * @return arraylist de strings con los mundiales y años registrados
     * @throws SQLException excepcion de SQL en caso de que no haya mundiales registrados
     * @throws Exception excepcion
     */
    public ArrayList<String> listarMundiales() throws SQLException, Exception {
        ArrayList<String> listaMundiales = new ArrayList();
        String sql;
        sql = "SELECT * FROM MUNDIAL";
        try {
            ResultSet rs = null;
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while(rs.next()) {
                listaMundiales.add(rs.getString("paisSede") + "-" + rs.getInt("anio"));
            }
        } catch(Exception e) {
            throw new Exception("No existen mundiales registrados");
        }
        return listaMundiales;
    }
    
    /**
     * 
     * @param anio año del mundial
     * @throws SQLException excepcion de SQL si no se pudo modificar el estado del mundial
     * @throws Exception excepcion 
     */
    public void activarMundial(String anio) throws SQLException, Exception {
        String sql1 = "UPDATE MUNDIAL SET estado = 'inactivo';";
        String sql2 = "UPDATE MUNDIAL SET estado = 'activo' "
                + "WHERE anio = " + anio  + ";";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
        } catch(Exception e) {
            throw new Exception ("El mundial no pudo ser activado");
        }
    }  
    
    /**
     * 
     * @return string con el mundial activo en el momento
     * @throws SQLException excepcion de SQL si no hay un mundial activo
     * @throws Exception excepcion
     */
    public String seleccionarMundialActivo() throws SQLException, Exception {
        String mundialActivo = "", sql;
        sql = "SELECT * FROM MUNDIAL WHERE estado = 'activo';";
        try {
            ResultSet rs = null;
            rs = Conector.getConector().ejecutarSQL(sql, true);
            while(rs.next()) {
                mundialActivo += rs.getString("paisSede") + "-" + rs.getInt("anio");
            }
        } catch(Exception e) {
            throw new Exception("No hay mundial activo");
        }
        return mundialActivo;
    }
    /**
     * 
     * @param anio año del mundial a eliminar
     * @throws SQLException excepcion de SQL si el mundial no se pudo eliminar 
     * @throws Exception excepcion 
     */
    public void eliminarMundial(String anio) throws SQLException, Exception {
        String sql, sql2;
        sql = "DELETE FROM MUNDIAL WHERE anio = " + anio + ";";
        sql2 = "DELETE FROM GRUPO WHERE anioMundial = " + anio + ";";
        try {
            Conector.getConector().ejecutarSQL(sql);
            Conector.getConector().ejecutarSQL(sql2);
        } catch(Exception e) {
            throw new Exception("No se pudo eliminar el mundial");
        }
    }
    

    
}
