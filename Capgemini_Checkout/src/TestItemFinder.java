import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;

import org.junit.Test;

public class TestItemFinder {

	private final int HASHMAP_SIZE = 2;
	private final String APPLE_NAME = "apple";
	private final String ORANGE_NAME = "orange";
	
	/***
	 * We have only 2 items.
	 */
	@Test
	public void testGetItemsSizeTwo() {
		ItemFinder itemFinder = ItemFinder.getInstance();		
		assertEquals(itemFinder.getItems().size(), HASHMAP_SIZE);
	}
	
	/**
	 * We return a string.
	 */
	@Test
	public void testGetItem() {
		ItemFinder itemFinder = ItemFinder.getInstance();		
		assertThat(itemFinder.getItem(APPLE_NAME), instanceOf(Item.class));
	}
	
	/***
	 * We have apples.
	 */
	@Test
	public void testApple() {
		ItemFinder itemFinder = ItemFinder.getInstance();			
		assertTrue(itemFinder.getItems().containsKey(APPLE_NAME));
	}
	
	/***
	 * We have oranges.
	 */
	@Test
	public void testOrange() {
		ItemFinder itemFinder = ItemFinder.getInstance();			
		assertTrue(itemFinder.getItems().containsKey(ORANGE_NAME));
	}
	
	/***
	 * We have the apple price.
	 */
	@Test
	public void testGetItemApple() {
		ItemFinder itemFinder = ItemFinder.getInstance();		
		assertEquals(itemFinder.getItem(APPLE_NAME), Item.APPLE);
	}
	
	/***
	 * We have the apple price.
	 */
	@Test
	public void testGetItemOrange() {
		ItemFinder itemFinder = ItemFinder.getInstance();		
		assertEquals(itemFinder.getItem(ORANGE_NAME), Item.ORANGE);
	}

}
