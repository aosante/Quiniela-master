
package cl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mundial {
    
    private String paisSede;
    private int anio;
    private String estado;
    private ArrayList<Grupo> listaGrupo;

    public Mundial() {
    }
    
    public Mundial(String paisSede, int anio) {
        this.paisSede = paisSede;
        this.anio = anio;
    }

    public Mundial(String paisSede, int anio, String estado) {
        this.paisSede = paisSede;
        this.anio = anio;
        this.estado = estado;
    }
    
    

    public Mundial(String paisSede, int anio, String estado, ArrayList<Grupo> listaGrupo) {
        this.paisSede = paisSede;
        this.anio = anio;
        this.estado = estado;
        this.listaGrupo = listaGrupo;
    }

   

    public String getPaisSede() {
        return paisSede;
    }

    public int getAnio() {
        return anio;
    }

    public ArrayList<Grupo> getListaGrupo() {
        return listaGrupo;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setListaGrupo(ArrayList<Grupo> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    


    
}
