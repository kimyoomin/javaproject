package account;

public class Human implements Valuable {
	private String name;
	private int age;
	public Human(String name,int age){
		this.name=name;
		this.age=age;
	}
	public int getage(){
		return age;
	}
	
	@Override public double estimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	
	@Override public double estimateValue(){
		return estimateValue(1);
	}
	
	@Override public String toString(){
		return String.format("Car name: %s", name);
	}
}
