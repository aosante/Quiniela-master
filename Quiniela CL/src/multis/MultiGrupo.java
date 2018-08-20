/**
 * Esta clase se encarga de registrar, eliminar y listar los grupos
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
public class MultiGrupo {
    
    /**
     * 
     * @param nombre del grupo a registrar
     * @throws SQLException excepcion de SQL por si el query falla
     * @throws Exception excepcion
     */
    public void registrarGrupo(String nombre) throws SQLException, Exception {
        /*Aqui debo de permitir registrar solo si el rowcount de los grupos con
        el anioMundial del mundial activo es menor que 8*/
        String sql;
        sql = "INSERT INTO GRUPO (nombre) VALUES ('" + nombre + "');";       
        String sqlActualizarIdMundial;
        //esta sentencia se ejecuta en donde el nombre sea igual Y el anio mundial sea nulo
        sqlActualizarIdMundial = "UPDATE GRUPO SET anioMundial = ( SELECT anio FROM MUNDIAL WHERE estado = 'activo' ) WHERE nombre =  '" + nombre + "' AND anioMundial IS NULL;";
        try {
            Conector.getConector().ejecutarSQL(sql);
            Conector.getConector().ejecutarSQL(sqlActualizarIdMundial);
        } catch(Exception e) {
            throw new Exception("Ya existe un grupo registrado bajo ese nombre o código");
        }
    }
    
    /**
     * 
     * @return arraylist de strings con los grupos registrados
     * @throws SQLException excepcion de SQL si no hay grupos registrados
     * @throws Exception excepcion
     */
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
    
    /**
     * 
     * @param nombre del grupo a eliminar
     * @throws SQLException excepcion del SQL si no se puede eliminar el grupo 
     * @throws Exception excepcion 
     */
    public void eliminarGrupo(String nombre) throws SQLException, Exception {
        String sql;
        sql = "DELETE FROM GRUPO WHERE nombre = '" + nombre + "' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql);
        } catch(Exception e) {
            throw new Exception("No se pudo eliminar el grupo");
        }
    }
    
    public void asociarGrupoA(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        System.out.println(equipos.get(0));
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo A' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo A' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo A' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo A' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo A");
        }
    }
    
    public void asociarGrupoB(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo B' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo B' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo B' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo B' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo B");
        }
    }
    
    public void asociarGrupoC(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo C' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo C' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo C' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo C' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo C");
        }
    }
    
    public void asociarGrupoD(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo D' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo D' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo D' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo D' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo D");
        }
    }
    
    public void asociarGrupoE(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo E'  AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo E' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo E' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo E' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo E");
        }
    }
    
    public void asociarGrupoF(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo F' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo F' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo F' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo F' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo F");
        }
    }
    
    public void asociarGrupoG(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo G' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo G' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo G' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo G' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo G");
        }
    }
    
    public void asociarGrupoH(ArrayList<String> equipos) throws SQLException, Exception {
        String sql1, sql2, sql3, sql4;
        sql1 = "UPDATE GRUPO SET equipo1 = '" + equipos.get(0) + "' WHERE nombre = 'Grupo H' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql2 = "UPDATE GRUPO SET equipo2 = '" + equipos.get(1) + "' WHERE nombre = 'Grupo H' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql3 = "UPDATE GRUPO SET equipo3 = '" + equipos.get(2) + "' WHERE nombre = 'Grupo H' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        sql4 = "UPDATE GRUPO SET equipo4 = '" + equipos.get(3) + "' WHERE nombre = 'Grupo H' AND anioMundial=(SELECT anio FROM MUNDIAL WHERE estado = 'activo');";
        try {
            Conector.getConector().ejecutarSQL(sql1);
            Conector.getConector().ejecutarSQL(sql2);
            Conector.getConector().ejecutarSQL(sql3);
            Conector.getConector().ejecutarSQL(sql4);
        }catch(Exception e) {
            throw new Exception("Ocurrió un error al asociar los equipos del Grupo H");
        }
    }
    
    public ArrayList<String> listaEquiposA() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo A')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo A");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposB() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo B')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo B')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo B')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo B')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo B");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposC() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo C')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo C')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo C')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo C')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Erro al listar los equipos del grupo C");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposD() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo D')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo D')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo D')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo D')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Erro al listar los equipos del grupo D");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposE() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo E')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo E')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo E')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo E')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo E");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposF() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo F')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo F')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo F')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo F')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo F");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposG() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo G')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo G')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo G')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo G')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo G");
    }
        rs.close();
        return lista;
    }
    
    public ArrayList<String> listaEquiposH() throws SQLException, Exception {
        ArrayList<String> lista = new ArrayList();
        String sql;
        sql = "select nombrePais, codigoISO from EQUIPO\n" +
"where nombrePais IN (SELECT equipo1 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo H')\n" +
"OR nombrePais IN (SELECT equipo2 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo H')\n" +
"OR nombrePais IN (SELECT equipo3 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo H')\n" +
"OR nombrePais IN (SELECT equipo4 from GRUPO where anioMundial = (select anioMundial from MUNDIAL where estado = 'activo') and nombre = 'Grupo H')";
        ResultSet rs = null;
        try{
        rs = Conector.getConector().ejecutarSQL(sql, true);
        while(rs.next()) {
            lista.add(rs.getString("nombrePais") + " - " + "(" + rs.getString("codigoISO") + ")");
        }
    }catch(Exception e) {
        throw new Exception("Error al listar los equipos del grupo H");
    }
        rs.close();
        return lista;
    }
    
}
