package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class HomeController {

    @FXML
    public AnchorPane parent;

    @FXML
    public void createNewBill(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("CreateNewBill.fxml"));
        parent.getChildren().setAll(child);
    }

    @FXML
    public void addNewItem(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("AddNewItem.fxml"));
        parent.getChildren().setAll(child);
    }

    @FXML
    public void inventory(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("Inventory.fxml"));
        parent.getChildren().setAll(child);
    }

    @FXML
    public void viewSales(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("ViewSales.fxml"));
        parent.getChildren().setAll(child);
    }

    @FXML
    public void about(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("About.fxml"));
        parent.getChildren().setAll(child);
    }
}
