/**
 * Esta clase se encarga de instanciar al objeto grupo
 */
package cl;

import java.util.ArrayList;

public class Grupo {
    
    private int codigo;
    private String nombreGrupo;
    private ArrayList<Equipo> listaEquipos;

    public Grupo() {
    }

    public Grupo(int codigo, String nombreGrupo, ArrayList<Equipo> listaEquipos) {
        this.codigo = codigo;
        this.nombreGrupo = nombreGrupo;
        this.listaEquipos = listaEquipos;
    }

    

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    @Override
    public String toString() {
        return "Grupo{" 
                + "nombreGrupo=" + nombreGrupo 
                + ", codigo=" + codigo 
                + ", listaEquipos=" + listaEquipos 
                + '}';
    }
    
}
