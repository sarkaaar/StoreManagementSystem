package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
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

public class Controller implements Initializable {

    @FXML
    private AnchorPane parent;
    @FXML
    private TableView<Std> tbl=new TableView<> ();

    @FXML
    private TableColumn<Std,String> id;
    @FXML
    private TableColumn<Std,String> name;
    @FXML
    private TextField enterId;
    @FXML
    private TextField enterName;



    ObservableList list =FXCollections.observableArrayList (
    );


    @Override
    public void initialize (URL location, ResourceBundle resources) {

        id.setCellValueFactory (new PropertyValueFactory<> ("id"));
        name.setCellValueFactory (new PropertyValueFactory<> ("name"));
        tbl.setItems (list);

    }



    public class Std{
        SimpleStringProperty name;
        SimpleStringProperty id;


        public Std(String name,String id)
        {
            this.name=new SimpleStringProperty (name);
            this.id=new SimpleStringProperty (id);
        }

        public String getName() {
            return name.get();
        }

        public String getId() {
            return id.get();
        }

        public StringProperty nameProperty(){return name;}
        public StringProperty idProperty(){return id;}
    }

    @FXML
    public void onClick(ActionEvent e){
        Std abc= new Std(enterName.getText(),enterId.getText());
        tbl.getItems().add(abc);
    }

    @FXML
    public void loadSecond(ActionEvent event) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("newbill.fxml"));
        parent.getChildren().setAll(child);

    }
}
