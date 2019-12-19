package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CreateNewBillController implements Initializable {
    @FXML
    public AnchorPane parent;
    @FXML
    private TableView<Item> table=new TableView<> ();
    @FXML
    private TableColumn<Item,String> id;
    @FXML
    private TableColumn<Item,String> name;
    @FXML
    private TableColumn<Item,Integer> qty;
    @FXML
    private TableColumn<Item,Integer> unitPrice;
    @FXML
    private TextField enterId;
    @FXML
    private TextField enterName;
    @FXML
    private TextField enterQty;
    @FXML
    private TextField enterUnitPrice;
    @FXML
    public void home(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("Home.fxml"));
        parent.getChildren().setAll(child);
    }

    ObservableList list = FXCollections.observableArrayList ();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory (new PropertyValueFactory<>("id"));
        name.setCellValueFactory (new PropertyValueFactory<> ("name"));
        qty.setCellValueFactory (new PropertyValueFactory<> ("qty"));
        unitPrice.setCellValueFactory (new PropertyValueFactory<> ("unitPrice"));
        table.setItems (list);
    }

    @FXML
    public void addToTable (ActionEvent event){
        list.add(new Item(enterId.getText(),
                enterName.getText(),
                Integer.parseInt(enterQty.getText()),
                Integer.parseInt(enterUnitPrice.getText())));
    }

    public class Item {
        private SimpleStringProperty id;
        private SimpleStringProperty name;
        private SimpleIntegerProperty qty;
        private SimpleIntegerProperty unitPrice;

        public Item(String id, String name, int qty, int unitPrice) {
            this.id = new SimpleStringProperty(id);
            this.name = new SimpleStringProperty(name);
            this.qty = new SimpleIntegerProperty(qty);
            this.unitPrice = new SimpleIntegerProperty(unitPrice);
        }

        public String getId() {
            return id.get();
        }

        public String getName() {
            return name.get();
        }

        public int getQty() {
            return qty.get();
        }

        public int getUnitPrice() {
            return unitPrice.get();
        }

        public void setId(String id) {
            this.id.set(id);
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public void setQty(int qty) {
            this.qty.set(qty);
        }

        public void setUnitPrice(int unitPrice) {
            this.unitPrice.set(unitPrice);
        }
    }
}
