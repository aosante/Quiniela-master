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
    

//    
//    public Grupo buscarGrupo(String pcodigo) {
//        return logica.buscarGrupo(pcodigo);
//    }
    
    public void eliminarGrupo(String nombre) throws Exception {
        (new MultiGrupo()).eliminarGrupo(nombre);
    }
    
}