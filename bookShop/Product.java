package bookShop;

public class Product {
	
protected String prodName;
protected double vat;
protected double prodPrice;
protected double sellPrice;
protected String category;

public Product(String prodName, double vat, double prodPrice, double sellPrice, String category) {
	super();
	this.prodName = prodName;
	this.vat = vat;
	this.prodPrice = prodPrice;
	this.sellPrice = sellPrice;
	this.category = category;
}

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public double getVat() {
	return vat;
}

public void setVat(double vat) {
	this.vat = vat;
}

public double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(double prodPrice) {
	this.prodPrice = prodPrice;
}

public double getSellPrice() {
	return sellPrice;
}

public void setSellPrice(double sellPrice) {
	this.sellPrice = sellPrice;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

}
