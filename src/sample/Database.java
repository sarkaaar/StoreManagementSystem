package sample;

import java.sql.*;

public class Database {

    Connection conn = null;
    ResultSet result;
    public void connectToDatabase() {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SARKAAAR\\Desktop\\database.db");
        }
        catch (SQLException e) {
            System.out.println("Connection Failed!!");
            e.printStackTrace();
        }
    }

    public void insertSales(String i, String n, String qty, String p) {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("CREATE TABLE IF NOT EXISTS sales" + "(id TEXT, name TEXT, quantity TEXT, price TEXT)");
            stat.execute("INSERT INTO sales (id, name, quantity, price)" + String.format(" VALUES ('%s','%s','%s','%s')", i, n, qty, p));
        }
        catch (SQLException e) {
            System.out.println("ERROR! Unable to insert in database");
            e.printStackTrace();
        }
    }

    public void addInStock(String i, String n, String qty, String p) {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("CREATE TABLE IF NOT EXISTS inventory" + "(id TEXT, name TEXT, quantity TEXT, price TEXT)");
            stat.execute("INSERT INTO inventory (id, name, quantity, price)" + String.format(" VALUES ('%s','%s','%s','%s')" , i, n, qty, p));
        }
        catch (SQLException e) {
            System.out.println("ERROR! Unable to add item in stock");
            e.printStackTrace();
        }
    }

    public ResultSet displayInventory() {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("SELECT * FROM inventory");
            ResultSet result = stat.getResultSet();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ResultSet displaySales() {
        try {
            connectToDatabase();
            Statement stat = conn.createStatement();
            stat.execute("SELECT * FROM sales");
            ResultSet result = stat.getResultSet();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}