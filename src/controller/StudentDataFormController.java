package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.tm.StudentTM;

import java.io.IOException;
import java.net.URL;

public class StudentDataFormController {

    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXTextField txtId;
    public AnchorPane studentDataFormContext;

    public  void setData(StudentTM tm){
        txtId.setText(tm.getId());
        txtName.setText(tm.getName());
        txtContact.setText(tm.getContact());
        txtAddress.setText(tm.getAddress());

    }

    public void backToHomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/StudentForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) studentDataFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
