/**
 * 
 * This is Item class which is abstract class that be extended by Book, GiftCard, etc.
 * containing id of Item and price of Item.
 * 
 * @author yash_killerboy
 * @version 1.0
 * @since 2020-01-06
 * 
 */



package lab1;

public abstract class Item implements Comparable<Item>
{
	private static int increment = 0;  // Increment is used for generating unique ID for Items.
	protected int id;  // Unique Identification
	protected int price;  // Item Price
	
	/**
	 * 
	 * Item() constructor which is used for generating unique Identification for Items.
	 * 
	 */
	
	Item()
	{
		increment += 1;
		id = increment;
	}
	
    
	/**
	 * 
	 * Overriding the compareTo() function which is implemented from Comparable interface.
	 * @param Item i
	 * @return Integer
	 * 
	 */
	
    public int compareTo(Item i)
    {
    	return this.price-i.getPrice();
    }
    
    /**
     * 
     * Getting the price of the Item. 
     * @return price in Integer.
     * 
     */
    
    public int getPrice()
    {
    	return this.price;
    }

}
