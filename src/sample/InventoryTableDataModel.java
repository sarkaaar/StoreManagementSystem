package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InventoryTableDataModel {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty qty;
    private SimpleStringProperty unitPrice;

    public InventoryTableDataModel(String id, String name, String qty, String unitPrice) {
        this.id = new SimpleStringProperty(id);
        this.name = new SimpleStringProperty(name);
        this.qty = new SimpleStringProperty(qty);
        this.unitPrice = new SimpleStringProperty(unitPrice);
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getQty() {
        return qty.get();
    }


    public String getUnitPrice() {
        return unitPrice.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public void setQty(String qty) {
        this.qty.set(qty);
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice.set(unitPrice);
    }

    public StringProperty getIdProperty(){
        return id;
    }

    public StringProperty getNameProperty(){
        return name;
    }
    public StringProperty getQtyProperty(){
        return qty;
    }
    public StringProperty getunitPriceProperty(){
        return unitPrice;
    }

}
