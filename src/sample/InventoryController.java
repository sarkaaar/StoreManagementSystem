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
import javafx.scene.layout.AnchorPane;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class InventoryController implements Initializable {


    Database data= new Database();
    ObservableList list;


    @FXML
    public AnchorPane parent;
    @FXML
    public TableView<InventoryTableDataModel> table;
    @FXML
    private TableColumn<InventoryTableDataModel,String> idCol;
    @FXML
    private TableColumn<InventoryTableDataModel,String> nameCol;
    @FXML
    private TableColumn<InventoryTableDataModel,String> qtyCol;
    @FXML
    private TableColumn<InventoryTableDataModel,String> priceCol;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        list= FXCollections.observableArrayList ();

        try{
            Connection conn= DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SARKAAAR\\Desktop\\database.db");
            Statement stat = conn.createStatement();
            stat.execute("SELECT * FROM inventory");
            ResultSet rs=stat.getResultSet();
            while(rs.next()){
                list.add(new InventoryTableDataModel(
                        rs.getString("id"),
                        rs.getString("name"),
                        rs.getString("quantity"),
                        rs.getString("price")
                ));


                idCol.setCellValueFactory(cellData -> cellData.getValue().getIdProperty());
                nameCol.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
                qtyCol.setCellValueFactory(cellData -> cellData.getValue().getQtyProperty());
                priceCol.setCellValueFactory(cellData -> cellData.getValue().getunitPriceProperty());
                table.setItems(list);


            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void home(ActionEvent e) throws IOException {
        AnchorPane child= FXMLLoader.load(getClass().getResource("Home.fxml"));
        parent.getChildren().setAll(child);
    }
}
