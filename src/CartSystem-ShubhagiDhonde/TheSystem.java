package cartSystemExample;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();
        //Fill the code here
        if(getClass().getSimpleName().equals("AppSystem")) {
        	
			try {
				//data = new String(Files.readAllBytes(Paths.get("C:\\Users\\Student.DESKTOP-Q29NSH0\\Documents\\Java_Assign", "/Cart_Assignment/src/cartSystemExample/sample.txt")));
				File toRead=new File("sample.txt");
				Scanner readFile=new Scanner(toRead);
				while(readFile.hasNextLine()) {
				String line=readFile.nextLine();
				String[] lines = line.split("\\s{2,}");

				Item item =new Item(lines[0],lines[1],Double.parseDouble(lines[2]),Integer.parseInt(lines[3]),Integer.parseInt(lines[3]) ); 
        		       		
        		itemCollection.put(lines[0], item);
				}
	        	for(Map.Entry<String,Item>m:itemCollection.entrySet()){
	        	
	        		System.out.println(m.getValue().getItemName()+"  "+m.getValue().getItemDesc()+"  "+m.getValue().getItemPrice()+"  "+m.getValue().getAvailableQuantity());
	        	readFile.close();
	        	}
//	        	
//	        		
//	        		
//	        	}
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
      //Fill the code here
    	
    	HashMap<String, Item> newIC = itemCollection;
    	
//    	for(Item item : itemCollection.values()) {
//    		itemCollection.put(item.getItemName(), item);
//    	}
    	return newIC;
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
      //Fill the code here
    	this.itemCollection = copy;
    	
//    	for( Item item : copy.values()) {
//    		itemCollection.put(item.getItemName(), item);
//    	}
    }
    
    public Boolean add(Item item) {
      //Fill the code here
    	//HashMap<String,Item>itemCollection1=getItemCollection();
    	
    	if(itemCollection.containsKey(item.getItemName()))
    	{
    		item.setQuantity(item.getQuantity() + 1);
    	}
    	else {
    		itemCollection.put(item.getItemName(),item);
    	}
    	return true;
    }
    
    
    public Item remove(String itemName) {
        Item item = null;
        if(itemCollection.containsKey(itemName)) {
        	item = itemCollection.get(itemName);
        	itemCollection.remove(itemName);
        }
		return item;
    }
    public Boolean checkAvailability(Item item, Integer current) {
      for (int i = 0; i <= itemCollection.size(); i++){
    	  if (item.getItemName() == item.getItemName()) {
    		  current = current + 1;
    	  }
      }
    	  
    	  
    	if((item.getQuantity() + current) > item.getAvailableQuantity()) {
    		System.out.println("Systen is unavailable to add");
    		System.out.println((item.getQuantity() + current) + " " + item.getItemName());
    		return false;
    	} else {
    		return true;
    	}
    }
//    boolean bool1 = true;
//   
//    return bool1;

}