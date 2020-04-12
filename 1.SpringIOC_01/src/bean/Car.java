package bean;

public class Car {
	private String CarName;
	private double price;
	private String color;
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Car() {
		super();
		System.out.println("car±»´´½¨");
	}
	public Car(String carName, double price, String color) {
		super();
		CarName = carName;
		this.price = price;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [CarName=" + CarName + ", price=" + price + ", color=" + color + "]";
	}
	
	
}
