package bookShop;

public class Journal extends Product implements Publisher {

	private String title;
	private int numPages;
	private String targetGroup;
	
	public Journal(String prodName, double vat, double prodPrice, double sellPrice, String category, String title,
			int numPages, String targetGroup) {
		super(prodName, vat, prodPrice, sellPrice, category);
		this.title = title;
		this.numPages = numPages;
		this.targetGroup = targetGroup;
	}
	
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public String getTargetGroup() {
		return targetGroup;
	}

	public void setTargetGroup(String targetGroup) {
		this.targetGroup = targetGroup;
	}

	@Override
	public void setProduct(String name, double num) {
		prodName = "Journal";
		String target = name;
				vat = num;
		
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("Category : "+ category);
		System.out.println("product name : "+ prodName);
		System.out.println("Title : "+title);
		System.out.println("Num. pages : "+numPages);
		System.out.println("Price : "+getSellPrice());
		System.out.println("Published by : "+Name+" ; "+Adress);
		
	}
	
	
	
	
}
