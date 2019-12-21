package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

    Connection conn=null;

    public void connectToDatabase(){
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:D:\\StoreManagementSystem\\data.db");
        } catch (SQLException e) {
            System.out.println("Connection Failed!!");
            e.printStackTrace();
        }
    }

    public void insertSales(String i, String n, String qty, String p) {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("CREATE TABLE IF NOT EXISTS sales" + "(id TEXT, name TEXT, quantity TEXT, price TEXT)");
            stat.execute("INSERT INTO sales (id, name, quantity, price)" +

                    String.format(" VALUES ('%s','%s','%s','%s')"
                            , i, n, qty, p));
            /*"VALUES(i, n, qty, p)");*/
        } catch (SQLException e) {
            System.out.println("ERROR! Unable to insert in database");
            e.printStackTrace();
        }
    }

    public void addInStock(String i, String n, String qty, String p) {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("CREATE TABLE IF NOT EXISTS inventory" + "(id TEXT, name TEXT, quantity TEXT, price TEXT)");

            stat.execute("INSERT INTO inventory (id, name, quantity, price)" +

                    String.format(" VALUES ('%s','%s','%s','%s')"
                            , i, n, qty, p));
            /*"VALUES(i, n, qty, p)");*/
        } catch (SQLException e) {
            System.out.println("ERROR! Unable to add item in stock");
            e.printStackTrace();
        }
    }
}





/*
package sample;

import javax.print.attribute.standard.MediaSize;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

*/
/*public class Database {

    public String DB_name="data.db";
    public String CONNECTION_STRING="jdbc:sqlite:D:\\StoreManagementSystem"+DB_name;
    public String TABLE_NAME="inventory";
    public String ID_COLUMN="id";
    public String NAME_COLUMN="name";
    public String QUANTITY_COLUMN="quantity";
    public String UNITPRICE_COLUMN="unitprice";

    public void insertingInventory(String id, String name, Integer qty, Integer unitPrice){
        try{
            Connection conn= DriverManager.getConnection(CONNECTION_STRING);
            Statement stat=conn.createStatement();

            stat.execute("INSERT INTO "+TABLE_NAME+
                            "(" + ID_COLUMN + "," +
                             NAME_COLUMN + "," +
                             QUANTITY_COLUMN + "," +
                             UNITPRICE_COLUMN +
                            ")" +
                             "VALUES (" + id + "," + name + "," + qty + "," + unitPrice + ")");

        } catch (SQLException e) {
            *//*
*/
/*System.out.println("Connection Failed");*//*
*/
/*
            e.printStackTrace();
        }
    }*//*
*/
/*    public void insertIntoInventory(){
        try{
            databaseConnection();
            Statement stat= conn.createStatement();
        }
    }*//*
}
*/
