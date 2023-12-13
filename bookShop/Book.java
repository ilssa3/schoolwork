package bookShop;

public class Book extends Product implements Publisher{
	
	protected String title;
	protected String author;

	public Book(String prodName, double vat, double prodPrice, double sellPrice, String category, String title,
			String author) {
		super(prodName, vat, prodPrice, sellPrice, category);
		this.title = title;
		this.author = author;
	}
	
	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public void setProduct(String name, double num) {
		prodName = "Book";
		String target = name;
		vat = num;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Category : "+ category);
		System.out.println("product name : "+ prodName);
		System.out.println("Title : "+title);
		System.out.println("Author(Written by) : "+author);
		System.out.println("Price : "+getSellPrice());
		System.out.println("Published : "+Name+" "+Adress);
	}

}
