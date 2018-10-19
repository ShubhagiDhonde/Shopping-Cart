package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {
    }
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
        for (Map.Entry<String, Item> m : current.entrySet()) {
      	  System.out.println(m.getValue().getItemName() + " " 
      			  + m.getValue().getItemDesc() + 
      			  + m.getValue().getItemPrice()
      			  + " " + m.getValue().getAvailableQuantity());}
            }
        public Boolean add(Item item) {
      	
      	HashMap<String, Item > itemCollect2 = getItemCollection();
      	
      if (itemCollect2.containsKey(item.getItemName())) {
      	
    	  item.setQuantity(item.getQuantity() + 1);
      	}
      else {
      		itemCollect2.put(item.getItemName(), item);
      	}
      return true;
      }
  }
