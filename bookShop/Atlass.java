package bookShop;

public class Atlass extends Book {
	protected String continent ;
	protected int yearOfPub;
	
	public Atlass(String prodName, double vat, double prodPrice, double sellPrice, String category, String title,
			String author, String continent, int yearOfPub) {
		super(prodName, vat, prodPrice, sellPrice, category, title, author);
		this.continent = continent;
		this.yearOfPub = yearOfPub;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getYearOfPub() {
		return yearOfPub;
	}
	public void setYearOfPub(int yearOfPub) {
		this.yearOfPub = yearOfPub;
	}
	
	@Override
	public void setProduct(String name, double num) {
		prodName = "Atlas";
		String target = name;
		vat = num;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Category : "+ category);
		System.out.println("product name : "+ prodName);
		System.out.println("Year of publishing : "+yearOfPub);
		System.out.println("About : "+continent);
		System.out.println("Price : "+getSellPrice());
		System.out.println("Published : "+Name+" "+Adress);
	}

}
