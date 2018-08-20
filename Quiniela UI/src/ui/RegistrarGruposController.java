/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.GestorEquipo;
import gestores.GestorGrupo;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andresosante
 */
public class RegistrarGruposController implements Initializable {

    static GestorGrupo gGrupo = new GestorGrupo();
    static GestorEquipo gEquipo = new GestorEquipo();
    
    @FXML
    private ListView listA;
    @FXML
    private ListView listB;
    @FXML
    private ListView listC;
    @FXML
    private ListView listD;
    @FXML
    private ListView listE;
    @FXML
    private ListView listF;
    @FXML
    private ListView listG;
    @FXML
    private ListView listH;
    

    @FXML
    private ChoiceBox opcionGrupos;
    @FXML
    private ChoiceBox gruposRegistrados;
    @FXML
    private ChoiceBox opcionEquipos;

    @FXML
    private Label aviso;
    @FXML
    private Label lblGA;
    @FXML
    private Label lblGB;
    @FXML
    private Label lblGC;
    @FXML
    private Label lblGD;
    @FXML
    private Label lblGE;
    @FXML
    private Label lblGF;
    @FXML
    private Label lblGG;
    @FXML
    private Label lblGH;

    //registro de grupos
    public void registrarGrupos(ActionEvent event) throws Exception {
        String nombreGrupo;

        nombreGrupo = opcionGrupos.getValue().toString();

        try {
            gGrupo.registrarGrupo(nombreGrupo);
            actualizarListaGrupos();
            actualizarGruposRegistrados();
            actualizarLabelGrupos();
            aviso.setText("¡Grupo registrado con éxito!");

        } catch (Exception e) {
            aviso.setText("Ocurrió un error, inténtelo de nuevo");
        }
    }

    public void actualizarListaGrupos() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gGrupo.listaGrupos();
        for (String grupo : lista) {
            opcionGrupos.getItems().remove(grupo);
        }
    }
    
    public void limpiarLabels() throws Exception {
        lblGA.setText("");
        lblGB.setText("");
        lblGC.setText("");
        lblGD.setText("");
        lblGE.setText("");
        lblGF.setText("");
        lblGG.setText("");
        lblGH.setText("");
        
    }

    public void actualizarLabelGrupos() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gGrupo.listaGrupos();
        for (String grupo : lista) {
            switch (grupo) {
                case "Grupo A":
                    lblGA.setText("Grupo A");
                    break;
                case "Grupo B":
                    lblGB.setText("Grupo B");
                    break;
                case "Grupo C":
                    lblGC.setText("Grupo C");
                    break;
                case "Grupo D":
                    lblGD.setText("Grupo D");
                    break;
                case "Grupo E":
                    lblGE.setText("Grupo E");
                    break;
                case "Grupo F":
                    lblGF.setText("Grupo F");
                    break;
                case "Grupo G":
                    lblGG.setText("Grupo G");
                    break;
                case "Grupo H":
                    lblGH.setText("Grupo H");
                    break;
            }
        }
    }
    
    
    
    public void llenarEquipos() throws Exception {
        ArrayList<String> lista = new ArrayList();
        lista = gEquipo.listarEquipos();
        for(String item : lista) {
            opcionEquipos.getItems().add(item);
        }
    }
    
    public void confirmar() throws Exception {
        ArrayList<String> listaA = new ArrayList();
        ObservableList<String> grupoA = listA.getItems();
        for(String item : grupoA) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaA.add(nombre);
        }
        ArrayList<String> listaB = new ArrayList();
        ObservableList<String> grupoB = listB.getItems();
        for(String item : grupoB) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaB.add(nombre);
        }
        ArrayList<String> listaC = new ArrayList();
        ObservableList<String> grupoC = listC.getItems();
        for(String item : grupoC) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaC.add(nombre);
        }
        ArrayList<String> listaD = new ArrayList();
        ObservableList<String> grupoD = listD.getItems();
        for(String item : grupoD) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaD.add(nombre);
        }
        ArrayList<String> listaE = new ArrayList();
        ObservableList<String> grupoE = listE.getItems();
        for(String item : grupoE) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaE.add(nombre);
        }
        ArrayList<String> listaF = new ArrayList();
        ObservableList<String> grupoF = listF.getItems();
        for(String item : grupoF) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaF.add(nombre);
        }
        ArrayList<String> listaG = new ArrayList();
        ObservableList<String> grupoG = listG.getItems();
        for(String item : grupoG) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaG.add(nombre);
        }
        ArrayList<String> listaH = new ArrayList();
        ObservableList<String> grupoH = listH.getItems();
        for(String item : grupoH) {
            String [] partes = item.split(" - ");
            String nombre = partes[0];
            listaH.add(nombre);
        }
        
        try{
        gGrupo.asociarGrupoA(listaA);
        gGrupo.asociarGrupoB(listaB);
        gGrupo.asociarGrupoC(listaC);
        gGrupo.asociarGrupoD(listaD);
        gGrupo.asociarGrupoE(listaE);
        gGrupo.asociarGrupoF(listaF);
        gGrupo.asociarGrupoG(listaG);
        gGrupo.asociarGrupoH(listaH);
        aviso.setText("¡Equipos asociados con éxito!");
        }catch(Exception e) {
            aviso.setText(e.getMessage());
        }
        //registro (8x)
    }
    
    public void agregarEquipos() throws Exception {
        //////asi se jalan los equipos de cada grupo
//        ArrayList<String> array = new ArrayList();
//        ObservableList<String> lista = listA.getItems();
//        for(String item : lista) {
//            array.add(item);
//        }
        
        if(listA.getItems().size() < 4) {
            listA.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGA = listA.getItems();
            for(String item : listGA) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listB.getItems().size() < 4) {
            listB.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGB = listB.getItems();
            for(String item : listGB) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listC.getItems().size() < 4) {
            listC.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGC = listC.getItems();
            for(String item : listGC) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listD.getItems().size() < 4) {
            listD.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGD = listD.getItems();
            for(String item : listGD) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listE.getItems().size() < 4) {
            listE.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGE = listE.getItems();
            for(String item : listGE) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listF.getItems().size() < 4) {
            listF.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGF = listF.getItems();
            for(String item : listGF) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listG.getItems().size() < 4) {
            listG.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGG = listG.getItems();
            for(String item : listGG) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
        if(listH.getItems().size() < 4) {
            listH.getItems().add(opcionEquipos.getSelectionModel().getSelectedItem());
            ObservableList<String> listGH = listH.getItems();
            for(String item : listGH) {
                opcionEquipos.getItems().remove(item);
            }
            return;
        }
    }

    public void actualizarGruposRegistrados() throws Exception {

        ArrayList<String> lista = new ArrayList();
        lista = gGrupo.listaGrupos();
        for (String grupo : lista) {
            gruposRegistrados.getItems().remove(grupo);
            gruposRegistrados.getItems().add(grupo);
        }
    }
    
    public void actualizarA() throws Exception {
        listA.getItems().clear();
        ArrayList<String> lista = gGrupo.listaGA();
        for(String item : lista) {
            listA.getItems().add(item);
        }
    }
    public void actualizarB() throws Exception {
        ArrayList<String> lista = gGrupo.listaGB();
        for(String item : lista) {
            listB.getItems().add(item);
        }
    }
    public void actualizarC() throws Exception {
        ArrayList<String> lista = gGrupo.listaGC();
        for(String item : lista) {
            listC.getItems().add(item);
        }
    }
    public void actualizarD() throws Exception {
        ArrayList<String> lista = gGrupo.listaGD();
        for(String item : lista) {
            listD.getItems().add(item);
        }
    }
    public void actualizarE() throws Exception {
        ArrayList<String> lista = gGrupo.listaGE();
        for(String item : lista) {
            listE.getItems().add(item);
        }
    }
    public void actualizarF() throws Exception {
        ArrayList<String> lista = gGrupo.listaGF();
        for(String item : lista) {
            listF.getItems().add(item);
        }
    }
    public void actualizarG() throws Exception {
        ArrayList<String> lista = gGrupo.listaGG();
        for(String item : lista) {
            listG.getItems().add(item);
        }
    }
    public void actualizarH() throws Exception {
        ArrayList<String> lista = gGrupo.listaGH();
        for(String item : lista) {
            listH.getItems().add(item);
        }
    }
    
    public void limpiar() throws Exception {
        listA.getItems().clear();
        listB.getItems().clear();
        listC.getItems().clear();
        listD.getItems().clear();
        listE.getItems().clear();
        listF.getItems().clear();
        listG.getItems().clear();
        listH.getItems().clear();
    }
    

    
    public void eliminarGrupo() throws Exception {
        String nombreGrupo = gruposRegistrados.getValue().toString();
        try {
            gGrupo.eliminarGrupo(nombreGrupo);
            opcionGrupos.getItems().add(nombreGrupo);
            gruposRegistrados.getItems().remove(nombreGrupo);
            limpiarLabels();
            actualizarLabelGrupos();
            aviso.setText("¡Grupo eliminado con éxito!");
        } catch (Exception ex) {
            aviso.setText(ex.getMessage());
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

    public void irAEquipos(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("RegistrarEquipos.fxml"));
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        opcionGrupos.getItems().addAll("Grupo A", "Grupo B", "Grupo C", "Grupo D", "Grupo E", "Grupo F", "Grupo G", "Grupo H");
        opcionGrupos.setValue("Seleccionar");
        try {
            actualizarListaGrupos();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        try {
            actualizarGruposRegistrados();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        try {
            actualizarLabelGrupos();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            llenarEquipos();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarA();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarB();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarC();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarD();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarE();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarF();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarG();
        }catch(Exception e) {
            e.getStackTrace();
        }
        try {
            actualizarH();
        }catch(Exception e) {
            e.getStackTrace();
        }
    }

}
