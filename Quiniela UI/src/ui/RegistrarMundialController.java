/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.GestorMundial;
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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andresosante
 */
public class RegistrarMundialController implements Initializable {

    static GestorMundial gMundial = new GestorMundial();
    
    
    //Botones
    @FXML
    private Button btnMundiales;
    @FXML
    private Button btnGrupos;
    @FXML
    private Button btnEquipos;
    @FXML
    private Button btnLigas;
    @FXML
    private Button activarMundial;
    @FXML
    private Button registrarMundial;
    @FXML
    private Button eliminarMundial;
    
    
    
    //ChoiceBox
    @FXML
    private ChoiceBox paisesSede;
    @FXML
    private ChoiceBox aniosMundiales;
    
    //ListView
    @FXML
    private ListView listaMundiales;
    
    @FXML
    private Label aviso;
            
            
            
    ArrayList<String> mundiales = new ArrayList();//concatenacion de ano y mundial desde la base de datos
    
    
    @FXML
    public void salir(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
    
    public void registrarMundial(ActionEvent event) throws Exception {
        String paisSede;
        int anio;
        
        paisSede = paisesSede.getValue().toString();
        anio = Integer.parseInt(aniosMundiales.getValue().toString());
        
        try {
            gMundial.registrarMundial(paisSede, anio);
            aviso.setText("¡Mundial registrado con éxito!");
        } catch(Exception e) {
            aviso.setText("Ocurrió un error. Inténtelo de nuevo");
        }
        actualizarPaises();
        actualizarAnios();
        limpiarListView();
        listarMundiales();
    }
    
    public void limpiarAlerta() {
        aviso.setText("");
    } 
    
    public void limpiarListView() throws Exception{
        ArrayList<String> lista = new ArrayList();
        lista = gMundial.listarMundiales();
        for(String mundial : lista) {
            listaMundiales.getItems().remove(mundial);
        }
    }
    
    public void actualizarPaises() throws Exception{
        //se jalan lo arraylists de la base de datos y se hace un foreach para eliminarlos del choicebox
        ArrayList<String> paises = new ArrayList();
        paises = gMundial.listaPaises();
        for(String pais : paises) {
            paisesSede.getItems().remove(pais);
        }            
    }
    
    public void actualizarAnios() throws Exception {
        ArrayList<Integer> anios = new ArrayList();
        anios = gMundial.listaAnios();
        for(Integer anio : anios) {
            aniosMundiales.getItems().remove(anio);
        }
    }
    
    public void listarMundiales() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gMundial.listarMundiales();
        for(String mundial : lista) {
            listaMundiales.getItems().add(mundial);
        }
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        mundiales.add("Italia");
        mundiales.add("Rusia");
        mundiales.add("Sudafrica");
        mundiales.add("Katar");
        
        paisesSede.getItems().addAll("Uruguay", "Italia", "Francia", "Brasil", "Suiza", "Suecia", "Chile", "Inglaterra", "México", "Alemania", "Argentina", "España", "México", "Italia", "Estados Unidos", "Francia", "Corea del Sur", "Alemania", "Sudáfrica", "Brasil", "Rusia", "Qatar" );
        paisesSede.setValue("Seleccionar");
        try {
            actualizarPaises();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        aniosMundiales.getItems().addAll(1930, 1934, 1938, 1950, 1954, 1958, 1962, 1966, 1970, 1974, 1978, 1982, 1986, 1990, 1994, 1998, 2002, 2006, 2010, 2014, 2018, 2022);
        aniosMundiales.setValue("Seleccionar");
        try {
            actualizarAnios();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        
        try {
            listarMundiales();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        
    }    
    
}
