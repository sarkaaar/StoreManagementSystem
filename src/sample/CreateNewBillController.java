package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateNewBillController implements Initializable {

    Database database=new Database();
    ObservableList list = FXCollections.observableArrayList ();

    @FXML
    public AnchorPane parent;
    @FXML
    private TableView<ReceiptTableDataModel> table;
    @FXML
    private TableColumn<ReceiptTableDataModel,String> id;
    @FXML
    private TableColumn<ReceiptTableDataModel,String> name;
    @FXML
    private TableColumn<ReceiptTableDataModel,Integer> qty;
    @FXML
    private TableColumn<ReceiptTableDataModel,Integer> unitPrice;
    @FXML
    private TextField enterId;
    @FXML
    private TextField enterName;
    @FXML
    private TextField enterQty;
    @FXML
    private TextField enterUnitPrice;
    @FXML
    private Button add;



    @FXML
    public void home(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("Home.fxml"));
        parent.getChildren().setAll(child);
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

/*        if (
                (enterId.getText().isEmpty() || enterId.getText().trim().isEmpty())  ||
                        (enterName.getText().isEmpty() || enterName.getText().trim().isEmpty())  ||
                        (enterQty.getText().isEmpty() || enterQty.getText().trim().isEmpty())  ||
                        (enterUnitPrice.getText().isEmpty() || enterUnitPrice.getText().trim().isEmpty())
        ){
            add.setDisable(true);
        }
 */






        id.setCellValueFactory (new PropertyValueFactory<>("id"));
        name.setCellValueFactory (new PropertyValueFactory<> ("name"));
        qty.setCellValueFactory (new PropertyValueFactory<> ("qty"));
        unitPrice.setCellValueFactory (new PropertyValueFactory<> ("unitPrice"));
        table.setItems (list);
    }

    @FXML
    public void addToTable (ActionEvent event){
        list.add(new ReceiptTableDataModel(enterId.getText(),
                enterName.getText(),
                Integer.parseInt(enterQty.getText()),
                Integer.parseInt(enterUnitPrice.getText())));

        database.insertSales(enterId.getText(), enterName.getText(), enterQty.getText(), enterUnitPrice.getText());
        enterId.clear();
        enterName.clear();
        enterQty.clear();
        enterUnitPrice.clear();

    }
}