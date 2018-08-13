
package cl;

import java.io.IOException;
import java.util.ArrayList;

public class CL {
    
    private ArrayList<Equipo> listaEquipos;
    private ArrayList<Grupo> listaGrupos; //
    private ArrayList<Mundial> listaMundiales;
    private ArrayList<Usuario> listaUsuarios;
    
    public CL() {
        listaEquipos = new ArrayList();
        listaGrupos = new ArrayList();
        listaMundiales = new ArrayList();
        listaUsuarios = new ArrayList();
        
        //esto es para tener usuarios quemados
        Usuario usuario1 = new Usuario("Andres", "Osante Alfaro", "aosantea@ucenfotec.ac.cr", "aosante", null, "1234", null);
        Usuario usuario2 = new Usuario("Manuela", "Brenes Jara", "mbrenesj@ucenfotec.ac.cr", "mbrenes", null, "1234", null);
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
    
    
    
    //------EQUIPOS------
    
    public boolean registrarEquipos(Equipo pEquipo) {
        boolean existe = false;
       
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
    

    //------MUNDIAL------
    
    public boolean registrarMundiales(Mundial pMundial) {
        boolean existe = false;
        
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