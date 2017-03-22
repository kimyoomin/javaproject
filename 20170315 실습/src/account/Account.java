package account;

public class Account{
	private double money;
	
	public final String name;
		
	public Account(String name)
	{
		this.name=name;
	}
		
	public void credit(double x){
		money += x;
	};
		
	public void debit(double x){
		if (money<x){
			money=0;
		}else{
			money -= x;
		}
	};
	
	public double getmoney(){
		return money;
		
	}
	public void balance(){
		System.out.printf("%s balance: $%1f\n",name,getmoney());
	};
	
		
}	

