package ex2.model.domain;

public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Product() {
	}

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Product [name=");
		sb.append(name);
		sb.append(", price=");
		sb.append(price).append("]");
		return sb.toString();
	}
}
