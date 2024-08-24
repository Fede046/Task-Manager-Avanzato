package bmt.taskmanageravanzato;

import bmt.taskmanageravanzato.model.DataSingleton;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloApplication extends Application  {

    DataSingleton data = DataSingleton.getInstance();
    @Override
    public void start(Stage stage) throws IOException {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/bmt/taskmanageravanzato/fxml/accesso.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900.0, 600.0);
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
    }

    public static void main(String[] args) {

        launch();
    }

}