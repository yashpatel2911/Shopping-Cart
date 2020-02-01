/**
 * 
 * Shopping Cart for adding and displaying Cart Items which are consumer desired.
 * @author yash_killerboy
 * @version 1.0
 * @since 2020-1-16
 * 
 */

package lab1;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart
{
	
	HashMap<Integer, Item> cartItems = new HashMap<Integer, Item>();  // Storing Items which is selected by customer in a HashMap.
	
	/**
	 * 
	 * addItem() function which is used to add Items selected by consumer
	 * and its function is to take id of Item and add it to cartItems.
	 * @param l
	 * @param option
	 * 
	 */
	
	public void addItem(HashMap<Integer, Item> l, int option)
	{
		if(l.containsKey(option))  // Checking Item id entered by user wether it is presen or not in cartItem
		{
			this.cartItems.put(option, l.get(option));  // adding Item into Cart
		}
		else
		{
			System.out.println("You entered wrong Item.");
		}
	}
	
	/**
	 * 
	 * Displaying the Items which is entered by consumer.
	 * 
	 */
	
	public void showItem()
	{
		if(!cartItems.isEmpty())  // Checking the cart is empty or not.
		{
			for(Map.Entry<Integer, Item> hashEntry : cartItems.entrySet())
				System.out.println(hashEntry.getValue());
		}
		else
			System.out.println("The cart is Empty");
	}
	/*public boolean isItemAvailable(HashMap<Integer, Item> l, int option)
	{
		for (Map.Entry<Integer, Item> hashElement : l.entrySet()) 
		 { 
			 if( option == (int)hashElement.getKey())
			 {
				 return true;
			 }
		 }
		return false;
	}*/
	
}
