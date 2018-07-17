
package cl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Mundial {
    
    private String paisSede;
    private LocalDate anio;
    private ArrayList<Grupo> listaGrupo;

    public Mundial() {
    }

    public Mundial(String paisSede, LocalDate anio, ArrayList<Grupo> listaGrupo) {
        this.paisSede = paisSede;
        this.anio = anio;
        this.listaGrupo = listaGrupo;
    }

    public String getPaisSede() {
        return paisSede;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public ArrayList<Grupo> getListaGrupo() {
        return listaGrupo;
    }

    public void setPaisSede(String paisSede) {
        this.paisSede = paisSede;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    public void setListaGrupo(ArrayList<Grupo> listaGrupo) {
        this.listaGrupo = listaGrupo;
    }

    @Override
    public String toString() {
        return "Mundial{" 
                + "paisSede=" + paisSede 
                + ", anio=" + anio 
                + ", listaGrupo=" + listaGrupo 
                + '}';
    }
    
}
