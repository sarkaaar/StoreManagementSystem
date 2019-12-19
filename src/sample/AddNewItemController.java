package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AddNewItemController {

    @FXML
    public AnchorPane parent;

    @FXML
    public void home(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("Home.fxml"));
        parent.getChildren().setAll(child);
    }
}
