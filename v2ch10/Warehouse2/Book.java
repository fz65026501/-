/**
 * A book is a product with an ISBN number.
 * @version 1.0 2007-10-09
 * @author Cay Horstmann
 */
package v2ch10.Warehouse2;
public class Book extends Product
{
   public Book(String title, String isbn, double price)
   {
      super(title, price);
      this.isbn = isbn;
   }
   
   public String getDescription()
   {
      return super.getDescription() + " " + isbn;
   }
   
   private String isbn;
}
