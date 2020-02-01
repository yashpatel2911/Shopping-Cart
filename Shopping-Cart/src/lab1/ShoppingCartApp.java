/**
 * 
 *  This is the main application file to run Shopping Cart Application 
 *  which has a shopping menu for the items to add an item to the shopping cart,
 *  Display cart items with exit option.
 *  
 *  @author yash_killerboy
 *  @version 1.0
 *  @since 2020-01-16
 *  
 */

package lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ShoppingCartApp
{

	static Item i1,i2,i3,i4,i5,i6;  // Item references
	static HashMap<Integer, Item> h;  // HashMap for Storing Items
	static Scanner s;  // User Input
	static int option;
	static ShoppingCart sh;  // Shopping Cart Object
	
	public static void showItems()
	{
		ArrayList<Item> itemList =new ArrayList<Item>(h.values());
		Collections.sort(itemList);
		System.out.println("******List of Items******");
		for(Item i1: itemList)  // sorting itemList using comparable
		{
			System.out.println(i1);
		}
	}
	
	public static void main(String[] args) 
	{
		sh = new ShoppingCart();  // Shopping Cart object
		
		s = new Scanner(System.in);
		
		i1 = new Book(200, "Java", "Mcgrawhill");
		i2 = new Book(300, "Data Structure", "Time Publisher");
		i3 = new Book(100, "Database Management System", "Kobti");
		
		i4 = new GiftCard(50, "Black", "BlackFriday");
		i5 = new GiftCard(75, "Pink", "BoxingDay");
		i6 = new GiftCard(50, "Violet", "CyberMonday");
		
		h = new HashMap<Integer, Item>();
		h.put(i1.id, i1);
		h.put(i2.id, i2);
		h.put(i3.id, i3);
		h.put(i4.id, i4);
		h.put(i5.id, i5);
		h.put(i6.id, i6);
		
		System.out.println("******** Menu for shopping ********");
		System.out.println(" 1. Display all the Items by price");
		System.out.println(" 2. Add Item to shopping cart");
		System.out.println(" 3. Show Cart Items");
		System.out.println(" 4. Exit");
		
		option = s.nextInt();  // getting input from User
		
		while(true)
		{						
			if(option==1)
			{	
				showItems();				
			}
			else if ( option == 2 )
			{
				showItems();
				
				System.out.println("\nEnter 0 for Exit or a Vaild ID of Item.");
			
				option = s.nextInt();
			
				while(option > 0)
				{
					sh.addItem(h, option);
					option = s.nextInt();
				}
			}
			else if(option==3)
				sh.showItem();
			else
			{
				System.out.println("Bye");
				break;
			}
			
			System.out.println("******** Menu for shopping ********");
			System.out.println(" 1. Display all the Items by price");
			System.out.println(" 2. Add Item to shopping cart");
			System.out.println(" 3. Show Cart Items");
			System.out.println(" 4. Exit");
			
			option = s.nextInt();
			}
		s.close();
	}	
}	