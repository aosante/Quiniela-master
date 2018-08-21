/**
 * Esta clase se encarga de instanciar todos los objetos de tipo Partido
 */
package cl;

import java.time.LocalDate;

/**
 *
 * @author andresosante
 */
public class Partido {
    private int idPatido;
    private LocalDate fechaPartido;
    private Equipo equipoLocal;
    private Equipo equipoVisita;
    private int golesEquipoLocal;
    private int golesEquipoVisita;
    private Grupo grupoPerteneciente;
    
    public Partido(){
        
    }

    public Partido(int idPatido, LocalDate fechaPartido, Equipo equipoLocal, Equipo equipoVisita, int golesEquipoLocal, int golesEquipoVisita, Grupo grupoPerteneciente) {
        this.idPatido = idPatido;
        this.fechaPartido = fechaPartido;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisita = golesEquipoVisita;
        this.grupoPerteneciente = grupoPerteneciente;
    }

    public int getIdPatido() {
        return idPatido;
    }

    public LocalDate getFechaPartido() {
        return fechaPartido;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public Equipo getEquipoVisita() {
        return equipoVisita;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisita() {
        return golesEquipoVisita;
    }

    public Grupo getGrupoPerteneciente() {
        return grupoPerteneciente;
    }

    public void setIdPatido(int idPatido) {
        this.idPatido = idPatido;
    }

    public void setFechaPartido(LocalDate fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public void setEquipoVisita(Equipo equipoVisita) {
        this.equipoVisita = equipoVisita;
    }

    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public void setGolesEquipoVisita(int golesEquipoVisita) {
        this.golesEquipoVisita = golesEquipoVisita;
    }

    public void setGrupoPerteneciente(Grupo grupoPerteneciente) {
        this.grupoPerteneciente = grupoPerteneciente;
    }

    @Override
    public String toString() {
        return "Partido{" 
                + "idPatido=" + idPatido 
                + ", fechaPartido=" + fechaPartido 
                + ", equipoLocal=" + equipoLocal 
                + ", equipoVisita=" + equipoVisita 
                + ", golesEquipoLocal=" + golesEquipoLocal 
                + ", golesEquipoVisita=" + golesEquipoVisita 
                + ", grupoPerteneciente=" + grupoPerteneciente 
                + '}';
    }
    
}
