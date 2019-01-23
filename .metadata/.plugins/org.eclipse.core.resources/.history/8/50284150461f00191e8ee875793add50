import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/***
 * Checkout class, takes a list of items, represented as strings and calculates their total price.
 * @author Joseph Whitten
 *
 */
public class Checkout {

	private PriceFinder priceFinder;
	private ItemFinder itemFinder;
	private HashMap<Item, Integer> checkoutItems;
	private BigDecimal total;
	
	/***
	 * Checkout a list of item names.
	 * Instanciates the item and price finders.
	 * Tallys the items, then calculates their price.
	 * @param scannedItems An array list of item names.
	 */
	public Checkout(ArrayList<String> scannedItems) {
		this.priceFinder = PriceFinder.getInstance();
		this.itemFinder = ItemFinder.getInstance();
		this.checkoutItems = this.tallyItems(scannedItems);
		this.total = this.caluclateTotal(this.checkoutItems);
	}
	
	/***
	 * Tally each of the items into a hash map.
	 * Uses the itemfinder to map strings to items.
	 * @param list An arrayList of strings containing the Items.
	 * @return A hashmap of items to their total counts.
	 */
	public HashMap<Item, Integer> tallyItems(ArrayList<String> list) {
		
		HashMap<Item, Integer> checkoutItems = new HashMap<Item, Integer>();

		for(String itemName : list) {
		
			if(itemName.equals("q")) {
				break;
			}
			
			if(itemFinder.getItems().containsKey(itemName)) {
				Item item = itemFinder.getItem(itemName);
				if(!checkoutItems.containsKey(item)) {
					checkoutItems.put(item, 1);
				} else {
					checkoutItems.replace(item, checkoutItems.get(item) + 1);
				}
			}
		}
		
		return checkoutItems;
	}
	
	/**
	 * Calculate the total from the hashmap.
	 * Uses the pricefinder to get the price for each item. 
	 * @param items A hashmap of items to their counts.
	 * @return The total as a big decimal to two decimal places. 
	 */
	public BigDecimal caluclateTotal(HashMap<Item, Integer> items) {
		
		BigDecimal total = new BigDecimal(0);
		
		for(Item checkoutItem : checkoutItems.keySet()) {
			BigDecimal totalItemPrice = new BigDecimal(checkoutItems.get(checkoutItem)).multiply(priceFinder.getPrice(checkoutItem)).setScale(2, RoundingMode.HALF_UP);
			total = total.add(totalItemPrice);
		}
		
		return total;
	}
	
	/***
	 * Print the total.
	 */
	public void outputTotal() {
		System.out.println(this.total.toString());
	}

	/***
	 * Get the checkout item count hashmap.
	 * @return The hashmap.
	 */
	public HashMap<Item, Integer> getCheckoutItems() {
		return checkoutItems;
	}

	/***
	 * Get the total.
	 * @return The total as a big decimal.
	 */
	public BigDecimal getTotal() {
		return total;
	}
	
	
	
}
