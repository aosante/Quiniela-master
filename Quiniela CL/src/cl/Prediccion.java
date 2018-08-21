/**
 * Esta clase se encarga de instanciar al objeto de tipo Prediccion
 */
package cl;

/**
 *
 * @author andresosante
 */
public class Prediccion {
    private int idPrediccion;
    private Partido encuentro;
    private int golesEquipoLocal;
    private int golesEquipoVisita;
    private Usuario jugador;
    
    public Prediccion(){
        
    }

    public Prediccion(int idPrediccion, Partido encuentro, int golesEquipoLocal, int golesEquipoVisita, Usuario jugador) {
        this.idPrediccion = idPrediccion;
        this.encuentro = encuentro;
        this.golesEquipoLocal = golesEquipoLocal;
        this.golesEquipoVisita = golesEquipoVisita;
        this.jugador = jugador;
    }

    public int getIdPrediccion() {
        return idPrediccion;
    }

    public Partido getEncuentro() {
        return encuentro;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    public int getGolesEquipoVisita() {
        return golesEquipoVisita;
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setIdPrediccion(int idPrediccion) {
        this.idPrediccion = idPrediccion;
    }

    public void setEncuentro(Partido encuentro) {
        this.encuentro = encuentro;
    }

    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public void setGolesEquipoVisita(int golesEquipoVisita) {
        this.golesEquipoVisita = golesEquipoVisita;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Prediccion{" 
                + "idPrediccion=" + idPrediccion 
                + ", encuentro=" + encuentro 
                + ", golesEquipoLocal=" + golesEquipoLocal 
                + ", golesEquipoVisita=" + golesEquipoVisita 
                + ", jugador=" + jugador 
                + '}';
    }
    
}
