package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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

 /*   @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField quantity;
    @FXML
    private TextField unitPrice;
    @FXML
    private TableView myTable;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TableColumn idCol=new TableColumn("ID");
        TableColumn nameCol=new TableColumn("NAME");
        TableColumn qtyCol=new TableColumn("QUANTITY");
        TableColumn unitPriceCol=new TableColumn("PRICE");
        myTable.getColumns().addAll(idCol,nameCol,qtyCol,unitPriceCol);

        final ObservableList<Person> data=FXCollections.observableArrayList(
                new Person("1","Pepsi", 5, 80),

                new Person("2","Fanta", 7, 90),

                new Person("3","Sprite", 9, 100)
        );

        idCol.setCellFactory(new PropertyValueFactory<Person, String>("id"));
        nameCol.setCellFactory(new PropertyValueFactory<Person, String>("name"));
        qtyCol.setCellFactory(new PropertyValueFactory<Person, Integer>("qty"));
        unitPriceCol.setCellFactory(new PropertyValueFactory<Person, Integer>("unitPrice"));

        myTable.setItems(data);

    }

*/
    //@FXML
  //  public void button(ActionEvent event) {
      //  idCol.setCellValueFactory(new PropertyValueFactory<Person, String>("idd"));
       // nameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("namee"));
        //quantityCol.setCellValueFactory(new PropertyValueFactory<Person, String>("qty"));
       //unitPriceCol.setCellValueFactory(new PropertyValueFactory<Person, String>("unitPrice"));

        //data.add(new Person(id.getText(), name.getText(), quantity.getText(), unitPrice.getText()));
        //tableview.setItems(data);
    //}
}

   // @FXML
    //public void button(ActionEvent event){
    //list.add(new Person(id.getText(), name.getText(), Integer.parseInt(quantity.getText()), Integer.parseInt(unitPrice.getText())));
    //}
//}
