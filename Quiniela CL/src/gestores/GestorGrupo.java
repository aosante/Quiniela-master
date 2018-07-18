package gestores;

import cl.Equipo;
import cl.Grupo;
import java.io.IOException;
import java.util.ArrayList;

public class GestorGrupo extends Gestor{
    
    
    public GestorGrupo() {
        
    }
    
    public boolean registrarGrupo(String nombre, String codigo, ArrayList<Equipo> equipos) {
        boolean existe = false;
        Grupo group = new Grupo(nombre, codigo, equipos);
        existe = logica.registrarGrupos(group);
        return existe;
    }
    
    public String[] listarGrupos() throws IOException {
        return logica.listarGrupos();
    }
    
    public Grupo buscarGrupo(String pcodigo) {
        return logica.buscarGrupo(pcodigo);
    }
    
    public void eliminarGrupo(String pcodigo) {
        logica.elminarGrupo(pcodigo);
    }
    
}