package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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




    /*public class Database {

        public String DB_name = "data.db";
        public String CONNECTION_STRING = "jdbc:sqlite:D:\\StoreManagementSystem" + DB_name;
        public String TABLE_NAME = "inventory";
        public String ID_COLUMN = "id";
        public String NAME_COLUMN = "name";
        public String QUANTITY_COLUMN = "quantity";
        public String UNITPRICE_COLUMN = "unitprice";

        public void insertingInventory(String id, String name, String qty, String unitPrice) {
            try {
                Connection conn = DriverManager.getConnection(CONNECTION_STRING);
                Statement stat = conn.createStatement();

                stat.execute("CREATE TABLE IF NOT EXISTS" + TABLE_NAME +
                               "(" + ID_COLUMN + "text, " +
                                     NAME_COLUMN + "text, " +
                                     QUANTITY_COLUMN + "text, " +
                                     UNITPRICE_COLUMN + "text " +
                               ")");


                stat.execute("INSERT INTO " + TABLE_NAME +
                        "(" + ID_COLUMN + "," +
                              NAME_COLUMN + "," +
                              QUANTITY_COLUMN + "," +
                              UNITPRICE_COLUMN +
                        ")" +
                        "VALUES (" + id + "," + name + "," + qty + "," + unitPrice + ")");

                stat.close();
                conn.close();

            } catch (SQLException e) {
                *//*System.out.println("Connection Failed");*//*
                e.printStackTrace();
            }

        } */

}