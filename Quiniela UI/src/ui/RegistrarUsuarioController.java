/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import gestores.GestorUsuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author andresosante
 */
public class RegistrarUsuarioController implements Initializable {
    
    static GestorUsuario gUser = new GestorUsuario();

    
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtCorreo;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtEquipo;
    @FXML
    private TextField txtClave;

    @FXML
    private Label lblWarning;
    
  public void salir(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
    }
        

        
        public void registrarUsuario(ActionEvent event) throws Exception {
        String nombre, apellidos, correo, nombreUsuario, clave;
        byte[] avatar = null;
        String equipoFavorito;
        boolean camposVacios = false;
        
        nombre = txtNombre.getText();
        apellidos = txtApellidos.getText();
        correo = txtCorreo.getText();
        nombreUsuario = txtUsuario.getText();
        equipoFavorito = txtEquipo.getText();
        if (nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || nombreUsuario.isEmpty() || equipoFavorito.isEmpty()) {
            camposVacios = true;
        }
        clave = txtClave.getText();
        if (clave.length() < 6 || clave.length() > 8) {
            lblWarning.setText("ERROR: La contraseña debe tener un mínimo de 6 caracteres y un máximo de 8 caracteres.");
            return;
        } 
        if (camposVacios) {
            lblWarning.setText("ERROR: Existen campos vacíos. Por favor inténtelo de nuevo");
            return;
        } 
        try {
            gUser.registrarUsuarios(nombre, apellidos, correo, nombreUsuario, equipoFavorito, clave, avatar);
             Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.hide();
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
            e.printStackTrace();
            lblWarning.setText("ERROR: Ya existe un usuario registrado bajo ese nombre de usuario");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
