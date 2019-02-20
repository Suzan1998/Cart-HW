import java.util.List;
import java.util.ArrayList;
//Main Class

public class ShoppingCart {
	private List<Book> BookList= new ArrayList<>();
	private int totalCartValue;
public int getBookCount() {
	return BookList.size();
}
public void addBook( Book book) {
	BookList.add(book);
}
public int getTotalCartValue() {
	if (BookList.size()>0) {
		for(Book book: BookList) {
			totalCartValue= totalCartValue+ book.getBookPrice();
		}
	}
	return totalCartValue;
	//done 
}
}


