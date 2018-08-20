package gestores;

import java.util.ArrayList;
import multis.MultiGrupo;

public class GestorGrupo extends Gestor{
    
    
    public GestorGrupo() {
        
    }
    
    public void registrarGrupo(String nombre) throws Exception {
       (new MultiGrupo()).registrarGrupo(nombre);
    }
    
    public ArrayList<String> listaGrupos() throws Exception {
        return (new MultiGrupo()).listaGrupos();
    }
    

      public void asociarGrupoA(ArrayList<String> equiposA) throws Exception {
          (new MultiGrupo()).asociarGrupoA(equiposA);
      }
      public void asociarGrupoB(ArrayList<String> equiposB) throws Exception {
          (new MultiGrupo()).asociarGrupoB(equiposB);
      }
      public void asociarGrupoC(ArrayList<String> equiposC) throws Exception {
          (new MultiGrupo()).asociarGrupoC(equiposC);
      }
      public void asociarGrupoD(ArrayList<String> equiposD) throws Exception {
          (new MultiGrupo()).asociarGrupoD(equiposD);
      }
      public void asociarGrupoE(ArrayList<String> equiposE) throws Exception {
          (new MultiGrupo()).asociarGrupoE(equiposE);
      }
      public void asociarGrupoF(ArrayList<String> equiposF) throws Exception {
          (new MultiGrupo()).asociarGrupoF(equiposF);
      }
      public void asociarGrupoG(ArrayList<String> equiposG) throws Exception {
          (new MultiGrupo()).asociarGrupoG(equiposG);
      }
      public void asociarGrupoH(ArrayList<String> equiposH) throws Exception {
          (new MultiGrupo()).asociarGrupoH(equiposH);
      }
      
      public ArrayList<String> listaGA() throws Exception {
          return (new MultiGrupo()).listaEquiposA();
      }
      public ArrayList<String> listaGB() throws Exception {
          return (new MultiGrupo()).listaEquiposB();
      }
      public ArrayList<String> listaGC() throws Exception {
          return (new MultiGrupo()).listaEquiposC();
      }
      public ArrayList<String> listaGD() throws Exception {
          return (new MultiGrupo()).listaEquiposD();
      }

      public ArrayList<String> listaGE() throws Exception {
          return (new MultiGrupo()).listaEquiposE();
      }public ArrayList<String> listaGF() throws Exception {
          return (new MultiGrupo()).listaEquiposF();
      }public ArrayList<String> listaGG() throws Exception {
          return (new MultiGrupo()).listaEquiposG();
      }public ArrayList<String> listaGH() throws Exception {
          return (new MultiGrupo()).listaEquiposH();
      }
    
    public void eliminarGrupo(String nombre) throws Exception {
        (new MultiGrupo()).eliminarGrupo(nombre);
    }
    
}