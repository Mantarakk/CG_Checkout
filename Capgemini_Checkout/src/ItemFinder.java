import java.util.HashMap;

/***
 * A singleton class for finding the Item of a corresponding item name.
 * @author Joseph Whitten.
 *
 */
public class ItemFinder {
	
	private static ItemFinder singletonInstance = null; 

	//The mapping.
    private HashMap<String, Item> items = new HashMap<String, Item>(); 
    
    //valid names.
    private final String APPLE_NAME = "apple"; 
    private final String ORANGE_NAME = "orange"; 
    
    /***
     * Create the mapping.
     */
    private ItemFinder() 
    { 
        items.put(APPLE_NAME, Item.APPLE);
        items.put(ORANGE_NAME, Item.ORANGE);
    } 
  
    /***
     * Static method to create instance of Singleton class.
     * @return The Item finder.
     */
    public static ItemFinder getInstance() 
    { 
        if (singletonInstance == null) 
        	singletonInstance = new ItemFinder(); 
  
        return singletonInstance; 
    }

    /***
     * Get the item mapping.
     * @return The item hash map.
     */
	public HashMap<String, Item> getItems() {
		return items;
	}
	
	/***
	 * Get an item given an item name.
	 * @param name
	 * @return The item enum constant.
	 */
	public Item getItem(String name){
		return items.get(name);
	}

}