
package cl;

import java.util.ArrayList;

public class Grupo {
    
    private String nombreGrupo;
    private String codigo;
    private ArrayList<Equipo> listaEquipos;

    public Grupo() {
    }

    public Grupo(String nombreGrupo, String codigo, ArrayList<Equipo> listaEquipos) {
        this.nombreGrupo = nombreGrupo;
        this.codigo = codigo;
        this.listaEquipos = listaEquipos;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public void setCodigo(String codigo) {
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
