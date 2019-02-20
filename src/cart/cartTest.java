package cart;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class cartTest {

	@Test
	public void testEmptyCartCreation() {
		ShoppingCart myCart= new ShoppingCart();
		Assert.assertEquals(0,myCart.getBookCount());
	}

	@Test
	public void testAddOneBook() {
		ShoppingCart myCart= new ShoppingCart();
        Book  myBook= new Book("Java Book",1,127);
        myCart.addBook(myBook);
        Assert.assertEquals(1,myCart.getBookCount());
        Assert.assertEquals(127,myCart.getTotalCartValue());
	}
	
	@Test
	public void addDifferentBookTest() {
		ShoppingCart myCart=new ShoppingCart();
		Book javaBook=new Book("Java Book",1,127);
		Book webDesignBook=new Book("Web Design Book",1,100);
		myCart.addBook(javaBook);
		myCart.addBook(webDesignBook);
		 Assert.assertEquals(2,myCart.getBookCount());
	     Assert.assertEquals(227,myCart.getTotalCartValue());

		
	}
}
