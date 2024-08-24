package bmt.taskmanageravanzato.Controller;

import bmt.taskmanageravanzato.model.DataSingleton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Accesso implements Initializable {

    @FXML
    private Button btn_accediGo;


    @FXML
    private PasswordField hiddentxtField_psw;

    @FXML
    private AnchorPane img_avatar2;

    @FXML
    private Label lbl_error;

    @FXML
    private TextField txtField_psw;

    @FXML
    private TextField txtField_username;


    DataSingleton data = DataSingleton.getInstance();

    @FXML
    void func_goPlayHome(MouseEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
