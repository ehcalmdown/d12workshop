package sg.edu.nus.iss.day12lecture;

public class Item {
    private String itemName;
    private Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer i) {
        quantity = i;
    }

    public void setItemName(String n) {
        itemName = n;
    }

    public String getItemName(){
        return itemName;
    }
}
