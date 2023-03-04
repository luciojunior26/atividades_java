package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return this.customsFee + getPrice();
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	

	@Override
	public String priceTag() {
		return getName() + 
				" (used) $ " + 
				totalPrice() + 
				" (Customs fee: " + 
				getCustomsFee() +
				")";
	}
	

}
