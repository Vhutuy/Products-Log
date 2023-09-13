package Backstage;

public class ImportedProduct extends Product {
	
	private double customsfee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, double customsfee) {
		super(name, price);
		this.customsfee = customsfee;
	}

	public double getCustomsfee() {
		return customsfee;
	}

	public void setCustomsfee(double customsfee) {
		this.customsfee = customsfee;
	}
	
	public double totalPrice(double customsfee) {
		return price + customsfee;
	}
	
	@Override
	public String priceTag() {
		return name + " $ " + totalPrice(customsfee) + " (Customs fee: " + customsfee + ")";
	}
	
	

}
