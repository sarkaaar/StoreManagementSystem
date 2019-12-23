package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class AddNewItemController {

    Database database=new Database();

    @FXML
    public AnchorPane parent;
    @FXML
    public TextField id;
    @FXML
    public TextField name;
    @FXML
    public TextField qty;
    @FXML
    public TextField unitPrice;

    public void addToStock(){
        database.addInStock(id.getText(), name.getText(), qty.getText(), unitPrice.getText());
        id.clear();
        name.clear();
        qty.clear();
        unitPrice.clear();
    }

    @FXML
    public void home(ActionEvent e) throws IOException {
        AnchorPane child = FXMLLoader.load(getClass().getResource("Home.fxml"));
        parent.getChildren().setAll(child);
    }
}