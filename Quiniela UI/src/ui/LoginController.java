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
import java.util.TreeMap;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;


/**
 *
 * @author andresosante
 */
public class LoginController implements Initializable {
    
    static GestorUsuario gUser = new GestorUsuario();

    
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtContrasena;
    @FXML
    private Label lblWarning;
    
   
    

    public void Login(ActionEvent event) throws Exception {
        TreeMap user = gUser.buscarUsuario(txtUsuario.getText());
           
        if (txtUsuario.getText().equals(user.get("nombreUsuario"))&& txtContrasena.getText().equals(user.get("clave"))) {
            Parent root = FXMLLoader.load(getClass().getResource("LigasUsuario.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.hide();
            stage.setScene(scene);
            stage.show();
        } else if(txtUsuario.getText().equals("admin") && txtContrasena.getText().equals("admin")) {
            //redigir a la primer vista del administrador, que es 
        } else {
            lblWarning.setText("Credenciales inválidas, \n\npor favor inténtelo de nuevo...");
        }
    }
    
   public void registrarUsuario(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("RegistroUsuario.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.hide();
            stage.setScene(scene);
            stage.show();
   }
   
   public void limpiar(KeyEvent event) throws IOException {
       lblWarning.setText("");
   } 

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
