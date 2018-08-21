/**
 * Esta clase se encatga de gestionar los datos entre la interfaz 
 * y la base de datos
 */
package gestores;

import java.util.ArrayList;
import multis.MultiGrupo;

public class GestorGrupo extends Gestor{
    
    
    public GestorGrupo() {
        
    }
    /**
     * 
     * @param nombre nombre del grupo a registrar
     * @throws Exception excepcion
     */
    public void registrarGrupo(String nombre) throws Exception {
       (new MultiGrupo()).registrarGrupo(nombre);
    }
    
    /**
     * 
     * @return arraylist de string de grupos registrados
     * @throws Exception excepcion
     */
    public ArrayList<String> listaGrupos() throws Exception {
        return (new MultiGrupo()).listaGrupos();
    }
    
/**
 * 
 * @param equiposA equipos del grupo A
 * @throws Exception excepcion
 */
      public void asociarGrupoA(ArrayList<String> equiposA) throws Exception {
          (new MultiGrupo()).asociarGrupoA(equiposA);
      }
      /**
       * 
       * @param equiposB equipos del grupo B
       * @throws Exception excepcion 
       */
      public void asociarGrupoB(ArrayList<String> equiposB) throws Exception {
          (new MultiGrupo()).asociarGrupoB(equiposB);
      }
      /**
       * 
       * @param equiposC equipos del grupo C
       * @throws Exception excepcion 
       */
      public void asociarGrupoC(ArrayList<String> equiposC) throws Exception {
          (new MultiGrupo()).asociarGrupoC(equiposC);
      }
      /**
       * 
       * @param equiposD equipos del grupo D
       * @throws Exception excepcion 
       */
      public void asociarGrupoD(ArrayList<String> equiposD) throws Exception {
          (new MultiGrupo()).asociarGrupoD(equiposD);
      }
      /**
       * 
       * @param equiposE equipos del grupo E
       * @throws Exception excepcion 
       */
      public void asociarGrupoE(ArrayList<String> equiposE) throws Exception {
          (new MultiGrupo()).asociarGrupoE(equiposE);
      }
      /**
       * 
       * @param equiposF equipos del grupo F
       * @throws Exception excepcion
       */
      public void asociarGrupoF(ArrayList<String> equiposF) throws Exception {
          (new MultiGrupo()).asociarGrupoF(equiposF);
      }
      /**
       * 
       * @param equiposG equipos del grupo G
       * @throws Exception excepcion 
       */
      public void asociarGrupoG(ArrayList<String> equiposG) throws Exception {
          (new MultiGrupo()).asociarGrupoG(equiposG);
      }
      /**
       * 
       * @param equiposH equipos del grupo H
       * @throws Exception excepcion 
       */
      public void asociarGrupoH(ArrayList<String> equiposH) throws Exception {
          (new MultiGrupo()).asociarGrupoH(equiposH);
      }
      /**
       * 
       * @return arraylist de strings con los equipos del grupo A
       * @throws Exception excepcion
       */
      public ArrayList<String> listaGA() throws Exception {
          return (new MultiGrupo()).listaEquiposA();
      }
      /**
       * 
       * @return arraylist de strings con los equipos del grupo B
       * @throws Exception excepcion
       */
      public ArrayList<String> listaGB() throws Exception {
          return (new MultiGrupo()).listaEquiposB();
      }
      /**
       * 
       * @return arraylist de strings con los equipos del grupo C
       * @throws Exception excepcion
       */
      public ArrayList<String> listaGC() throws Exception {
          return (new MultiGrupo()).listaEquiposC();
      }
      /**
       * 
       * @return arraylist de strings con los equipos del grupo D
       * @throws Exception excepcion
       */
      public ArrayList<String> listaGD() throws Exception {
          return (new MultiGrupo()).listaEquiposD();
      }
/**
       * 
       * @return arraylist de strings con los equipos del grupo E
       * @throws Exception excepcion
       */
      public ArrayList<String> listaGE() throws Exception {
          return (new MultiGrupo()).listaEquiposE();
          /**
       * 
       * @return arraylist de strings con los equipos del grupo F
       * @throws Exception excepcion
       */
      }public ArrayList<String> listaGF() throws Exception {
          return (new MultiGrupo()).listaEquiposF();
          /**
       * 
       * @return arraylist de strings con los equipos del grupo G
       * @throws Exception excepcion
       */
      }public ArrayList<String> listaGG() throws Exception {
          return (new MultiGrupo()).listaEquiposG();
          /**
       * 
       * @return arraylist de strings con los equipos del grupo H
       * @throws Exception excepcion
       */
      }public ArrayList<String> listaGH() throws Exception {
          return (new MultiGrupo()).listaEquiposH();
      }
    /**
     * 
     * @param nombre  del grupo a eliminar
     * @throws Exception excepcion 
     */
    public void eliminarGrupo(String nombre) throws Exception {
        (new MultiGrupo()).eliminarGrupo(nombre);
    }
    
}