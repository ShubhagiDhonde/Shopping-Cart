package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
    	
    	Item it = new Item();
    	HashMap<String, Item> current2 = getItemCollection();
    	
    	double subtotal = 0;
    	double tax = 0;
    	double total = 0;
    	
    	for (Map.Entry<String, Item> m : current2.entrySet()) {
    		 it = m.getValue();
    	 
        System.out.println(it.getItemName() + " " 
         			  + it.getItemDesc() + " "
         			  + it.getItemPrice()
         			  + " " + it.getQuantity());
    	
         	   subtotal = it.getItemPrice() * it.getQuantity();
         	   tax = subtotal * 0.05;
         	   total = subtotal + tax;
       	 }
    	System.out.println("Subtotal : " + subtotal);
    	System.out.println("Tax : " + tax);
    	System.out.println("Total : " + total);
    
    }
}
    
//3. display cart
//5. Remove item from Cart


 