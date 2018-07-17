
package cl;

import javax.swing.ImageIcon;

public class Equipo {
    
    //hola
    
    private String nombrePais;
    private String codigoISO;
    private int ranking;
    private ImageIcon bandera;
    
    public Equipo() {
    }

    public Equipo(String nombrePais, String codigoISO, int ranking, ImageIcon bandera) {
        this.nombrePais = nombrePais;
        this.codigoISO = codigoISO;
        this.ranking = ranking;
        this.bandera = bandera;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public int getRanking() {
        return ranking;
    }

    public ImageIcon getBandera() {
        return bandera;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public void setBandera(ImageIcon bandera) {
        this.bandera = bandera;
    }

    @Override
    public String toString() {
        return "Equipo{" 
                + "nombrePais=" + nombrePais 
                + ", codigoISO=" + codigoISO 
                + ", ranking=" + ranking 
                + ", bandera=" + bandera 
                + '}';
    }
     
}
