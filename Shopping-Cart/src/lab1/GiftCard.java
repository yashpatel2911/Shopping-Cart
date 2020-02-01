/**
 * 
 * GiftCard class extended by Item and also have more properties such as Description and Color.
 * @author yash_killerboy
 * @version 1.0
 * @since 2020-01-16
 * 
 */


package lab1;

public class GiftCard extends Item
{
	
	/**
	 * 
	 * Book constructor which is used for assigning values.
	 * @param a
	 * @param b
	 * @param c
	 * 
	 */
	
	GiftCard(int a, String b, String c)
	{
		this.price = a;
		this.description = b;
		this.color = c;
	}
	
	private String description;  // GiftCard Description
	private String color;  // Color of GiftCard
	
	/**
	 * 
	 * Overriding toString() Method for printing GiftCard
	 * 
	 */
	
	public String toString()
	{
		return   "GiftCard\t\t"+this.id
				+"\t"+this.description
				+"\t\t\t\t"+this.color
				+"\t\t"+this.price;
	}
}
