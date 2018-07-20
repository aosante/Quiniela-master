/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import cl.Usuario;
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
 *
 * @author andresosante
 */
public class LoginController implements Initializable {
    
    static GestorUsuario gUser = new GestorUsuario();

    @FXML
    private Label lblLogin;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtContrasena;
    @FXML
    private Label lblWarning;
//    @FXML
//    private Button loginBttn;
    
    
    

    public void Login(ActionEvent event) throws IOException {
        Usuario user = gUser.buscarUsuario(txtUsuario.getText());
        
        //if(txtUsuario.getText.equals(usuario.getNombreUsuario) && txtContrasena.getText().equals(usuario.getClave))
        if (txtUsuario.getText().equals(user.getNombreUsuario()) && txtContrasena.getText().equals(user.getClave())) {
            Parent root = FXMLLoader.load(getClass().getResource("LigasUsuario.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.hide();
            stage.setScene(scene);
            stage.show();
        } else {
            lblWarning.setText("Credenciales inválidas, por favor inténtelo de nuevo...");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}