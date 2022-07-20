package sg.edu.nus.iss.day12lecture;

import java.util.ArrayList;
import java.util.List;

public class CartService {

    public List<Item> getShoppingItems(){

        List<Item> listItems = new ArrayList<>();
        Item item = new Item();
        item.setItemName("cheese");
        item.setQuantity(5);
        listItems.add(item);

        item = new Item();
        item.setItemName("white cheese");
        item.setQuantity(2);
        listItems.add(item);

        item = new Item();
        item.setItemName("blue cheese");
        item.setQuantity(3);
        listItems.add(item);

        item = new Item();
        item.setItemName("brown cheese");
        item.setQuantity(7);
        listItems.add(item);

        return listItems;
    }

}
