/**
 * Esta clase se encarga de crear la conexion con la base de datos
 * y define los métodos necesarios para interactuar con la misma
 */
package acceso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author andresosante
 */
public class AccesoBD {
    //atributos del objeto

    private Connection conn = null;
    private Statement st;
    private CallableStatement proc;
/**
 * 
 * @param driver de sql
 * @param conexion url de conexion con la base de datos
 * @throws SQLException excepcion de SQL
 * @throws Exception excepcion
 */
    public AccesoBD(String driver, String conexion) throws SQLException, Exception {
        Class.forName(driver);
        conn = DriverManager.getConnection(conexion);
        st = conn.createStatement();
    }
/**
 * 
 * @param sentencia de SQL
 * @throws SQLException excepcion de SQL
 * @throws Exception excepcion
 */
    public void ejecutarSQL(String sentencia) throws SQLException, Exception {
        st.execute(sentencia);
    }
/**
 * 
 * @param sentencia de sql
 * @param retorno del query de sql
 * @return ResultSet con las datos consultados de la base de datos
 * @throws SQLException excepcion de SQL
 * @throws Exception excepcion 
 */
    public ResultSet ejecutarSQL(String sentencia, boolean retorno) throws SQLException, Exception {
        ResultSet rs;
        rs = st.executeQuery(sentencia);
        return rs;
    }
/**
 * 
 * @throws java.sql.SQLException excepcion de SQL
 */
    public void iniciarTransaccion()
            throws java.sql.SQLException {
        conn.setAutoCommit(false);
    }
/**
 * 
 * @throws java.sql.SQLException excepcion de SQL
 */
    public void terminarTransaccion()
            throws java.sql.SQLException {
        conn.setAutoCommit(true);
    }
/**
 * 
 * @throws java.sql.SQLException excepcion de SQL
 */
    public void aceptarTransaccion()
            throws java.sql.SQLException {
        conn.commit();
    }
/**
 * 
 * @throws java.sql.SQLException excepcion de SQL
 */
    public void deshacerTransaccion()
            throws java.sql.SQLException {
        conn.rollback();
    }

    protected void finalize() {
        try {
            conn.close();
        } catch (Exception e) {

        }
    }
}
