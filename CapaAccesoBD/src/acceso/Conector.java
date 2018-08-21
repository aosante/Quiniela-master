/**
 * Esta clase se encarga de instanciar la clase AccesoBD y de pasarle los parametros
 * respectivos al constructor para poder crear la conexión con la base de datos. Dichos datos se leen desde
 * un archivo de texto
 */
package acceso;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author andresosante
 */
public class Conector{
	//atributo de la clase	
	private static AccesoBD conectorBD = null;
	
        private static String driver = "";
        private static String dburl = "";
	
	/**
         * 
         * @return AccesoBD
         * @throws java.sql.SQLException excepcion de sql
         * @throws Exception excepcion 
         */
	public static AccesoBD getConector() throws java.sql.SQLException,Exception{
		String[] datosConexion = getDatos();
        driver = datosConexion[0];
        dburl = datosConexion[1];
       if(conectorBD == null) {
            conectorBD = new AccesoBD(driver, dburl);
       }
       return conectorBD;
	}
        /**
         * 
         * @return array de string conteniendo el driver y el url para la conexión
         * @throws IOException excepcion de input/Output
         */
        public static String[] getDatos() throws IOException{
        TextFileIO conexion = new TextFileIO("quiniela.txt");
        ArrayList<String> lista = conexion.getData();
        String[] listaDatos = new String[lista.size()];
        int i = 0;
        for(String dato : lista) {
            listaDatos[i] = dato;
            i++;
        }
        return listaDatos;
    }
	
}
