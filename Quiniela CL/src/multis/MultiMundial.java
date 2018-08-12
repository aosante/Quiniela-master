/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multis;

import acceso.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



/**
 *
 * @author andresosante
 */
public class MultiMundial {
    
    public void registrarMundial(String paisSede, int anio) throws SQLException, Exception {
        String sql;
        sql = "INSERT INTO MUNDIAL (paisSede, anio) VALUES ( '" + paisSede + "', " + anio + ");";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception("Ya existe un mundial registrado para el año seleccionado");
        }
    }
    
    //metodo que devuelva arraylist con los paises registrados para quitarlos del chociebox
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
    
    
    //metodo que devuelva arraylist con los años registrados  para quitarlos del chociebox
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
    
    
    //metodo que devuelva concatenacion del año y pais (listarMundiales)
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
    
    public void eliminarMundial(String anio) throws SQLException, Exception {
        String sql;
        sql = "DELETE FROM MUNDIAL WHERE anio = " + anio + ";";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception("No se pudo eliminar el mundial");
        }
    }
    

    
}
