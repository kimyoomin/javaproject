package account;

public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name,double price){
		this.name=name;
		this.price=price;
	}
	public double getprice(){
		return price;
	}
	@Override public double EstimateValue(int month){
		double firstprice=price*0.8;
		return firstprice*Math.pow(0.99,month);
	}
	
	@Override public String toString(){
		return String.format("Car name: %s", name);
	}
}
