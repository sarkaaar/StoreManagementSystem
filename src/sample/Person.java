package sample;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleIntegerProperty qty;
    private SimpleIntegerProperty unitPrice;

    public Person(String id, String name, int qty, int unitPrice) {
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
