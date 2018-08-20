/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.GestorEquipo;
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
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andresosante
 */
public class RegistrarEquiposController implements Initializable {
    static GestorEquipo gEquipo = new GestorEquipo();
    
    @FXML
    private ListView listaEquipos;
    
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtISO;
    @FXML
    private TextField txtRanking;
    
    @FXML
    private Label aviso;
    
    
    public void registrarEquipo() throws Exception {
        String nombre, iso;
        int ranking;
        
        nombre = txtNombre.getText();
        iso = txtISO.getText();
        ranking = Integer.parseInt(txtRanking.getText());
        try {
            gEquipo.registrarEquipo(nombre, iso, ranking);
            limpiarListView();
            listarEquipos();
            aviso.setText("¡Equipo registrado con éxito!");
            limpiarFormulario();
        }catch(Exception e) {
            aviso.setText(e.getMessage());
        }
    }
    
    public void eliminarEquipo() throws Exception {
        String dato = listaEquipos.getSelectionModel().getSelectedItem().toString();
        String[] partes = dato.split(" - ");
        String nombre = partes[0];
        String iso = partes[1];
        try {
            gEquipo.eliminarEquipo(nombre);
            listaEquipos.getItems().remove(dato);
            limpiarListView();
            listarEquipos();
            aviso.setText("¡Equipo eliminado con éxito!");
        }catch(Exception e) {
            aviso.setText(e.getMessage());
        }
    }
    
    public void limpiarListView() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gEquipo.listarEquipos();
        for(String equipo : lista) {
            listaEquipos.getItems().remove(equipo);
        }
    }
    
    public void listarEquipos() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gEquipo.listarEquipos();
        for(String equipo : lista) {
            listaEquipos.getItems().add(equipo);
        }
    }
    
    
    public void limpiarFormulario() throws Exception {
        txtNombre.setText("");
        txtISO.setText("");
        txtRanking.setText("");
    }
    
    public void limpiar() throws Exception {
        aviso.setText("");
    }
    
    
    
    //links a otras vistas
    public void irAGrupos(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarGrupos.fxml"));
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
    
    public void irALigas(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarLigas.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            listarEquipos();
        }catch(Exception e) {
            e.getStackTrace();
        }
    }    
    
}
