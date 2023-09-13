package Backstage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private Date manufactureDate;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufactureDate, SimpleDateFormat sdf) {
		super(name, price);
		this.manufactureDate = manufactureDate;
		this.sdf = sdf;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	@Override
	public String priceTag() {
		return name + " (used) $ " + price + ( " Manufacture date: " + sdf.format(manufactureDate));
	}
}
