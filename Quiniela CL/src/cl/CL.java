
package cl;

import java.io.IOException;
import java.util.ArrayList;

public class CL {
    
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Grupo> listaGrupos; //
    private ArrayList<Mundial> listaMundiales;
    private ArrayList<Usuario> listaUsuarios;
    
    //------EQUIPOS------
    
    public boolean registrarEquipos(Equipo pEquipo) {
        boolean existe = false;
        if(listaEquipos == null) {
            listaEquipos = new ArrayList();
        }
        
        if (!listaEquipos.contains(pEquipo)) {
            listaEquipos.add(pEquipo);
        }
        return existe;
    }
    
    public String[] listarEquipos() throws IOException {
        int i = 0;
        String [] listas = new String[listaEquipos.size()];
        for(Equipo dato : listaEquipos) {
            listas[i] = dato.toString();
            i++;
        }
        return listas;
    }
    
    public Equipo buscarEquipos(String pCodigoISO) {
        Equipo encontrado = new Equipo();
        for(Equipo dato : listaEquipos) {
            if(dato.getCodigoISO().equals(pCodigoISO)) {
                encontrado = dato;
            }
        }
        return encontrado;
    }
    
    public void elminarEquipo(String pCodigoISO) {
        for(Equipo dato : listaEquipos) {
            if(dato.getCodigoISO().equals(pCodigoISO)) {
                listaEquipos.remove(dato);
            }
        }
    }
    
    //------GRUPOS------
    
    public boolean registrarGrupos(Grupo pGrupo) {
        boolean existe = false;
        if(listaGrupos == null) {
            listaGrupos = new ArrayList();
        }
        
        if(!listaGrupos.contains(pGrupo)) {
            listaGrupos.add(pGrupo);
        } else {
            existe = true;
        }
        return existe;
    }
    
    public String[] listarGrupos() throws IOException {
        int i = 0;
        String [] listas = new String[listaGrupos.size()];
        for(Grupo dato : listaGrupos) {
            listas[i] = dato.toString();
            i++;
        }
        return listas;
    }
    
    public Grupo buscarGrupo(String pCodigo) {
        Grupo encontrado = new Grupo();
        for(Grupo dato : listaGrupos) {
            if(dato.getCodigo().equals(pCodigo)) {
                encontrado = dato;
            }
        }
        return encontrado;
    }
    
    public void elminarGrupo(String pCodigo) {
        for(Grupo dato : listaGrupos) {
            if(dato.getCodigo().equals(pCodigo)) {
                listaGrupos.remove(dato);
            }
        }
    }
    
    //------MUNDIAL------
    
    public boolean registrarMundiales(Mundial pMundial) {
        boolean existe = false;
        if(listaMundiales == null) {
            listaMundiales = new ArrayList();
        }
        
        if(!listaMundiales.contains(pMundial)) {
            listaMundiales.add(pMundial);
        } else {
            existe = true;
        }
        return existe;
    }
    
    public String[] listarMundiales() throws IOException {
        int i = 0;
        String [] listas = new String[listaMundiales.size()];
        for(Mundial dato : listaMundiales) {
            listas[i] = dato.toString();
            i++;
        }
        return listas;
    }
    
    public Mundial buscarMundial(String pPaisSede) {
        Mundial encontrado = new Mundial();
        for(Mundial dato : listaMundiales) {
            if(dato.getPaisSede().equals(pPaisSede)) {
                encontrado = dato;
            }
        }
        return encontrado;
    }
    
    public void elminarMundial(String pPaisSede) {
        for(Mundial dato : listaMundiales) {
            if(dato.getPaisSede().equals(pPaisSede)) {
                listaMundiales.remove(dato);
            }
        }
    }
    
    //------USUARIO------
    
    public boolean registrarUsuarios(Usuario pUsuario) {
        boolean existe = false;
        if(listaUsuarios == null) {
            listaUsuarios = new ArrayList();
        }
        
        if(!listaUsuarios.contains(pUsuario)) {
            listaUsuarios.add(pUsuario);
        } else {
            existe = true;
        }
        return existe;
    }
    
    public String[] listarUsuarios() throws IOException {
        int i = 0;
        String [] listas = new String[listaUsuarios.size()];
        for(Usuario dato : listaUsuarios) {
            listas[i] = dato.toString();
            i++;
        }
        return listas;
    }
    
    public Usuario buscarUsuario(String pNombreUsuario) {
        Usuario encontrado = new Usuario();
        for(Usuario dato : listaUsuarios) {
            if(dato.getNombreUsuario().equals(pNombreUsuario)) {
                encontrado = dato;
            }
        }
        return encontrado;
    }
    
    public void elminarUsuario(String pNombreUsuario) {
        for(Usuario dato : listaUsuarios) {
            if(dato.getNombreUsuario().equals(pNombreUsuario)) {
                listaUsuarios.remove(dato);
            }
        }
    }
}