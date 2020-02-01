/**
 * 
 * Book class extended by Item and also have more properties such as Title and Author.
 * @author yash_killerboy
 * @version 1.0
 * @since 2020-01-16
 * 
 */

package lab1;

public class Book extends Item
{
	
	/**
	 * 
	 * Book constructor which is used for assigning values.
	 * @param a
	 * @param b
	 * @param c
	 * 
	 */
	
	Book(int a, String b, String c)
	{
		this.price = a;
		this.title = b;
		this.author = c;
		
	}
	
	private String title;  // Book Title
	private String author; // Book Author
	
	/**
	 * 
	 * Overriding toString() Method for printing Book 
	 * 
	 */
	
	public String toString()
	{
		return   "Book\t\t"+this.id
				+"\t"+this.title
				+"\t\t\t\t"+this.author
				+"\t\t"+this.price;
	}
	
}