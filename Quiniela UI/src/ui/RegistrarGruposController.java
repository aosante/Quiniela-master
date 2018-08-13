/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.GestorGrupo;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andresosante
 */
public class RegistrarGruposController implements Initializable {
    
    static GestorGrupo gGrupo = new GestorGrupo();

    @FXML
    private ChoiceBox opcionGrupos;
     @FXML
    private ChoiceBox gruposRegistrados;
    
    @FXML
    private Label aviso;
    
    
    
    
    
    //registro de grupos
    public void registrarGrupos(ActionEvent event) throws Exception {
        String nombreGrupo;
        
        nombreGrupo  = opcionGrupos.getValue().toString();
        
        try {
           gGrupo.registrarGrupo(nombreGrupo);
           actualizarListaGrupos();
           actualizarGruposRegistrados();
           aviso.setText("¡Grupo registrado con éxito!");
            
        } catch(Exception e) {
            aviso.setText("Ocurrió un error, inténtelo de nuevo");
        }
    }
    
    public void actualizarListaGrupos() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gGrupo.listaGrupos();
        for(String grupo : lista) {
            opcionGrupos.getItems().remove(grupo);
        }
    }
    
   
    public void actualizarGruposRegistrados() throws Exception {
        
        ArrayList<String> lista = new ArrayList();
        lista = gGrupo.listaGrupos();
        for(String grupo : lista) {
            gruposRegistrados.getItems().remove(grupo);
            gruposRegistrados.getItems().add(grupo);
        }
    }
    
    //al eliminar tengo que agregar el item eliminado al choicebox opcionGrupos
    //y eliminarlo de grupoSregistrados
    public void eliminarGrupo() throws Exception {
        String nombreGrupo = gruposRegistrados.getValue().toString();
        try {
           // gGrupo.eliminarGrupo(nombreGrupo);
            opcionGrupos.getItems().add(nombreGrupo);
            gruposRegistrados.getItems().remove(nombreGrupo);
        } catch(Exception ex) {
            ex.getStackTrace();
        }
    }
    
    
    public void limpiarAviso() throws Exception {
        aviso.setText("");
    }
    
   
    
    @FXML
    public void salir(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
    public void irAMundiales(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarMundial.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
      public void irAEquipos (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarEquipos.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
      
       public void irALigas (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarLigas.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        opcionGrupos.getItems().addAll("Grupo A", "Grupo B", "Grupo C", "Grupo D", "Grupo E", "Grupo F", "Grupo G", "Grupo H" );
        opcionGrupos.setValue("Seleccionar");
        try {
            actualizarListaGrupos();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        try {
            actualizarGruposRegistrados();
        } catch(Exception ex) {
            ex.getStackTrace();
        }
    }    
    
}
