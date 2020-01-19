package model;

public class RecSupplies extends ProSupplies {
	private int size;
	RecSupplies(){
	
		
	}
	public RecSupplies(String name, double weight, int price, int quantity, int size){
		/*this.name = name;
		this.weight=weight;
		this.price=price;
		this.quantity=quantity;*/
		super(name, weight, price, quantity);
		this.size=size;
	}
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	//RecSupplies recSupplies = new RecSupplies();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RecSupplies [name=" + getName() + ", weight=" + getWeight() + ", price=" + getPrice() + ", quantity=" + getQuantity() + ", size=" + size + "]";
	}
	
}
