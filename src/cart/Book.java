package cart;

public class Book {
private String bookName;
private int bookCount;
private int bookPrice;

public Book(String bname,int bcount,int bprice) {
	this.bookName=bname;
	this.bookCount=bcount;
	this.bookPrice=bprice;

}
public String getBookName() {
	return bookName;
}
public void setBookName(String bname) {
	this.bookName=bname;
}

public int getBookCount() {
	return bookCount;
}
public void setBookCount(int bcount) {
	this.bookCount=bcount;
}

public int getBookPrice() {
	return bookPrice;
}
public void setBookPrice(int bprice) {
	this.bookPrice=bprice;
}

}
